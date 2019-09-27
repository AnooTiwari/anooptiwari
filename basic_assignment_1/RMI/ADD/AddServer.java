import java.rmi.*;
import java.net.*;
public class AddServer
{
	public static void main(String ar[])
	{
	try{
	AddremImpl locobj= new AddremImpl();
	Naming.rebind("rmi:///Addrem",locobj);
	}
	catch(RemoteException re)
	{
		re.printStackTrace();
	}
	catch(MalformedURLException mfe)
	{
		mfe.printStackTrace();
	}
	}
}