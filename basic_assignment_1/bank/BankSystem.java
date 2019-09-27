    import java.util.*;
    import java.lang.*;
    import java.util.HashMap;
    import java.util.Map;
    public class BankSystem {
    	 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    	    ArrayList Savings =new ArrayList();
    	    ArrayList Chequing=new ArrayList();
         	String name;
            char type;
            char selection;
            double balance;
            double rate;
            int accNum;       
            double total;
            int savingAccNum=2016400;
            int chequingAccNum=3016300;
            Boolean flag=false;
         	Map < Integer,Integer> map = new HashMap < > ();
         	List  list = new ArrayList();
         while(true)
         {
         	System.out.println("\n" + "Please select one of the following options");
            System.out.println("|  [ 1 ] : To Open Account       |");
            System.out.println("|  [ 2 ] : To Make A Deposit     |");
            System.out.println("|  [ 3 ] : To Make A Withdraw    |");
            System.out.println("|  [ 4 ] : To Pay Interest       |");
            System.out.println("|  [ 5 ] : To View Transactions  |");
            System.out.println("|  [ 0 ] : To Quit               |");
            type = sc.next().trim().toUpperCase().charAt(0);sc.nextLine();
            if (type == '1') {
            	System.out.println("[S]:\tsaving\tAccount\t[C]\t:\tCurrent\tAccount");
            	selection=sc.next().trim().toUpperCase().charAt(0);
            	sc.nextLine();
            	switch(selection)
            	{
            		case 'S':
            		SavingsAccount s1 = new SavingsAccount();
            		System.out.println("Enter the Account-Holder Name");
            		flag= s1.setName(sc.nextLine()); 
            		if(!flag)break;
            		System.out.println("Enter the Opening Amount");
                		while (true)
    	            	try {
    	                balance = Double.parseDouble(sc.nextLine());
    	        		double x=s1.setBalance(balance);
                        if(x>0)break;
                        else System.out.println("Opening Amount Should be Minimum 500/-");
    	            	} catch (NumberFormatException nfe) {
    	                System.out.print("Try again: ");
    	            	}
            		accNum=savingAccNum++;
    				System.out.println("Congratulation Your Saving - Account Number is [ "+accNum+" ]");
    				System.out.println("Enter the Interest Rate");
                        while (true)
                            try {
                            rate = Double.parseDouble(sc.nextLine());
                            s1.setRate(rate);
                            break;
                            } catch (NumberFormatException nfe) {
                            System.out.print("Try again Mismatch input: ");
                            }
    				Savings.add(accNum);
    				list.add(s1);
    				map.put(accNum,list.indexOf(s1));
    				System.out.println(list);
            		break;
            		case 'C':
            		System.out.println("Enter the Firm Name");
                    name=sc.nextLine();
                        while(!name.matches("[a-zA-Z]+"))
                        {
                        System.out.println("Please enter a valid name!");
                        name = sc.nextLine();
                        }
                    System.out.println("Enter the Opening Amount");
                    while (true)
                            try {
                            balance = Double.parseDouble(sc.nextLine());
                            break;
                            } catch (NumberFormatException nfe) {
                            System.out.print("Try again: ");
                            }
            		if(balance>9999)
            		flag=true;
            		else{
            		System.out.println("Minimum Account Opening balance 10000/-");
            		break;
            		}
            		accNum=chequingAccNum++;
    				System.out.println("Congratulation Your Current - Account Number is [ "+accNum+" ]");
    				Chequing.add(accNum);
    				ChequingAccount c1 = new ChequingAccount(name,accNum,balance);
    				list.add(c1);
    				map.put(accNum,list.indexOf(c1));
    				System.out.println(list);
            		break;
            	}
            }
            else if (type == '2') {
            	System.out.print("Please enter the Account-Number :");
                while (true)
                    try {
                    accNum = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input: ");
                    }
                 if (Savings.contains(accNum)) {
                        System.out.print("Please enter Amount to deposit to your [ Savings Account ] :Rs ");
                        while (true)
                            try {
                            total = Double.parseDouble(sc.nextLine());
                            break;
                            } catch (NumberFormatException nfe) {
                            System.out.print("Try again: ");
                            }
                        int index=map.get(accNum);
                        SavingsAccount sobj=(SavingsAccount)list.get(index);
                        sobj.deposit(total);
                    }
                     else if (Chequing.contains(accNum)) {
                        System.out.print("Please enter Amount to deposit to your [ Current Account ]:Rs");
                        while (true)
                        try {
                            total = Double.parseDouble(sc.nextLine());
                            break;
                            } catch (NumberFormatException nfe) {
                            System.out.print("Try again: ");
                            }
                        int index=map.get(accNum);
                        ChequingAccount cobj=(ChequingAccount)list.get(index);
                        cobj.deposit(total);
                    }
                    else
                    {
                        System.out.println("Account-Number doesn't exist");
                    }
            }
            else if (type == '3') {
            	System.out.print("Please enter an account number  :");
                        while (true)
                        try {
                        accNum = Integer.parseInt(sc.nextLine());
                        break;
                        } catch (NumberFormatException nfe) {
                        System.out.print("Try again Mismatch input: ");
                        }
                    if (Savings.contains(accNum)) {
                        System.out.print("please enter the amount you wish to withdraw from your [ Saving Account ]");
                         while (true)
                            try {
                            total = Double.parseDouble(sc.nextLine());
                            break;
                            } catch (NumberFormatException nfe) {
                            System.out.print("Try again: ");
                            }
                        int index=map.get(accNum);
                        SavingsAccount sWobj=(SavingsAccount)list.get(index);
                        sWobj.withdraw(total,'s');
                    } else if (Chequing.contains(accNum)) {
                        System.out.print("Please enter the amount from your Chequing Account");
                        while (true)
                            try {
                            total = Double.parseDouble(sc.nextLine());
                            break;
                            } catch (NumberFormatException nfe) {
                            System.out.print("Try again : ");
                            }
                        int index=map.get(accNum);
                        ChequingAccount cWobj=(ChequingAccount)list.get(index);
                        cWobj.withdraw(total,'c');
                    }
                    else
                    {
                        System.out.println("Account-Number doesn't exist");
                    }
            }
            else if (type == '4') {
            		System.out.print("Please enter your account : ");
                    while (true)
                    try {
                    accNum = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input : ");
                    }
                    if (Savings.contains(accNum)) {
                    	int index=map.get(accNum);
                        SavingsAccount sIobj=(SavingsAccount)list.get(index);
                        sIobj.payInterest();
                    } else {
                        System.out.print("Sorry This account isn't a [ Savings Account ] or "+"Account-Number doesn't exist");
                    }
            }
            else if (type == '5') {
            		System.out.print("Please enter a account number");
                    while (true)
                    try {
                    accNum = Integer.parseInt(sc.nextLine());
                    break;
                    } catch (NumberFormatException nfe) {
                    System.out.print("Try again Mismatch input: ");
                    }
                    if (Savings.contains(accNum)) {
                        System.out.printf("\n" + "Transaction History for Account :%s", accNum);
                        int index=map.get(accNum);
                        SavingsAccount sTobj=(SavingsAccount)list.get(index);
                        System.out.println(sTobj.transactions.toString());
                    }
                    else if(Chequing.contains(accNum)) {
                        System.out.printf("\n" + "Transaction History for Account :%s", accNum);
                        int index=map.get(accNum);
                        ChequingAccount cTobj=(ChequingAccount)list.get(index);
                        System.out.println(cTobj.transactions.toString());
                    }
                    else
                    {
                        System.out.println("Account-Number doesn't exist");
                    }
            }
            else if (type == '0') {

            	break;
            }            
         }
     }
    }