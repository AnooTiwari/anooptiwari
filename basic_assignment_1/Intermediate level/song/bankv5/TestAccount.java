import javax.swing.*;
public class TestAccount {
	public static void main(String[] args){
	//Checking or savings GUI
	String acctType = JOptionPane.showInputDialog(null,
			"Create Checking or Savings Account",
			"Enter 'Checking' or 'Savings'");
	//Account ID box
	String idNum = JOptionPane.showInputDialog(null,
			"Enter 3 Digit Account Number",
			"Account Number");
	int ID = Integer.parseInt(idNum);
	//Account Balance box
	String acctBal = JOptionPane.showInputDialog(null,
			"Enter Initial account balance",
			"$xxxx.xx");
	double Balance = Double.parseDouble(acctBal);
	//Initial Interest Rate
	String iniRate = JOptionPane.showInputDialog(null,
			"Enter Initial Interest rate (4.5% = .045",
			"Interest Rate");
	double intRate = Double.parseDouble(iniRate);
			
	//Create checking or saving object
	if(acctType == "Checking"){//IF Checking
		Account acct = new CheckingAccount(ID, Balance, intRate);
		String withdrawl = JOptionPane.showInputDialog(null,
				"Would you like to withdraw or deposit?",
				"Enter 'Withdraw' or 'Deposit'");
		if(withdrawl == "Withdraw"){//Start with
			String withdrawlAmt = JOptionPane.showInputDialog(null,
					"Enter amount to withdraw (Will throw exception if insufficient funds",
					"$");
			double withdraw = Double.parseDouble(withdrawlAmt);
			acct.withdraw(withdraw);
		}//End with
		if(withdrawl == "Deposit"){//Startdepo
			String depoAmt = JOptionPane.showInputDialog(null,
					"Enter amount to deposit",
					"$");
			double deposit = Double.parseDouble(depoAmt);
			acct.deposit(deposit);
		}//Enddepo
		String checkInfo = "Account type: " + acctType + "\nID Number: " + idNum + "\nAccount Balance: $" + acct.getBalance() + 
			"\nInterest Rate: " + intRate*100 + "%" + "Date Created: " + acct.getDateCreated();
		JOptionPane.showMessageDialog(null,
				checkInfo);
	}//End IF Checking
		
	}
	
}

