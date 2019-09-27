import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
public class AddremImpl extends UnicastRemoteObject implements Addrem
{
	public AddremImpl()throws RemoteException{}
	public int addNum(int a,int b){
		return (a+b);
	}
}