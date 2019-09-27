import java.rmi.*; 
import java.rmi.registry.*; 
public class factserver 
{ 
    public static void main(String args[]) 
    { 
        try
        { 
            
            fact obj = new factcalc(); 
  
            
            LocateRegistry.createRegistry(1900); 
  
           
            Naming.rebind("rmi://localhost:1900"+ 
                          "/anooppc",obj); 
        } 
        catch(Exception ae) 
        { 
            System.out.println(ae); 
        } 
    } 
} 