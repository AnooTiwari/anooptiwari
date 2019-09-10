import java.util.Date;
import java.util.*;
import java.io.*;

    public class Account{
    public class Account{
        private String id;
        private double balance = 0;
        private static double annualInterestRate = 0;
        private Date dateCreated = new Date();
        Account(){}
        Account(String Id, double Balance){
            id = Id;
            balance = Balance;
        }
            public String getId(){
            return id;
        }
        public double getBalance(){
            return balance;
        }
        public double getAnnualInterestRate(){
            return annualInterestRate;
        }
        public double getMonthlyInterest(){
        return annualInterestRate/12;
        }
        public Date getDateCreated(){
        return dateCreated;
        }
        public void setId(String Id){
            id = Id;
        }
        public void setBalance(double Balance){
            balance = Balance;
        }
        public static void setAnnualInterestRate(double Rate){
            annualInterestRate = Rate;
        }
        public void withdraw(double debit) throws Exception {
            if( debit < balance ){
                balance = balance - debit;
            }else throw new Exception();
        }
        public void deposit(double credit){
            balance = balance + credit;
        }    
        public static void ValidateId(String Id) {
        if(Id.matches("[\\d]{4}"+"-"+"[\\d]{5}")) 
            System.out.println("valid id");
        else    
            System.out.println("invalid id");
         }
        public String toString(){
            return "Account Type: ";
        }
    }
public class Checking extends Account {
        public Checking( ){
        }
        public Checking( double balance ){
            super.setBalance( balance );
        }
        public Checking( String id, double balance ){
            super.setBalance( balance );
            super.setId( id );
        }
        @Override
        public String toString( ){
            return super.toString() + "Checking, Account #: " + this.getId() + ", Balance: " + this.getBalance();
        }
    }
public class Savings extends Account {
        private double dInterestRate = 0;
        public Savings( double interestRate ){
            super();
            this.dInterestRate = interestRate;
        }
        public Savings( String accountName, double interestRate, double balance){
            this.setBalance( balance );
            this.setId( accountName );
            this.dInterestRate = interestRate;
        }
        public Savings() {
                }
        @Override
        public String toString(){
            return "Account Type: Savings, Account #: " + this.getId() + ", Balance: " + this.getBalance() + ", Rate: " + dInterestRate;
        }
    }
public class MoneyMarket extends Checking {
        private static double penalty = 0.2000;
        private double balance;
             MoneyMarket(){} 
             public MoneyMarket(double balance) {
                 super.setBalance(balance);
             }
              public void withdraw(double amount){
                 balance -= amount + amount * penalty;
              }
        public MoneyMarket( String id, double balance ){
            super.setBalance( balance );
            super.setId( id );
        }
        @Override
        public String toString( ){
            return super.toString() + "MoneyMarket, Account #: " + this.getId() + ", Balance: " + this.getBalance();
        }
    }
public class CertificateOfDeposit extends Savings {
            private double penalty = 1.5000;
            private double balance = 0;
            private double dInterestRate;
             public CertificateOfDeposit(double balance) {
                 super();
                 this.dInterestRate = penalty;
                 super.setBalance(balance);
             }
              public void withdraw(double amount){
                 balance -= amount + penalty;
              }
        public CertificateOfDeposit( String id, double balance ){
            super.setBalance( balance );
            super.setId( id );
        }
        @Override
        public String toString( ){
            return super.toString() + "Certificate Of Deposit, Account #: " + this.getId() + ", Balance: " + this.getBalance() + ", Rate: " + dInterestRate;
        }
    }
    

public class TextFile {
    public static void main(String[] args) throws IOException {
        {
            double num;
            File file = new File("transactions.txt");
            Scanner inputFile = new Scanner(file);
            PrintWriter outputFile = new PrintWriter("output.txt");
            while (inputFile.hasNext()) {
                {
                    num = inputFile.nextDouble();
                    if (num > 0) {
                        outputFile.println(num);
                    }
                    System.out.println(num);
                }
                inputFile.close();
                outputFile.close();
            }
        }
    }
}}