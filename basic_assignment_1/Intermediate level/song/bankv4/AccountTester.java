public class AccountTester
{
   public static void main(String[] args)
   {
      SavingsAccount momsSavings
            = new SavingsAccount(0.5);

      CheckingAccount harrysChecking
            = new CheckingAccount(100);

      momsSavings.deposit(10000);

      momsSavings.transfer(2000, harrysChecking);
      harrysChecking.withdraw(1500);
      harrysChecking.withdraw(80);

      momsSavings.transfer(1000, harrysChecking);
      harrysChecking.withdraw(400);

      // Simulate end of month
      momsSavings.addInterest();
      harrysChecking.deductFees();

      System.out.println("Mom's savings balance = $"
            + momsSavings.getBalance());

      System.out.println("Harry's checking balance = $"
            + harrysChecking.getBalance());
   }
}




/**
   A bank account has a balance that can be changed by
   deposits and withdrawals.
*/
public class BankAccount
{
   /**
      Constructs a bank account with a zero balance.
   */
   public BankAccount()
   {
      balance = 0;
   }

   /**
      Constructs a bank account with a given balance.
      @param initialBalance the initial balance
   */
   public BankAccount(double initialBalance)
   {
      balance = initialBalance;
   }

   /**
      Deposits money into the bank account.
      @param amount the amount to deposit
   */
   public void deposit(double amount)
   {
      balance = balance + amount;
   }

   /**
      Withdraws money from the bank account.
      @param amount the amount to withdraw
   */
   public void withdraw(double amount)
   {
      balance = balance - amount;
   }

   /**
      Gets the current balance of the bank account.
      @return the current balance
   */
   public double getBalance()
   {
      return balance;
   }

   /**
      Transfers money from the bank account to another account
      @param amount the amount to transfer
      @param other the other account
   */
   public void transfer(double amount, BankAccount other)
   {
      withdraw(amount);
      other.deposit(amount);
   }

   private double balance;
}




/**
   A checking account that charges transaction fees.
*/
public class CheckingAccount extends BankAccount
{
   /**
      Constructs a checking account with a given balance.
      @param initialBalance the initial balance
   */
   public CheckingAccount(double initialBalance)
   {
      // Construct superclass
      super(initialBalance);

      // Initialize transaction count
      transactionCount = 0;
   }

   public void deposit(double amount)
   {
      transactionCount++;
      // Now add amount to balance
      super.deposit(amount);
   }

   public void withdraw(double amount)
   {
      transactionCount++;
      // Now subtract amount from balance
      super.withdraw(amount);
   }

   /**
      Deducts the accumulated fees and resets the
      transaction count.
   */
   public void deductFees()
   {
      if (transactionCount > FREE_TRANSACTIONS)
      {
         double fees = TRANSACTION_FEE *
               (transactionCount - FREE_TRANSACTIONS);
         super.withdraw(fees);
      }
      transactionCount = 0;
   }

   private int transactionCount;

   private static final int FREE_TRANSACTIONS = 3;
   private static final double TRANSACTION_FEE = 2.0;
}




/**
   An account that earns interest at a fixed rate.
*/
public class SavingsAccount extends BankAccount
{
   /**
      Constructs a bank account with a given interest rate.
      @param rate the interest rate
   */
   public SavingsAccount(double rate)
   {
      interestRate = rate;
   }

   /**
      Adds the earned interest to the account balance.
   */
   public void addInterest()
   {
      double interest = getBalance() * interestRate / 100;
      deposit(interest);
   }

   private double interestRate;
}
