/*Create a map where key should be a unique user property and value should be the user.*/
import java.util.*;
public class maam1
{
public static void main(String[] args) {
HashMap <String,String> hm =new HashMap<>();
  Scanner sc =new Scanner(System.in);
  int i,n,decison;
  String name,phone,detail,temp;
  /*System.out.println("Enter the size");
  n=sc.nextInt();
  sc.nextLine();
  for(i=0;i
  <n;i++)
          {
          System.out.println("Enter the Name ");
          name=sc.nextLine();
          System.out.println("Enter the  mobile number");
          phone=sc.nextLine();
          hm.put(name,phone);
          }*/
          hm.put("Anoop","9415418279");
          hm.put("Akash","8574050698");
          hm.put("Bahadur","9839435252");
          hm.put("Mr kumar","05122616921");
          hm.put("Kv ram kumar","208014");
          System.out.println("Enter detail to find person ");
          detail=sc.nextLine();
          String value = hm.get(detail);
          if (hm.containsKey(detail)||hm.containsValue(detail))
          {
          if(hm.get(detail)==null){
          System.out.println("****Match found**** But Given String is Not a KEY It is a VALUE  ");
          for (Map.Entry<String,String> entry : hm .entrySet()){
          if( entry.getValue().equals(detail)){
            temp=entry.getKey();
          System.out.println("Given Value match with  Key = ****" + temp+"****");
          hm.remove(temp);
          System.out.println(temp+"  is Deleted");
          break;
          }

        }

        System.out.println(hm);
      }

  else{
  System.out.println("match found value is  "+hm.get(detail));
  }
  }else
  System.out.println("**********No KEY or VALUE match Exist**********");
  }
  }
