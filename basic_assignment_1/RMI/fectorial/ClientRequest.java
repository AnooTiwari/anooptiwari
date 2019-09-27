import java.rmi.*; 
import java.util.*;
public class ClientRequest 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int answer;
        int value=5; 
        try
        { 
        System.out.println("Enter the num for factorial");
        value=sc.nextInt();
            
        fact access = (fact)Naming.lookup("rmi://localhost:1900"+"/anooppc"); 
            answer = access.calc(value); 
            System.out.println("fact of  " + value + " if " + answer+" at anooppc"); 
        } 
        catch(Exception ae) 
        { 
            System.out.println(ae); 
        } 
    } 
} 