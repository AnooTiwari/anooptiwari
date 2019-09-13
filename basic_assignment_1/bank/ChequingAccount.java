import java.util.Date;

public class ChequingAccount extends Account {
// instance variable decleared
    private double overDraft;
// default constructor
    public ChequingAccount() {
        this.overDraft = 500;
    }
    //end of default constructor


//Main Constructor begins
    public ChequingAccount(String cName, String accNum, double accBalance) {
        super(cName, accNum, accBalance);

    }
    //End of Main Method


// Getters and Setters method
    public double setOverDraft() {
        return overDraft = 500;

    }



    /*@Override @Override annotation informs the compiler that the element is meant to override 
    an element declared in a superclass. Overriding methods will be discussed in Interfaces and Inheritance. 
    While it is not required to use this annotation when overriding a method, it helps to prevent errors.*/
    @Override
    public String toString() {
        return this.toString() + "Over Draft Limit :" + overDraft;
    }

    //Withdrawal method override
    /*@Override @Override annotation informs the compiler that the element is meant to override 
    an element declared in a superclass. Overriding methods will be discussed in Interfaces and Inheritance. 
    While it is not required to use this annotation when overriding a method, it helps to prevent errors.*/
    @Override
    public void withdraw(double amount) {
        double accAmount = getBalance();
        double balance = 0;
        if (amount >balance &&  amount>  overDraft) {
            System.out.println("Sorry I cannot give you that amount choose a lower amount or tell d girl yuh cah remember yuh pin");
        } 
        else {
              balance= accAmount-= amount;
              setBalance(balance);

        }
        System.out.printf(amount+ "Your new balance is %.2f", setBalance(balance));
        Transaction t1 = new Transaction(new Date()     , 'W',  setBalance(balance), "Withdrawal Made:");
        transactions.add(t1);
    }

    //Deposit Method override
    /*@Override @Override annotation informs the compiler that the element is meant to override 
    an element declared in a superclass. Overriding methods will be discussed in Interfaces and Inheritance. 
    While it is not required to use this annotation when overriding a method, it helps to prevent errors.*/
    @Override
    public void deposit(double amount) {
        double accAmount = getBalance();
        double balance=0;
        balance=accAmount += amount;
        setBalance(balance);
        System.out.printf("Your deposit of :$" + amount + " was successful your new account balance is :$%.2f",setBalance(balance));
        Transaction t1 = new Transaction(new Date()     , 'D'    ,       setBalance(balance),      "Deposit Made:");
        transactions.add(t1);
    }


}