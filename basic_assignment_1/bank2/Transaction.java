import java.util.Date;

public class Transaction {

    private Date date;
    private char type;
    private double amount;
    private double accBalance;
    private String description;

    public Transaction(Date date, char type, double accBalance, String description) {
        this.accBalance = accBalance;
        this.date = new Date();
        this.type = type;

        this.description = description;
    }

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
        return accBalance;
    }

    public double setBalance() {
        return accBalance;
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
    public String toString() {  
        return "\n"+new Date()      + " Type : " + type +" Account Balance " + accBalance + " Description " + description;
    }
}