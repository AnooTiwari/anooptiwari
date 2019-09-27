import java.rmi.*; 
import java.util.*; 
public interface Gcd extends Remote 
{ 
    public int FindGcd(int number1,int number2) throws RemoteException; 

} 