import java.util.Date;

public class ChequingAccount extends Account {
// instance variable decleared
    private double over_draft;
// default constructor
    public ChequingAccount() {
        this.over_draft = 500;
    }
    //end of default constructor


//Main Constructor begins
    public ChequingAccount(String c_name, String acc_num, double acc_balance) {
        super(c_name, acc_num, acc_balance);

    }
    //End of Main Method


// Getters and Setters method
    public double setOverDraft() {
        return over_draft = 500;

    }


//To string override
    @Override
    public String toString() {
        return this.toString() + "Over Draft Limit :" + over_draft;
    }

    //Withdrawal method override
    @Override
    public void withdraw(double amount) {
        double acc_amount = getBalance();
        double balance = 0;
        if (amount >balance &&  amount>  over_draft) {
            System.out.println("Sorry I cannot give you that amount choose a lower amount or tell d girl yuh cah remember yuh pin");
        } 
        else {
              balance= acc_amount-= amount;
              setBalance(balance);

        }
        System.out.printf(amount+ "Your new balance is %.2f", setBalance(balance));
        Transaction t1 = new Transaction(new Date()     , 'W',       setBalance(balance), "Withdrawal Made:");
        transactions.add(t1);

    }

    //Deposit Method override
    @Override
    public void deposit(double amount) {
        double acc_amount = getBalance();
        double balance=0;
        balance=acc_amount += amount;
        setBalance(balance);
        System.out.printf("Your deposit of :$" + amount + " was successful your new account balance is :$%.2f",setBalance(balance));
        Transaction t1 = new Transaction(new Date()     , 'D'    ,       setBalance(balance),      "Deposit Made:");
        transactions.add(t1);


    }


}