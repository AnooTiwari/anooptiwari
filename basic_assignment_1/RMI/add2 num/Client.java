import java.rmi.*;
import java.rmi.server.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RMISecurityManager;


public class Client
{
public static void main(String[]arg) throws Exception
{
String host="localhost";
Scanner sc = new Scanner(System.in);
System.out.println("Enter the 1st Number");
int a=sc.nextInt();
System.out.println("Enter the 2nd Number");
int b= sc.nextInt();
try{
	RmiImpl remobj=(RmiImpl)Naming.lookup("rmi://"+host+"RmiImpl");
	System.out.println(remobj.add(a,b));
}
catch(RuntimeException re){
	re.printStackTrace();
}
catch(NotBoundException nbe)
{
	nbe.printStackTrace();
}
catch(MalformedURLException mfe)
{
	mfe.printStackTrace();
}
}
}