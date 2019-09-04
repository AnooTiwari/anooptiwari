public class CheckingAccount extends BankAccount {
    public BankAccount checking; 
    
    
public CheckingAccount (BankAccount Id, int balance) {
    super (Id, balance); 
    
}

public void deposit (int cents)
{
    super.deposit(cents);
}

public static String writeCheck(int cents){ 
CheckingAccount.dollarsToWords(); 
    
}

public static String dollarsToWords () { 
  
}
} 


