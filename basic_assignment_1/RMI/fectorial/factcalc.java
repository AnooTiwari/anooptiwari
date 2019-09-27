import java.rmi.*; 
import java.rmi.server.*; 
public class factcalc extends UnicastRemoteObject implements fact 
{ 
    factcalc() throws RemoteException 
    { 
        super(); 
    } 
  
    public int calc(int data)throws RemoteException 
    { 
        
        int res = 1, i; 
        for (i=2; i<=data; i++) 
            res *= i; 
        return res; 
    } 
} 