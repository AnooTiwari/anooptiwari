import java.util.*;
public class Account_Records_Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        ArrayList Savings =new ArrayList();
        ArrayList Chequing=new ArrayList();



        String name;
        char type;
        char selection;
        double balance;
        double rate;
        String accNum;       
        double total;


        SavingsAccount s1 = new SavingsAccount();
        ChequingAccount c1 = new ChequingAccount();



        System.out.println("\n" + "Please select one of the following options");
        System.out.println("|  [ O ] : To Open Account       |");
        System.out.println("|  [ D ] : To Make A Deposit     |");
        System.out.println("|  [ W ] : To Make A Withdraw    |");
        System.out.println("|  [ I ] : To Pay Interest       |");
        System.out.println("|  [ T ] : To View Transactions  |");
        System.out.println("|  [ Q ] : To Quit               |");
        type = input.next().trim().toUpperCase().charAt(0);

        while (type != 'Q') {

            if (type == 'O') {
                System.out.print("Please select the type of account you will like to open [ S ]-Saving or [ C ]-Checking :");
                selection = input.next().trim().toUpperCase().charAt(0);
                if (selection == 'S') {
                    System.out.print("Please enter Account Holder Name");
                    name=input.next();

                    System.out.print("Please enter a Savings Account Number : ");
                    accNum = input.next();
                    Savings.add(accNum);

                    System.out.print("Please enter starting balance :$");
                    balance = input.nextDouble();
                    s1.setBalance(balance);



                    System.out.print("Please enter the courrent interest rate :");
                    rate = input.nextDouble();
                    s1.setRate(rate); 
                    Savings.add(accNum);





                } else if (selection == 'C') {
                    System.out.print("Please enter a Chequing Account Number :");
                    accNum = input.next();
                    Chequing.add(accNum);
                    System.out.print("Please enter starting balance :$");
                    balance = input.nextDouble();
                    c1.setBalance(balance);
                }


            } else if (type == 'D') {
                System.out.print("Please enter the account number you wish to make a deposit to :");
                accNum= input.next();

                if (Savings.contains(accNum)) {
                    System.out.print("Please enter how much you will like to deposit to your Savings Account :$");
                    total = input.nextDouble();
                    s1.deposit(total);
                } else if (Chequing.contains(accNum)) {
                    System.out.print("Please enter how much you will likt to deposit to your Chequing Account :$");
                    total = input.nextDouble();
                    c1.deposit(total);
                }

            } else if (type == 'W') {
                System.out.print("Please enter an account number  :");
                accNum = input.next();
                if (Savings.contains(accNum)) {
                    System.out.print("please enter the amount you wish to withdraw from your Saving Account");
                    total = input.nextDouble();
                    s1.withdraw(total);
                } else if (Chequing.contains(accNum)) {
                    System.out.print("Please enter the amount you wish to withdraw from your Chequing Account");
                    total = input.nextDouble();
                    c1.withdraw(total);
                }
            } else if (type == 'I') {
                System.out.print("Please enter your account");
                accNum = input.next();
                if (Savings.contains(accNum)) {
                    s1.payInterest();
                } else {
                    System.out.print("Sorry This account isnt a Savings Account");
                }
            } else if (type == 'T') {
                System.out.print("Please enter a account number");
                accNum = input.next();
                if (Savings.contains(accNum)) {
                    System.out.printf("\n" + "Transaction History for Account :%s", accNum);
                    System.out.println(s1.transactions.toString());

                }
                else if(Chequing.contains(accNum)) {
                    System.out.printf("\n" + "Transaction History for Account :%s", accNum);
                    System.out.println(c1.transactions.toString());

                }

            }
            else if(type=='Q'){
                break;
            }

        System.out.println("\n" + "Please select one of the following options");
        System.out.println("|  [ O ] : To Open Account       |");
        System.out.println("|  [ D ] : To Make A Deposit     |");
        System.out.println("|  [ W ] : To Make A Withdraw    |");
        System.out.println("|  [ I ] : To Pay Interest       |");
        System.out.println("|  [ T ] : To View Transactions  |");
        System.out.println("|  [ Q ] : To Quit               |");
        type = input.next().trim().toUpperCase().charAt(0);
        }

    }
}