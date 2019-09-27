import java.rmi.*; 
public interface fact extends Remote 
{ 
    public int calc(int data) throws RemoteException; 
} 