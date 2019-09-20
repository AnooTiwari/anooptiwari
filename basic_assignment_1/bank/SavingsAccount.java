import java.util.Date;  

public class SavingsAccount extends Account {
    private double intRate;

    public SavingsAccount(){
      intRate=0;  
    }
    public SavingsAccount(String cName, int accNum, double accBalance, double intRate) {
        super(cName,accNum, accBalance);
        this.intRate = Math.abs(intRate);
    }
   
   public double setRate(double rate) {
        return intRate=(Math.abs(rate)/100);
    }

    public double getRate() {
        return Math.abs(intRate);
    }
    
    public void payInterest() {
        double accAmount=getBalance();
        double balance=0;
        balance = (accAmount + (accAmount *getRate()));
        setBalance(balance);

        System.out.printf("Account Balance With Interest is %.2f", setBalance(balance));
        Transaction t1 = new Transaction(new Date(),    'I'     ,        setBalance(balance), "Interest Paid");
        transactions.add(t1);

    }    
    public void deposit(double total) {
        double balance;
        double accAmount = getBalance();
        if(total>0){
        balance= accAmount+=total;
        setBalance(balance);
        System.out.printf("Your deposit of :$" + total + " was successful your new account balance is :$%.2f",setBalance(balance));
        Transaction t1 = new Transaction(new Date()     ,     'D'    , setBalance(balance),  "Deposit Made");
        transactions.add(t1);
        }else
        {
            System.out.println("Opps! Please give Correct Ammout");
        }
        
    }
}
