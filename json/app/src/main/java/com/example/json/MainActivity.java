package com.example.json;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private String TAG = MainActivity.class.getSimpleName();                        //?

    private ProgressDialog pDialog;
    private ListView lv;

    // URL to get contacts JSON
    private static String url = "https://api.myjson.com/bins/x57t9";

    ArrayList<HashMap<String, String>> contactList;                     //8 ?

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactList = new ArrayList<>();                                //9

        lv = (ListView) findViewById(R.id.list);

        new GetContacts().execute();                            //10?
    }


    private class GetContacts extends AsyncTask<Void, Void, Void> {             //11

        @Override
        protected void onPreExecute() {                         //12
            super.onPreExecute();

            pDialog = new ProgressDialog(MainActivity.this);                //13
            pDialog.setMessage("Please wait...");
            pDialog.setCancelable(false);                           //14
           // pDialog.show();

        }

        @Override
        protected Void doInBackground(Void... arg0) {
            HttpHandler sh = new HttpHandler();                 //15

            // Making a request to url and getting response
            String jsonStr = sh.makeServiceCall(url);           //16  17->http file

            Log.e(TAG, "Response from url: " + jsonStr);        //21

            if (jsonStr != null) {
                try {
                    JSONObject jsonObj = new JSONObject(jsonStr);           //22

                    // Getting JSON Array node
                    JSONArray contacts = jsonObj.getJSONArray("contacts");      //23

                    // looping through All Contacts
                    for (int i = 0; i < contacts.length(); i++) {
                        JSONObject c = contacts.getJSONObject(i);
                        String id = c.getString("id");
                        String name = c.getString("name");
                        String username = c.getString("username");
                        String email = c.getString("email");
                        String website = c.getString("website");
                        String phone = c.getString("phone");

                        // Phone node is JSON Object
                        JSONObject add = c.getJSONObject("address");
                        String Street = add.getString("street");
                        String suite = add.getString("suite");
                        String city = add.getString("city");
                        String zipcode = add.getString("zipcode");

                        //geo location
                        JSONObject geo = add.getJSONObject("geo");
                        String lat = geo.getString("lat");
                        String lng = geo.getString("lng");
                        // company
                        JSONObject company = c.getJSONObject("company");
                        String catchPhrase = company.getString("catchPhrase");
                        String bs = company.getString("bs");

                        // tmp hash map for single contact
                        HashMap<String, String> contact = new HashMap<>();

                        // adding each child node to HashMap key => value
                        contact.put("id", id);
                        contact.put("name", name);
                        contact.put("email", email);
                        contact.put("mobile", phone);
                        contact.put("username", username);

                        // adding contact to contact list
                        contactList.add(contact);
                    }
                } catch (final JSONException e) {
                    Log.e(TAG, "Json parsing error: " + e.getMessage());
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(getApplicationContext(),
                                    "Json parsing error: " + e.getMessage(),
                                    Toast.LENGTH_LONG)
                                    .show();
                        }
                    });

                }
            } else {
                Log.e(TAG, "Couldn't get json from server.");
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        Toast.makeText(getApplicationContext(),
                                "Couldn't get json from server. Check LogCat for possible errors!",
                                Toast.LENGTH_LONG)
                                .show();
                    }
                });

            }

            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            ProgressBar progressBar=(ProgressBar)findViewById(R.id.pgb);
            super.onPostExecute(result);
            // Dismiss the progress dialog
            if (pDialog.isShowing())
                pDialog.dismiss();
            if(progressBar.isShown())
                progressBar.setVisibility(View.GONE);


            /**
             * Updating parsed JSON data into ListView
             * */
            ListAdapter adapter = new SimpleAdapter(
                    MainActivity.this, contactList,
                    R.layout.list_item, new String[]{"name", "email",
                    "mobile","username"}, new int[]{R.id.name,
                    R.id.email, R.id.mobile,R.id.ID});

            lv.setAdapter(adapter);
        }

    }
}