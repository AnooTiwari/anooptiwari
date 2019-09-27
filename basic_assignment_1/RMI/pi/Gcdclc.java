    import java.rmi.*; 
    import java.rmi.server.*; 
    import java.util.*;
    public class Gcdclc extends UnicastRemoteObject implements Gcd 
    { 
        Gcdclc() throws RemoteException 
        { 
            super(); 
        }  
        
       
        public int FindGcd(int number1,int number2) throws RemoteException
        {
            int gcd=1;
            for(int i = 1; i <= number1 && i <= number2; ++i)
        {
            if(number1 % i==0 && number2 % i==0)
                gcd = i;
        }
        return gcd;
        }
        
        
    } 
        
