import java.util.Date;
public class Account {//Begin Class
	//Declare all variables as private
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated;
	private double intRate;
//Use the no arg constructor that creates a default constructor for account
	public Account(){//Start
	}//End
	
//Constructor to allow driver to assign values to id and balance
	public Account(int updatedID, double updatedBalance){//Start Constructor
		id = updatedID;
		balance = updatedBalance;
		dateCreated = new Date();
	}//End Constructor
	
//All accessors
		//Getter method for id
		public int getID(){//StartgetID
			return id;
		}//EndgetID
	
		//Getter method for balance
		public double getBalance(){//StartgetBal
			return balance * 100 / 100.00;
		}//EndgetBal
	
		//Getter method for annualInterestRate
		public double getAnnualInterestRate(){//StartgetIntRate
			return annualInterestRate;
		}//EndgetIntRate
	
		//Getter method for dateCreated
		public Date getDateCreated(){//StartgetDate
			return dateCreated;
		}//EndgetDate

//All mutators
		//Setter method for id
		public void setID(int updatedID){//StartsetID
			id = updatedID;
		}//EndsetID
		
		//Setter method for balance
		public void setBalance(double updatedBalance){//StartsetBal
			balance = updatedBalance;
		}//EndsetBal

		//Setter method for annualInterestRate
		public void setAnnualInterestRate(double updatedAnnualInterestRate){//StartsetIntRate
			annualInterestRate = updatedAnnualInterestRate;
		}//EndsetIntRate

//Methods
		//Method for finding the monthly interest rate
		public double getMonthlyInterestRate(){//StartgetMonRate
			return annualInterestRate/12;
		}//EndgetMonRate
		
		//Method for depositing the driver specified amount
		public void deposit(double amountDeposit){//Startdeposit
			balance += amountDeposit;
		}//Enddeposit
		
		//Method for withdrawing the driver specified amount
		public void withdraw(double amountWithdraw){//Startwithdraw
			balance -= amountWithdraw;
		}//Endwithdraw
}//End Class
