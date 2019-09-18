import  java.util.Date;
import java.util.ArrayList;
public abstract class Account {

   
    private String cName;
    private String accNum;
    private double accBalance;
   ArrayList transactions=new ArrayList();

  
    public Account(){
    }
  

    public Account(String cName,String accNum,double  accBalance){
        this.cName=cName;
        this.accNum=accNum;
        this.accBalance=accBalance;
    }

   
    public String setName(){
        return this.cName;
    }    

    public String getCname(){
        return this.cName;
    }

    public String GetAccNum(){
        return this.accNum;
    }

    public double setBalance(double balance){
        return this.accBalance=balance;
    }

    public double getBalance(){
        return this.accBalance;
    }
   

    // public String toString(){
    //     return "Customer Name"+this.cName   +"Account Number:"+this.accNum; 
    // }

    
    public void  withdraw(double total){
        if(accBalance<total){
            System.out.print("Not enough funds sorry your current balance is "+accBalance);
        }
        else{
        this.accBalance -= total;
        System.out.print("\n"+"Your Balance is"+ this.accBalance);}

        Transaction t1 = new Transaction(new Date(), 'W', this.accBalance, "Withdrawal Made");
        transactions.add(t1);/*Adding tranjection class object*/

    }
       
   public void deposit(double total){
       this.accBalance += total;
       System.out.printf("\n"+total+"Your Balance is"+ this.accBalance);
        Transaction t1 = new Transaction(new Date(), 'D', this.accBalance, " Deposit Made");
        transactions.add(t1);
    }
}