package Client;
import Server.CSMessage;
import Server.Task;
import Server.CalculatePi;
import Server.CalculateGCD;
import Server.CalculatePrime;
import java.net.*;
import java.io.*;
import java.util.Scanner;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

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
                System.out.println("Calculate GCD  [2]");
                System.out.println("Calculate Prime  [3]");
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
                    case("2"):
                        System.out.println("Enter any two numbers consecutively-" );
                        System.out .printf("Enter first number: ");
                        Object gcd1 = sc.nextLong();
                        System.out .printf(  "Enter second number: ");
                        Object gcd2 = sc .nextLong();
                        CalculateGCD gcd=new CalculateGCD((long) gcd1,(long) gcd2);
                        out.writeObject(gcd);
                        iTask = ( Task) in.readObject();
                        System.out.println("Gretest Common Divisor (GCD) among two number is : " +iTask.getResult()); 
                    break;
                    case ("3"):
                        System.out .printf( "Enter any number till which the prime numbers are to becalculated: "  );
                        Object c =sc.nextInt();
                        CalculatePrime pm=new CalculatePrime((int) c); 
                        out.writeObject(pm);
                        iTask = (Task) in.readObject();
                        Object result = iTask .getResult();
                        ArrayList s = ( ArrayList) result;
                        System.out.print(  "There are total " +s.size() + " prime numbers");
                        System.out .print(" and they are: "+s);
                        /*for (Object s1: s) {System.out.print( s1 + " ");} */                   
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
        catch (IOException e) {
        System.out.println("\n" +message.getResult());
        }
    }
}