import  java.util.Date;
/**
 *
 * 
 */
public abstract class Account {

    //instance variables decleared
    private String c_name;
    private String acc_num;
    private double acc_balance;
   java.util.ArrayList transactions=new java.util.ArrayList();

   //default constructor 
    public Account(){


    }
    //Constructor

    public Account(String c_name,String acc_num,double  acc_balance){
        this.c_name=c_name;
        this.acc_num=acc_num;
        this.acc_balance=acc_balance;
    }

    //getters and setter method
    public String setName(){
        return this.c_name;
    }    

    public String getCname(){
        return this.c_name;
    }

    public String SetAccnum(String acc_number){
        return this.acc_num;
    }

    public String GetAccNum(){
        return this.acc_num;
    }

    public double setBalance(double balance){
        return this.acc_balance=balance;
    }

    public double getBalance(){
        return this.acc_balance;
    }
//end of getters an setters method

    //toString method decleared
    @Override
    public String toString(){
        return "Customer Name"+this.c_name   +"Account Number:"+this.acc_num; 
    }

    //beginning of withdrawal method
    public void  withdraw(double total){
        if(acc_balance<total){
            System.out.print("Not enough funds sorry your current balance is "+acc_balance);
        }
        else{
        this.acc_balance -= total;
        System.out.print("\n"+"Your Balance is"+ this.acc_balance);}

        Transaction t1 = new Transaction(new Date(), 'W', this.acc_balance, "Withdrawal Made");
        transactions.add(t1);

    }
    //end of withdrawal method


    //beginning of deposit method
   public void deposit(double total){
       this.acc_balance += total;
       System.out.printf("\n"+total+"Your Balance is"+ this.acc_balance);
        Transaction t1 = new Transaction(new Date(), 'D', this.acc_balance, "Deposit Made");
        transactions.add(t1);


   }
   //end of deposit method


}