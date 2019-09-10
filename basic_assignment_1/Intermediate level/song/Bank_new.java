import java.util.Date;
			import java.util.Date;
			import java.text.DateFormat;
			import java.text.SimpleDateFormat;

			class Banknew
			{
				private int accNumber;
				private String accName;
				private long accBalence;
				private static double intRate;
				private String accType;
				
				private double[] transactions;
				private String[] transactionsSummary;
				private int numOfTransactions=0;

				public Banknew(String type,int AC){
					this.accType=type;
					this.accNumber=Ac;
					transactions = new double[100];
    				transactionsSummary = new String[100];
				    transactions[0] = accBalence;
  					transactionsSummary[0] = "A balance of : $" + Double.toString(accBalence) + " was deposited.";
  					//numOfTransactions = 1;
				}
				public String getTransactionInfo(int n)
				{
					String transaction = transactionsSummary[n];
					if (transaction == null) {
						return "No transaction exists with that number.";
					}
					else {
						return transaction;
					}
				}
				public void Set_Accout_Name(String Name)
				{
					this.accName=Name;
				}
				public void set_Account_Balance(long Balance)
				{
					this.accBalence=Balance;

				}
				public void set_intrest_rate(float irate)
				{

					this.intRate=irate;
				}
				public long get_Account_Number()
				{

					return accNumber;
				}
				public long get_Account_Balance()
				{
					return accBalence;
				}
				public String get_Account_Name()
				{
					return accName;
				}
				public double get_interest_rate()
				{
					return intRate;
				}

				double getMonthlyInterestRate() {
					return intRate/12/100 * accBalence;
				}

				double withdraw(double amount) {
					return accBalence -= amount;
				}

				double deposit(double amount) {
					if(amount>100)
						return accBalence += amount;
					else
						System.out.print("Cannot be done");
					return accBalence;
					transactions[numOfTransactions] = amount;
					transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was deposited.";
					numOfTransactions++;
				}
				String get_Accout_type(){
					return accType;
				}

			}
			class Saving_account extends Banknew
			{
				Double Saving_min_balance=500,checkamt,max_wid_limit=100000;
				private double[] transactions;
				private String[] transactionsSummary;
				private int numOfTransactions;
				public Saving_account(String acc_Type, int accNumber) {
					super.(acc_type,Acc_num);
					transactions[0] = Saving_min_balance;
					super.transactionsSummary[0] = "A balance of : $" + Double.toString(Saving_min_balance) + " was deposited.";
					numOfTransactions = 1;
				}
				public double withdraw(double amount) {

					checkamt=get_Account_Balance() -Amount;
					if(checkamt <= Saving_min_balance|| amount>max_wid_limit)
					{
						System.out.print("Cannot be done");
					}
					else{
						return super.withdraw(amount);
						transactions[numOfTransactions] = amount;
            			transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was withdrawn.";
           				numOfTransactions++;
           			}
				}
				public void Display_details()/* Provide a way to know if an account is current or savings account.*/
				{

					super.get_Account_Balance();
					super.get_interest_rate();
					super.get_Account_Name();
					super.get_Account_Number();
					super.get_Accout_type();
				}

			}
			public class current_account extends Banknew
			{
				final double min_bal=10000,checkamt;
				private double[] transactions;
				private String[] transactionsSummary;
				private int numOfTransactions;
				private double overdrafLimit;
				public current_account( String type ,int newId) {
					super.(type,newId);
					setOverdraftLimit(overdrafLimit);
					transactions[0] = min_bal;
					transactionsSummary[0] = "A balance of : $" + Double.toString(min_bal) + " was deposited.";
					numOfTransactions = 1;
				}
				public void setOverdraftLimit(double o) {
					overdraftLimit = o;
				}
				public double getOverdraftLimit() {
					return overdraftLimit;
				}
				public void Display_details()
				{

					super.get_Account_Balance();
					super.get_interest_rate();
					super.get_Account_Name();
					super.get_Account_Number();
					super.get_Accout_type();
				}

				public double withdraw(double amount) {

					checkamt=get_Account_Balance() -amount;
					if(checkamt <= min_bal)
					{
						System.out.print("Cannot be done");
					}
					else{
						return super.withdraw(amount);
						transactions[numOfTransactions] = amount;
            			transactionsSummary[numOfTransactions] = "$" + Double.toString(amount) + " was withdrawn.";
           				numOfTransactions++;
           			}
				}

			}
			public class Bank_System {

				public static void main(String[] args)throws IOException {
					int act=20190;

					BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					while(true)
					{

						int Ac_no=act;
					System.out.println("Account Number is  : "+Ac_no);//auto assign

					System.out.println("Enter Account Holder Name :");
					String Ac_name=br.readLine();

					System.out.println("Enter Account Opening balance Balance :");
					double Ac_bal=Double.parseDouble(br.readLine());

					System.out.println("Enter Account Interest :");
					double AC_irate=Double.parseDouble(br.readLine());

					System.out.println("Enter Withdrawal amount :");
					double Ac_wid_amt=Double.parseDouble(br.readLine());
					act++;
				}
			}
		}
