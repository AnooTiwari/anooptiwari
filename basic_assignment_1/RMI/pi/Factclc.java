    import java.rmi.*; 
    import java.rmi.server.*; 
    import java.util.*;
    public class Factclc extends UnicastRemoteObject implements Fact 
    { 
        Factclc() throws RemoteException 
        { 
            super(); 
        }  
        
        
        public int clcfect(int data2) throws RemoteException
        {
            int res = 1, i; 
            for (i=2; i<=data2; i++) 
                res *= i; 
            return res;
        }
        
    } 
        
