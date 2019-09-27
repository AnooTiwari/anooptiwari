import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;
public class AddClient{
	public static void main(String args[])
	{
	String host="localhost";
	Scanner sc= new Scanner(System.in);
	System.out.println("enter the 1st num");
	int a=sc.nextInt();
	System.out.println("enter the second Number");
	int b=sc.nextInt();
	try{
		Addrem rem=(Addrem)Naming.lookup("rmi://"+host+"/Addrem");
		System.out.println(rem.addNum(a,b));		
	}catch(RemoteException re)
	{
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
