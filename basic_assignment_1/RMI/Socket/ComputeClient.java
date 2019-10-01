package Client;
import Server.CSMessage;
import Server.Task;
import Server.CalculatePi;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.io.Serializable;

public class ComputeClient implements Serializable
{
    static Socket s = null;
    public ComputeClient() {}
    static Task iTask;

    public static void main(String args[]) throws ClassNotFoundException  
    { 
        CSMessage message =new CSMessage();
        try {
            int serverPort = 1920;
            s = new Socket("localhost",serverPort);
            ObjectInputStream in;
            ObjectOutputStream out ;
            out =new ObjectOutputStream(s.getOutputStream()); 
            in =new ObjectInputStream(s.getInputStream());
            while (true) {
                System.out.println( "\n");
                System.out.println("Calculate Pi  [1]");
                System.out.println( "Exit         [4]");
                System.out.printf( "Enter Your Option Please: ");
                Scanner sc =new Scanner(System.in);
                String x = sc.nextLine();
                switch (x) 
                {
                    case ("1"):
                    System.out.printf("Enter number of digits after the decimal point of pi: ");
                    Object limit = sc.nextInt();
                    CalculatePi cp =new CalculatePi((int) limit);
                    out.writeObject(cp);
                    iTask = (Task) in.readObject();
                    System.out .println("Value of pi with " +limit + " point  is: " +iTask.getResult());
                    break;                        
                    case ("4"):
                    System.exit(0);
                    break;
                    default:
                    System.out .println( "Your choice is not valid" );
                    System.out.println( in.readObject());
                    break;
                }
            }
        }
        catch (IOException e) {}
    }
}