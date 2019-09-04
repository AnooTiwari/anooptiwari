public class BankAccount {
	private static final int AnnualInterestRate = 0;



	public static void main(String[] args) {
	}
		
	private double balance = 70.0;
	private double deposits = 0;
	private double withdrawals = 0;
	private double interestRate ;
	private double serviceCharge = 1;
	private double MonthlyServiceCharge=0;

	

	public BankAccount(double balance, double interestRate) {
          this.setBalance(balance);
          this.setInterestRate(interestRate);
          this.setDeposits(1);
	}


	public double deposit(double depositAmount){
		balance += depositAmount;
		return balance;
	}
	public double setBalance(double balance){
		return balance;
		
	}
	public double getBalance(){
		return balance;
	}
	public double getWithdrawals(){
		
		
		return withdrawals;
	}

	public double withdraw(double withdrawAmount){
		 if ( withdrawAmount > balance )
			 return -1;
		 else balance -= withdrawAmount;
		 
		 System.out.println("BankAccount Withdraw");
		 return withdrawAmount;
	} 

	private double calcInterest(){
	double	MonthlyInterestRate = (AnnualInterestRate / 12);
	double	MonthlyInterest = balance * MonthlyInterestRate;
		balance = balance + MonthlyInterest;
		     return MonthlyInterest; 
	}
	protected void monthlyProcess(){
		balance -= serviceCharge;
		calcInterest();
		withdrawals =setDeposits((int)(serviceCharge =0));
	}
	
	public void setMonthlyServiceCharge(double  MonthlyServiceCharge){
		MonthlyServiceCharge= 0;
	}
	public double getMonthlyServiceCharge() {
		return MonthlyServiceCharge;
	}
	

	public int setDeposits(int deposits) {
		this.deposits = deposits;
		return deposits;
	}


	public double getDeposits() {
		return deposits;
	}


	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}


	public double getInterestRate() {
		return interestRate;
	}
}

