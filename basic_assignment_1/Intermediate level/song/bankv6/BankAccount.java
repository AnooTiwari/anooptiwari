abstract class BankAccount {
    
    private final BankAccount acctID;
    private int acctBalance = 0; 
    public BankAccount checking; 
    public BankAccount savings; 
    
    public BankAccount (BankAccount Id, int balance){ 
        this.acctID = Id; 
        this.acctBalance = balance; 
    }
    
    
    public void deposit (int cents){ 
        acctBalance = acctBalance + cents; 
    }
    
    public boolean withdraw (int cents){ 
        if(acctBalance<cents){
            System.out.println("There are insufficient funds."); 
            return false; 
        } else 
            return true;    
    }
    
    public int balance (BankAccount acctID) { 
        return acctBalance; 
    }
    
    public static boolean transfer (int cents, BankAccount fromAccount, BankAccount toAccount) {
        if (fromAccount.acctBalance > cents){ 
            fromAccount.acctBalance = fromAccount.acctBalance - cents; 
            toAccount.acctBalance = toAccount.acctBalance + cents; 
            return true; 
        } else 
            System.err.println("Insufficient funds");
        return false; 
    }
    
}

