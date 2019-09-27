    import java.rmi.*;
    import java.util.*;
    public class ClientRequest 
    { 
        public static void main(String args[]) 
        { 
            double limitofPi; 
            int factNum,primeLimit,number1=12,number2=18;
            char type;
              Scanner sc= new Scanner(System.in);
            try
            { 
                while(true)
             {
                System.out.println("Enter 1 for [ PI ] value ");
                System.out.println("Enter 2 for [ Prime ] value ");
                System.out.println("Enter 3 for [ Gcd ] value ");
                System.out.println("Enter 4 for [ Factorial ] value ");
                System.out.println("Enter 5 for Quit ");
                type = sc.next().trim().toUpperCase().charAt(0);sc.nextLine();
                if (type == '1') {
                System.out.println("Enter the Limit of Pi  ");
                 while (true)
                    try {
                    limitofPi = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input: ");
                    }
                    if(limitofPi>=0){
                /*Naming.lookup() call inspects the RMI Registry running in the localhost*/ 
                Pi access = (Pi)Naming.lookup("rmi://localhost:1900"+ "/PiCalc"); 
                /*It returns an Object that has to be cast to whatever remote interface you're expecting it to be.*/
                System.out.println(access.CalcPi(limitofPi));}
                else
                System.out.print("Try again Mismatch input: ");
                }
                if (type == '2') {
                System.out.println("How much prime Number you want to print [ 1 to N ] Enter the { Nth } value ");
                while (true)
                    try {
                    primeLimit = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input: ");
                    }
                    if(primeLimit>=0){
                    Prime pr = (Prime)Naming.lookup("rmi://localhost:1900"+ "/Primeclc");
                    System.out.println(pr.findPrime(primeLimit));}
                    else
                    System.out.print("Try again Mismatch input: ");
                }
                if (type == '3') {
                System.out.println("Enter the two Number for Gcd ");
                while (true)
                    try {
                    number1 = Integer.parseInt(sc.nextLine());
                    number2 = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input Please __--{Insert both}--__ value again ");
                    }    
               
                if(number1>=0&&number2>=0){
                Gcd gd = (Gcd)Naming.lookup("rmi://localhost:1900"+ "/Gcdclc"); 
                System.out.println(gd.FindGcd(number1,number2));}
                else
                System.out.println("Wrong Input ");
                }
                if (type == '4') {
                System.out.println("Enter the Number for factorial ");
                
                 while (true)
                    try {
                    factNum = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input: ");
                    }
                    if(factNum>=0){
                    Fact ft = (Fact)Naming.lookup("rmi://localhost:1900"+ "/Factclc"); 
                    System.out.println(ft.clcfect(factNum));}
                    else
                    System.out.println("Wrong Input ");                            
                }
                
                if(type== '5')
                    break;
            }
            } 
            catch(Exception ae) 
            { 
                System.out.println(ae); 
            } 
        } 
    }