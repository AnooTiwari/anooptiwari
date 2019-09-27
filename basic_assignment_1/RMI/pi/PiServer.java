    import java.rmi.*; 
    import java.rmi.registry.*; 
    public class PiServer 
    { 
        public static void main(String args[]) 
        { 
            try
            { 
                // Create an object of the interface 
                // implementation class 
                Pi obj = new Piclc();
                Fact obj2 = new Factclc();
                Prime obj3=new Primeclc();
                Gcd obj4= new Gcdclc();
                
                LocateRegistry.createRegistry(1900);   
                
                Naming.rebind("rmi://localhost:1900"+ "/PiCalc",obj); 
                Naming.rebind("rmi://localhost:1900"+ "/Factclc",obj2); 
                Naming.rebind("rmi://localhost:1900"+ "/Primeclc",obj3); 
                Naming.rebind("rmi://localhost:1900"+ "/Gcdclc",obj4); 
            } 
            catch(Exception ae) 
            { 
                System.out.println(ae); 
            } 
        } 
    } 