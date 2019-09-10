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
        String acc_num;       
        double total;


        SavingsAccount s1 = new SavingsAccount();
        ChequingAccount c1 = new ChequingAccount();



        System.out.println("\n" + "Please select one of the following options");
        System.out.println("|  o-To Open Account       |");
        System.out.println("|  d-To Make A Deposit     |");
        System.out.println("|  w-To Make A Withdraw    |");
        System.out.println("|  i-To Pay Interest       |");
        System.out.println("|  t-To View Transactions  |");
        System.out.println("|  q-To Quit               |");
        type = input.next().trim().toUpperCase().toLowerCase().charAt(0);

        while (type != 'q') {

            if (type == 'o') {
                System.out.print("Please select the type of account you will like to open s-Saving or c-Checking :");
                selection = input.next().trim().toUpperCase().toLowerCase().charAt(0);
                if (selection == 's') {
                    System.out.print("Please enter Account Holder Name");
                    name=input.next();

                    System.out.print("Please enter a Savings Account Number : ");
                    acc_num = input.next();
                    Savings.add(acc_num);

                    System.out.print("Please enter starting balance :$");
                    balance = input.nextDouble();
                    s1.setBalance(balance);



                    System.out.print("Please enter the courrent interest rate :");
                    rate = input.nextDouble();
                    s1.setRate(rate); 
                    Savings.add(acc_num);





                } else if (selection == 'c') {
                    System.out.print("Please enter a Chequing Account Number :");
                    acc_num = input.next();
                    Chequing.add(acc_num);
                    System.out.print("Please enter starting balance :$");
                    balance = input.nextDouble();
                    c1.setBalance(balance);
                }


            } else if (type == 'd') {
                System.out.print("Please enter the account number you wish to make a deposit to :");
                acc_num= input.next();

                if (Savings.contains(acc_num)) {
                    System.out.print("Please enter how much you will like to deposit to your Savings Account :$");
                    total = input.nextDouble();
                    s1.deposit(total);
                } else if (Chequing.contains(acc_num)) {
                    System.out.print("Please enter how much you will likt to deposit to your Chequing Account :$");
                    total = input.nextDouble();
                    c1.deposit(total);
                }

            } else if (type == 'w') {
                System.out.print("Please enter an account number  :");
                acc_num = input.next();
                if (Savings.contains(acc_num)) {
                    System.out.print("please enter the amount you wish to withdraw from your Saving Account");
                    total = input.nextDouble();
                    s1.withdraw(total);
                } else if (Chequing.contains(acc_num)) {
                    System.out.print("Please enter the amount you wish to withdraw from your Chequing Account");
                    total = input.nextDouble();
                    c1.withdraw(total);
                }
            } else if (type == 'i') {
                System.out.print("Please enter your account");
                acc_num = input.next();
                if (Savings.contains(acc_num)) {
                    s1.payInterest();
                } else {
                    System.out.print("Sorry This account isnt a Savings Account");
                }
            } else if (type == 't') {
                System.out.print("Please enter a account number");
                acc_num = input.next();
                if (Savings.contains(acc_num)) {
                    System.out.printf("\n" + "Transaction History for Account :%s", acc_num);
                    System.out.println(s1.transactions.toString());

                }
                else if(Chequing.contains(acc_num)) {
                    System.out.printf("\n" + "Transaction History for Account :%s", acc_num);
                    System.out.println(c1.transactions.toString());

                }

            }
            else if(type=='q'){
                break;
            }

            System.out.println("\n" + "Please select one of the following options");
            System.out.println("|  o-To Open Account       |");
            System.out.println("|  d-To Make A Deposit     |");
            System.out.println("|  w-To Make A Withdraw    |");
            System.out.println("|  i-To Pay Interest       |");
            System.out.println("|  t-To View Transactions  |");
            System.out.println("|  q-To Quit               |");
            type = input.next().trim().toUpperCase().toLowerCase().charAt(0);
        }

    }
}