
public class BankAccountTest {
public static void main(String[] args) {
		
		SavingsAccount a = new SavingsAccount(5000,500);
		
		
		a.deposit(0);
		System.out.println(a.getBalance());
		a.withdraw(5);
		a.withdraw(10);
		a.withdraw(50);
		a.withdraw(5);
		a.withdraw(15);
		a.withdraw(2);
		a.monthlyProcess();
	}

}

