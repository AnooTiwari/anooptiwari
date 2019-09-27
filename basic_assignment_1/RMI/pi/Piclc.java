        import java.rmi.*; 
        import java.rmi.server.*; 
        import java.util.*;
        /*Create and export a new UnicastRemoteObject object using an anonymous port.*/
        public class Piclc extends UnicastRemoteObject implements Pi 
        { 
            //List  list = new ArrayList();
            Piclc() throws RemoteException 
            { 
                super(); 
            }  
            /*A remote object implementation can extend the class 
            UnicastRemoteObject to make use of its constructors that 
            export the objec*/
            
            public double CalcPi(double data) throws RemoteException 
            { 
            double pi = 0;
                for (int i = 1; i < data; i++) {
                    pi += Math.pow(-1,i+1) / (2*i - 1);
                } 
                
                return 4 * pi;
            } 
            
            
            
        } 
            
