class BankAccount{

private int accountNumber;
private String holderName;
private String holderAddress;
private String openDate;
private double balance;
private double[] transactions;
private String[] transactionsSummary;
private int numOfTransactions;
private  static int noOfAccounts=0;

public String getAccountInfo(){
    return "Account number: " + accountNumber + "\nCustomer Name: " + holderName + "\nHolder's Address: " + holderAddress + "\nOpen Date: " + openDate +  "\nBalance:" + balance +"\n";
}

public String getTransactionInfo(int n)
{
    String transaction = transactionsSummary[n];
    if (transaction == null) {
        return "No transaction exists with that number.";
    }
    else {
        return transaction;
    }
}

public BankAccount(String abc, double xyz, String address, String open){
    holderName = abc;
    balance = xyz;
    holderAddress = address;
    openDate = open;
    noOfAccounts ++;
    accountNumber = noOfAccounts;
    transactions = new double[100];
    transactionsSummary = new String[100];
    transactions[0] = balance;
    transactionsSummary[0] = "A balance of : $" + Double.toString(balance) + " was deposited.";
    numOfTransactions = 1;
}

public int getAccountNum(){
    return accountNumber;
}

public int getNumberOfTransactions() {
    return numOfTransactions;
}

public void deposit(double amount){

    if (amount<=0) {
        System.out.println("Amount to be deposited should be positive");
    } else {
        balance = balance + amount;
        transactions[numOfTransactions] = amount;
        transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was deposited.";
        numOfTransactions++;
    }
}

public void withdraw(double amount)
{
    if (amount<=0){
        System.out.println("Amount to be withdrawn should be positive");
    }
    else
    {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            transactions[numOfTransactions] = amount;
            transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was withdrawn.";
            numOfTransactions++;
        }
    }
}

}//end of class




class BankAccount{

private int accountNumber;
private String holderName;
private String holderAddress;
private String openDate;
private double balance;
private double[] transactions;
private String[] transactionsSummary;
private int numOfTransactions;
private  static int noOfAccounts=0;

public String getAccountInfo(){
    return "Account number: " + accountNumber + "\nCustomer Name: " + holderName + "\nHolder's Address: " + holderAddress + "\nOpen Date: " + openDate +  "\nBalance:" + balance +"\n";
}

public String getTransactionInfo(int n)
{
    String transaction = transactionsSummary[n];
    if (transaction == null) {
        return "No transaction exists with that number.";
    }
    else {
        return transaction;
    }
}

public BankAccount(String abc, double xyz, String address, String open){
    holderName = abc;
    balance = xyz;
    holderAddress = address;
    openDate = open;
    noOfAccounts ++;
    accountNumber = noOfAccounts;
    transactions = new double[100];
    transactionsSummary = new String[100];
    transactions[0] = balance;
    transactionsSummary[0] = "A balance of : $" + Double.toString(balance) + " was deposited.";
    numOfTransactions = 1;
}

public int getAccountNum(){
    return accountNumber;
}

public int getNumberOfTransactions() {
    return numOfTransactions;
}

public void deposit(double amount){

    if (amount<=0) {
        System.out.println("Amount to be deposited should be positive");
    } else {
        balance = balance + amount;
        transactions[numOfTransactions] = amount;
        transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was deposited.";
        numOfTransactions++;
    }
}

public void withdraw(double amount)
{
    if (amount<=0){
        System.out.println("Amount to be withdrawn should be positive");
    }
    else
    {
        if (balance < amount) {
            System.out.println("Insufficient balance");
        } else {
            balance = balance - amount;
            transactions[numOfTransactions] = amount;
            transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was withdrawn.";
            numOfTransactions++;
        }
    }
}

}