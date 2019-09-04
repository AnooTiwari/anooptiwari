import javax.swing.*;
public class SavingsAccount extends Account {//Class


	public SavingsAccount(int updatedID, double updatedBalance, double intRate){//Start
		super(updatedID, updatedBalance);
	}//End
	
	public void withdraw(double amountWithdraw){
		if (getBalance() < amountWithdraw){
			JOptionPane.showMessageDialog(null,
					"Withdraw amount is larger than current balance");
		}
			return;
	}
	
}//EndClass
