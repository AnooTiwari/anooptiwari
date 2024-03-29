import java.util.Date;

public class ChequingAccount extends Account {
    private double overDraft;
    public ChequingAccount() {
        this.overDraft = 500;
    }


    public ChequingAccount(String cName, String accNum, double accBalance) {
        super(cName, accNum, accBalance);/*using account class varible */

    }


    public double setOverDraft() {
        return overDraft = 500;
    }



    public String toString() {
        return this.toString() + "Over Draft Limit :" + overDraft;
    }

    public void withdraw(double amount) {
        double accAmount = getBalance();
        double balance = 0;
        if (amount >balance &&  amount>  overDraft) {
            System.out.println("Sorry cannot withdraw  that amount choose a lower amount ");
        } 
        else {
              balance= accAmount-= amount;
              setBalance(balance);

        }
        System.out.printf(amount+ "Your new balance is %.2f", setBalance(balance));
        Transaction t1 = new Transaction(new Date()     , 'W',  setBalance(balance), "Withdrawal Made:");
        transactions.add(t1);
    }

    public void deposit(double amount) {
        double accAmount = getBalance();
        double balance=0;
        balance=accAmount += amount;
        setBalance(balance);
        System.out.printf("Your deposit of :Rs " + amount + " was successful your new account balance is :Rs %.2f",setBalance(balance));
        Transaction t1 = new Transaction(new Date()     , 'D'    ,  setBalance(balance),      "Deposit Made:");
        transactions.add(t1);
    }


}