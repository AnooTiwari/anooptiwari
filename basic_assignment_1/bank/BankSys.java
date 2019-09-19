import java.util.*;
import java.lang.*;
public class BankSys {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
        int chequingAccNum=3016400;
        Boolean flag=false;

        /*Making object of the Saving Account and Current Account*/
        SavingsAccount s1 = new SavingsAccount();
       // ChequingAccount c1 = new ChequingAccount();
        ChequingAccount c1 = ChequingAccount.getObject();



        System.out.println("\n" + "Please select one of the following options");
        System.out.println("|  [ 1 ] : To Open Account       |");
        System.out.println("|  [ 2 ] : To Make A Deposit     |");
        System.out.println("|  [ 3 ] : To Make A Withdraw    |");
        System.out.println("|  [ 4 ] : To Pay Interest       |");
        System.out.println("|  [ 5 ] : To View Transactions  |");
        System.out.println("|  [ 0 ] : To Quit               |");
        type = input.next().trim().toUpperCase().charAt(0);

        while (type != '0') {/*Wile true concept remove*/

            if (type == '1') {
               
                    System.out.print("Please enter Account Holder Name  ");
                    input.nextLine();
                    name=input.nextLine();
                    System.out.print("Please select the type of account open [ S ]  Saving  & [ C ] Checking :");
                    selection = input.next().trim().toUpperCase().charAt(0);
                    if (selection == 'S') {

                    System.out.print("Savings Account Number : "+(savingAccNum+1)+"  \n");
                    accNum =  (savingAccNum+1);
                    savingAccNum++;
                    flag=true;
                    // Savings.add(accNum);

                    System.out.print("Please enter starting balance :$");
                    balance = input.nextDouble();
                    if(flag==true && balance>499){
                    flag=false;
                    }                    
                    else{
                    System.out.println("Starting  balance Should be minimum :Rs 500/-");
                    savingAccNum--;
                    }   
                    if(!flag){
                    s1.setBalance(balance);             
                    System.out.print("Please enter the current interest rate :");
                    rate = Math.abs(input.nextDouble());
                    s1.setRate(rate); 
                    Savings.add(accNum);
                }


                } else if (selection == 'C') {
                    System.out.println("Chequing Account Number :"+(chequingAccNum+1));
                    accNum = (chequingAccNum+1);
                    
                    chequingAccNum++;
                    flag=true;
                    System.out.println("Please enter starting balance :$");
                    balance = input.nextDouble();
                    if(flag==true && balance>=10000){
                    flag=false;
                    }                    
                    else{
                    System.out.println("Starting  balance Should be minimum :Rs 10k");
                    chequingAccNum--;
                    }   
                    if(!flag){
                    c1.setBalance(balance);                
                   // ChequingAccount c1 = new ChequingAccount(name,accNum,balance);
                    Chequing.add(accNum);
                }
            }


            } else if (type == '2') {
                System.out.print("Please enter the account number you wish to make a deposit to :");
                accNum= input.nextInt();

                if (Savings.contains(accNum)) {
                    System.out.print("Please enter how much you want to deposit to your Savings Account :$");
                    total = input.nextDouble();
                    s1.deposit(total);
                } else if (Chequing.contains(accNum)) {
                    System.out.print("Please enter how much you will likt to deposit to your Chequing Account :$");
                    total = input.nextDouble();
                    c1.deposit(total);
                }

            } else if (type == '3') {
                System.out.print("Please enter an account number  :");
                accNum = input.nextInt();
                if (Savings.contains(accNum)) {
                    System.out.print("please enter the amount you wish to withdraw from your Saving Account");
                    total = Math.abs(input.nextDouble());
                    s1.withdraw(total,'s');
                } else if (Chequing.contains(accNum)) {
                    System.out.print("Please enter the amount from your Chequing Account");
                    total = Math.abs(input.nextDouble());
                    c1.withdraw(total,'c');
                }
            } else if (type == '4') {
                System.out.print("Please enter your account");
                accNum = input.nextInt();
                if (Savings.contains(accNum)) {
                    s1.payInterest();
                } else {
                    System.out.print("Sorry This account isnt a Savings Account");
                }
            } else if (type == '5') {
                System.out.print("Please enter a account number");
                accNum = input.nextInt();
                if (Savings.contains(accNum)) {
                    System.out.printf("\n" + "Transaction History for Account :%s", accNum);
                    System.out.println(s1.transactions.toString());

                }
                else if(Chequing.contains(accNum)) {
                    System.out.printf("\n" + "Transaction History for Account :%s", accNum);
                    System.out.println(c1.transactions.toString());

                }

            }
            else if(type=='0'){
                break;
            }

        System.out.println("\n" + "Please select one of the following options");
        System.out.println("|  [ 1 ] : To Open Account       |");
        System.out.println("|  [ 2 ] : To Make A Deposit     |");
        System.out.println("|  [ 3 ] : To Make A Withdraw    |");
        System.out.println("|  [ 4 ] : To Pay Interest       |");
        System.out.println("|  [ 5 ] : To View Transactions  |");
        System.out.println("|  [ 0 ] : To Quit               |");
        type = input.next().trim().toUpperCase().charAt(0);
        }

    }
}
