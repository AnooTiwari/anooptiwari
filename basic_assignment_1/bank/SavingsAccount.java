import java.util.Date;  

public class SavingsAccount extends Account {
    private double intRate;

    public SavingsAccount(){
      intRate=0;  
    }
    public SavingsAccount(String cName, int accNum, double accBalance, double intRate) {
        super(cName,accNum, accBalance);
        this.intRate = intRate;
    }
    public double setRate(double rate) {
        return intRate=rate/100;
    }

    public double getRate() {
        return intRate;
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
    public void withdraw(double total) {
        double accAmount = getBalance();
        double balance = 0;
        double limit = 35000;


        if (accAmount < total|| total>35000) {/*I can split this in 2 different conduction if you want*/
            System.out.printf("Not enough funds your main account balance is :Rs %.2f \n", accAmount);
            System.out.println("______________________________OR_________________________________");
            System.out.println("Exceed the Withdrawal Limit :"+limit);
        } else if((accAmount-total)>499){
                balance=accAmount -= total;

                setBalance(balance);
            System.out.printf("Your withdrawal of :$" + total + " was successful your new  account balance is :Rs %.2f",getBalance());
        }else
        System.out.println("you should Maintain minimum balance [ Rs 500 /- ]");

        Transaction t1 = new Transaction(new Date()     ,    'W'     ,       getBalance(), "Withdrawal Made");
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