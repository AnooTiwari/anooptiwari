package Client;
import Server.CSMessage;
import Server.Task;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//class computeclient starts
public class ComputeClient implements Serializable //extends Thread implements , Task
{
    static Socket s = null;
    public ComputeClient() {}
    static Object error1;
    static Task iTask;

    //main class starts here
    public static void main(String args[]) throws ClassNotFoundException //throwsClassNotFoundException 
    { 
        CSMessage message =new CSMessage();
        try {
            //usig the same port that server has declared
            int serverPort = 8888;
            s = new Socket("localhost",serverPort);
            ObjectInputStream in = null;
            ObjectOutputStream out =null;
            out =new ObjectOutputStream(s.getOutputStream() ); 
            in =new ObjectInputStream(s.getInputStream());
            while (true) {
                //User input...........menu..............menu..............menu.............
                System.out.println( "\n");

                System.out.println( "#################################################################" );
                System.out.println("Calculate Pi----------------------------------------------------1");
                System.out.println("Calculate Prime-------------------------------------------------2" );
                System.out.println( "Calculate Gretest Common Divisor--------------------------------3");
                System.out.println( "Exit------------------------------------------------------------4");

                System.out.println( "#################################################################\n");
                System.out.printf( "Enter Your Option Please: ");
                //taking user input to run the application further
                Scanner userinput =new Scanner(System.in);
                String x = userinput.nextLine();
                //passing the first choice as a object to server (request)
                out.writeObject(x);
                switch (x) {
                    case ("1"):
                        System.out.printf("Enter number of digits after the decimal point of pi: "  );
                        //knowing user's choice
                        Object obj1 = userinput.nextInt();
                        //writing the second object for pi class to server
                        out.writeObject(obj1);
                        //reading back the object of CalculatePi class
                        iTask = ( Task) in.readObject();
                        //Getting the result using running class's object interface
                        System.out .println("Value of pi with " +obj1 + " point precision is: " +iTask.getResult()); // displaying at DOS prompt
                        break;

                    case ("2"):
                        System.out .printf( "Enter any number till which the prime numbers are to becalculated: "  );
                        //knowing user's choice
                        Object y1 =userinput.nextInt();
                        //Passing user's input as a object (writing an object)
                        out.writeObject(y1);
                        //reading object
                        iTask = (Task) in.readObject();
                        //method to get the result using getResult (converting ArrayList to String) usingobject
                        Object result = iTask .getResult();
                        ArrayList s = ( ArrayList) result;
                        System.out.print(  "There are total " +s.size() + " prime numbers");
                        System.out .print(" and they are: ");
                        for (Object s1: s) {
                            System.out.print( s1 + " ");
                        }
                        //another way of printing the result
                        //System.out.println(" and they are : " + iTask.getResult()); // displaying at DOSprompt
                        break;
                    case ("3"):
                        System.out.println("Enter any two numbers consecutively-" );
                        //knowing user's choice
                        System.out .printf("Enter first number: ");
                        Object gcd1 = userinput.nextLong();
                        System.out .printf(  "Enter second number: ");
                        Object gcd2 = userinput .nextLong();
                        //writing user's choice as a object to server
                        out.writeObject( gcd1); //first choice
                        out.writeObject( gcd2); //second choice
                        //reading back the object
                        iTask = ( Task) in.readObject();
                        //printing the result
                        System.out.println("Gretest Common Divisor (GCD) among two number is : " +iTask.getResult()); // displaying at DOS prompt
                        break;
                    case ("4"):
                        //exit from the system
                        System.exit(0);
                        break;

                    default:
                        //showing appropriate message if user's input is invalid
                        System.out .println( "Your choice is not valid" );
                        System.out.println( in.readObject());
                        break;
                }
            }
        } catch (UnknownHostException e)
        {
            System.out.println( "Socket:" + e.getMessage());
        } catch (EOFException e)
         {
            System.out.println("EOF:" + e.getMessage());
        } catch (IOException e) {
            System.out.println( "readline:" + e.getMessage());
        } catch (
            ClassNotFoundException e) {
            //error message
            System.out.println("");
            System.out.println("\n" +message.getResult());
        } catch (
            NoClassDefFoundError ex) {
            //error message
            System.out.println("");
            System.out.println("\n" +message.getResult());
        } finally {
            if (s != null) try {
                s.close();
            } catch (
            IOException e) {
                System.out.println( "close:" + e .getMessage() );
            }
        }
    }
}