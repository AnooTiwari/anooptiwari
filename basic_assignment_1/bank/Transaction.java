import java.util.Date;

/**
 *
 * @
 */
public class Transaction {

    //instance variables decleared
    private Date date;
    private char type;
    private double amount;
    private double acc_balance;
    private String description;

    //Constructor
    public Transaction(Date date, char type, double acc_balance, String description) {
        this.acc_balance = acc_balance;
        this.date = new Date();
        this.type = type;

        this.description = description;
    }

//getters and setters method decleared
    public Date getDate() {
        return date;
    }

    public Date setDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public char setType() {
        return type;
    }

    public double getBalance() {
        return acc_balance;
    }

    public double setBalance() {
        return acc_balance;
    }

    public double getAmount() {
        return amount;
    }

    public double setAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String setDescription() {
        return description;
    }
    //Tostring method 
    @Override
    public String toString() {  
        return "\n"+new Date()      + "Type : " + type     +      "Account Balance " + acc_balance + "Description " + description;
    }
}