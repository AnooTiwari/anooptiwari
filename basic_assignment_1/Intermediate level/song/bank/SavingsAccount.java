public class SavingsAccount extends BankAccount{
	public double balance, amount,initialBalance;	
	private boolean active;
	private int deposit;

	SavingsAccount(double balance, double interestRate) {
		super(balance, interestRate);
		if(balance < 25.0 ){
			setActive(true);
			System.out.println("Your account is Active");
		}

		else{
			setActive(false);
			System.out.println(" Your account is InActive.");
		}}

	public double deposit(double depositAmount) {
		balance+=depositAmount;
		deposit++;
		return balance;
	}
	public double withdraw(double withrawAmount) {
		double amount = 65.0;
		if (isActive()&& withrawAmount >= this.getBalance()){ 
			amount = super.withdraw (withrawAmount);
			if (getBalance()< 25.0)
				active = false;
		}
		System.out.println("The amount is: "+ amount );
		return amount;
	}
	protected void monthlyProcess() {
		if(this.getDeposits()> 4 )
			this.withdraw(getDeposits()-4);
		super.monthlyProcess();
		System.out.println(" The Total deposits is :"+ getDeposits());
	}	
	
	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean isActive() {
		return active;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}

	public double getDeposits() {
		return deposit;
	}
}

