import  java.util.Date;
import java.util.ArrayList;
public abstract class Account {

   
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

   
    public String setName(){
        return this.cName;
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
  
}