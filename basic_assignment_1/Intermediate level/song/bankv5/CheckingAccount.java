import javax.swing.*;
public class CheckingAccount extends Account{
	private double overdraftLimit;
	
	//
	public CheckingAccount(int updatedID, double updatedBalance, double intRate){
		super(updatedID, updatedBalance);
	}
	
	public void setOverdraftLimit(){
		overdraftLimit = 0;
	}
	
	public double getOverdraftLimit(){
		return overdraftLimit;
	}
	public void withdraw(double amountWithdraw){
		if (getBalance() + overdraftLimit < amountWithdraw){
			JOptionPane.showMessageDialog(null, 
					"Amount overdraws account");
		}
		else
			return;
	}
	public String toString(){
		return ("Overdraft Limit: " + overdraftLimit);
	}
}
