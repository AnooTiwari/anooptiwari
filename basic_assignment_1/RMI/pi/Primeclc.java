    import java.rmi.*; 
    import java.rmi.server.*; 
    import java.util.*;
    public class Primeclc extends UnicastRemoteObject implements Prime 
    { 
        List  list = new ArrayList();
        Primeclc() throws RemoteException 
        { 
            super(); 
        }  
        
       
        public List findPrime(int data2) throws RemoteException
        {   int i, number, count; 
            for(number = 1; number <= data2; number++)
            {
                count = 0;
                for (i = 2; i <= number/2; i++)
                {
                    if(number % i == 0)
                    {
                        count++;
                        break;
                    }
                }
                if(count == 0 && number != 1 )
                {
                    list.add(number);
                }  
            }
            return list;
        }
        
        
        
    } 
        
