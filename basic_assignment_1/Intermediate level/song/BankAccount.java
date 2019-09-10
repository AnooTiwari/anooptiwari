import java.util.*; 
public class BankAccount {
 
    private int id;
    private double balance;
    private String accountName;
     private static double annualInterestRate = 0;
    private ArrayList<String> transactions;
    
    public BankAccount(int accountID) {
        id = accountID;
        balance = 0.0;
        accountName=accName;
        transactions = new ArrayList<String>();
    }
     public String setName(String accName) {
         this.accountName=accName;
    } 
    
    public void deposit(double money) {
        if (0 <= money) {
            balance = balance + money;
            transactions.add("Deposit of $" + money);
        }
    }
    public void withdraw(double money) {
        if (0 <= money && money <= balance) {
            balance = balance - money;
            transactions.add("Withdrawal of $" + money);
    }    
    public static void setAnnualInterestRate(double Rate){
            annualInterestRate = Rate;
        }
     public double getAnnualInterestRate(){
            return annualInterestRate;
        }

    public double getMonthlyInterest(){
        return annualInterestRate/12;
        }

    public double getBalance() {
        return balance;
    }
   

    public String getName() {
        return accountName;
    }

    public double getID() {
        return id;
    }
    public void printLog() {

    	for (int i = 0; i < transactions.size(); i++) {
    		String element = transactions.get(i);
    		System.out.println(element);
    	}
    }
}

public class Checking extends BankAccount {
        public Checking( ){
        }
        public Checking( double balance ){
            super.setBalance( balance );
        }
        public Checking( String id, double balance ){
            super.setBalance( balance );
            super.setId( id );
        }
       
     
    }
 public class Savings extends Account {
        private double dInterestRate = 0;
        public Savings( double interestRate ){
            super();
            this.dInterestRate = interestRate;
        }
        public Savings( String accountName, double interestRate, double balance){
            this.setBalance( balance );
            this.setId( accountName );
            this.dInterestRate = interestRate;
        }
        public Savings() {
                }
        
    
    }

