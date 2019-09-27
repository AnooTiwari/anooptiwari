import java.rmi.*; 
import java.util.*; 
public interface Fact extends Remote 
{ 
    public int clcfect(int data) throws RemoteException; 

} 