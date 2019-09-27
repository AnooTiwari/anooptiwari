import java.rmi.*; 
import java.util.*; 
public interface Prime extends Remote 
{ 
	List  list = new ArrayList();
    public List findPrime(int data) throws RemoteException; 

} 