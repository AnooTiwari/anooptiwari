import java.rmi.*;
 
public class Client
{
    public static void main (String[] argv)
    {
        try
                 {
            HelloInterface hello= (HelloInterface) Naming.lookup("localhost");  //the string representing the host was modified to be posted here
            System.out.println (hello.say());
        }
        catch (Exception e)
        {
            System.out.println ("Hello Server exception: " + e);
        }
    }
}