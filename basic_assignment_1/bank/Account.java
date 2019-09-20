import  java.util.Date;
import java.util.ArrayList;
public  class Account {

   
    private String cName;
    private int accNum;
    private double accBalance;
   ArrayList transactions=new ArrayList();

  
    public Account(){
    }
  

    public Account(String cName,int accNum,double  accBalance){
        this.cName=cName;
        this.accNum=accNum;
        this.accBalance=accBalance;
    }

   
    public boolean setName(String cName){
        if ((cName != null)&& (!cName.equals(""))&& (cName.matches("^[a-zA-Z]*$"))){
        this.cName=cName;
        return true;    
        }
        else{
        System.out.println("\t\t****Name doesn't Contains the Special Character or Number****");
        return false;            
        }        
    }    

    public String getCname(){
        return this.cName;
    }

    public int GetAccNum(){
        return this.accNum;
    }

    public double setBalance(double balance){
        return this.accBalance=balance;
    }

    public double getBalance(){
        return this.accBalance;
    }
    
    public void  withdraw(double total,char type){
        boolean flag=false;
    if(accBalance<total){
        System.out.print("Not enough funds sorry your current balance is "+accBalance);
    }
    else if(type=='c'&&(this.accBalance-total)>=10000&&total>1){        
    flag=true;
    }
    else if(type=='s'&&(this.accBalance-total)>=500 && total<=35000&&total>1)
    {
        flag=true;
    }
    if(flag)
    {
    this.accBalance -= total;
    System.out.print("\n"+"Your Balance is"+ this.accBalance);
    }
    else
    System.out.print("Transaction Fail");
    Transaction t1 = new Transaction(new Date(), 'W', this.accBalance, "Withdrawal Made");
    transactions.add(t1);/*Adding tranjection class object*/

    }
  
}