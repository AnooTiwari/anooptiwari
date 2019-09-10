import java.util.Date;

/**
 *
 * @
 */
public class SavingsAccount extends Account {
// instance variables decleared
    private double int_rate;

    //default constrictor
    public SavingsAccount(){
      int_rate=0;  
    }
//main construtor
    public SavingsAccount(String c_name, String acc_num, double acc_balance, double int_rate) {
        super(c_name,acc_num, acc_balance);
        this.int_rate = int_rate;
    }
//getters and setters method decleared
    public double setRate(double rate) {
        return int_rate=rate/100;
    }

    public double getRate() {
        return int_rate;
    }


//payInterest method decleared
    public void payInterest() {
        double acc_amount=getBalance();
        double balance=0;
        balance = (acc_amount + (acc_amount *getRate()));
        setBalance(balance);

        System.out.printf("Account Balance With Interest is %.2f", setBalance(balance));
        Transaction t1 = new Transaction(new Date(),    'I'     ,        setBalance(balance), "Interest Paid");
        transactions.add(t1);

    }
//Withdrawal method override
    @Override
    public void withdraw(double total) {
        double acc_amount = getBalance();
        double balance = 0;

        if (acc_amount < total) {
            System.out.printf("Not enough funds your main account balance is :$%.2f", acc_amount);
        } else {

                    balance=acc_amount -= total;
                   setBalance(balance);
            System.out.printf("Your withdrawal of :$" + total + " was successful your new  account balance is :$%.2f",setBalance(balance));
        }
        Transaction t1 = new Transaction(new Date()     ,    'W'     ,       setBalance(balance), "Withdrawal Made");
        transactions.add(t1);


    }
//Deposit method override
    @Override
    public void deposit(double total) {
        double balance;
        double acc_amount = getBalance();
        balance= acc_amount+=total;
        setBalance(balance);
        System.out.printf("Your deposit of :$" + total + " was successful your new account balance is :$%.2f",setBalance(balance));
        Transaction t1 = new Transaction(new Date()     ,     'D'    , setBalance(balance),  "Deposit Made");
        transactions.add(t1);

    }

    @Override
    public String toString() {
        return this.toString() + "Interest Rate: " + int_rate;
    }


}