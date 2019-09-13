import java.util.Date;

public class SavingsAccount extends Account {
// instance variables decleared
    private double intRate;

    //default constrictor
    public SavingsAccount(){
      intRate=0;  
    }
    //main construtor
    public SavingsAccount(String cName, String accNum, double accBalance, double intRate) {
        super(cName,accNum, accBalance);
        this.intRate = intRate;
    }
    //getters and setters method decleared
    public double setRate(double rate) {
        return intRate=rate/100;
    }

    public double getRate() {
        return intRate;
    }


    //payInterest method decleared
    public void payInterest() {
        double accAmount=getBalance();
        double balance=0;
        balance = (accAmount + (accAmount *getRate()));
        setBalance(balance);

        System.out.printf("Account Balance With Interest is %.2f", setBalance(balance));
        Transaction t1 = new Transaction(new Date(),    'I'     ,        setBalance(balance), "Interest Paid");
        transactions.add(t1);

    }
    //Withdrawal method override
    @Override
     /*@Override @Override annotation informs the compiler that the element is meant to override 
    an element declared in a superclass. Overriding methods will be discussed in Interfaces and Inheritance. 
    While it is not required to use this annotation when overriding a method, it helps to prevent errors.*/
    public void withdraw(double total) {
        double accAmount = getBalance();
        double balance = 0;

        if (accAmount < total) {
            System.out.printf("Not enough funds your main account balance is :$%.2f", accAmount);
        } else {

                    balance=accAmount -= total;
                   setBalance(balance);
            System.out.printf("Your withdrawal of :$" + total + " was successful your new  account balance is :$%.2f",setBalance(balance));
        }
        Transaction t1 = new Transaction(new Date()     ,    'W'     ,       setBalance(balance), "Withdrawal Made");
        transactions.add(t1);


    }
    //Deposit method override
    @Override
     /*@Override @Override annotation informs the compiler that the element is meant to override 
    an element declared in a superclass. Overriding methods will be discussed in Interfaces and Inheritance. 
    While it is not required to use this annotation when overriding a method, it helps to prevent errors.*/
    public void deposit(double total) {
        double balance;
        double accAmount = getBalance();
        balance= accAmount+=total;
        setBalance(balance);
        System.out.printf("Your deposit of :$" + total + " was successful your new account balance is :$%.2f",setBalance(balance));
        Transaction t1 = new Transaction(new Date()     ,     'D'    , setBalance(balance),  "Deposit Made");
        transactions.add(t1);
        
    }

    @Override
     /*@Override @Override annotation informs the compiler that the element is meant to override 
    an element declared in a superclass. Overriding methods will be discussed in Interfaces and Inheritance. 
    While it is not required to use this annotation when overriding a method, it helps to prevent errors.*/
    public String toString() {
        return this.toString() + "Interest Rate: " + intRate;
    }
}