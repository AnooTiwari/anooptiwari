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

    public void setDate() {
    this.date = new Date();
    }

    public char getType() {
        return type;
    }

    public void setType() {
        this.type = type;
    }

    public double getBalance() {
        return accBalance;
    }

    public void setBalance() {
    this.accBalance = accBalance;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount() {
      
    }

    public String getDescription() {
        return description;
    }

    public void setDescription() {
     this.description = description;
    }
    public String toString() {  
        return "\n"+new Date()      + " Type : " + type +" Account Balance " + accBalance + " Description " + description;
    }
}
