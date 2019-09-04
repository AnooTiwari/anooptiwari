
import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author Bryan
 */
public class BankSys {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        BankSys newInstructions = new BankSys();
        newInstructions.instructions();
    }

    public void instructions () {
        System.out.println("Welcome to Infinite Tangent Bank");
        System.out.println("Please select from the following menu");
        System.out.print("1. Deposit                  ");
        System.out.print("2. Withdrawl \n");
        System.out.print("3. Transfer                 ");
        System.out.print("4. Check Balance \n");
        System.out.print("5. Write a Check            ");
        System.out.print("6. Exit \n");
        BankSys newMenu = new BankSys();
        newMenu.menuinfo();

    }

    public void menuinfo () {
        Scanner scanInput = new Scanner (System.in);
        int menu = scanInput.nextInt();
            if (menu == 1){
                System.out.println("Which account would you like to deposit to?");
                Scanner scanAcctIn = new Scanner(System.in);
                String acctIn = scanAcctIn.nextLine();
                if ("checking".equals(acctIn))
                {
                    System.out.println ("How much would you like to deposit?");
                    Scanner scanIn = new Scanner (System.in);
                    String dep = scanIn.nextLine();
                    String adep = dep.replace("$", "");
                    double bDep = Double.parseDouble(adep);
                    BankSys.convertToCents(bDep);
                    checking.deposit(cent);
                } else if ("savings".equals(acctIn))
                {
                    System.out.println ("How much would you like to deposit?");
                    Scanner scanIn = new Scanner (System.in);
                    String dep = scanIn.nextLine();
                    String adep = dep.replace("$", "");
                    double bDep = Double.parseDouble(adep);
                    BankSys.convertToCents(bDep);
                    savings.deposit(cent);

                }


            } else if (menu == 2) {
                System.out.println("Which account would you like to withdraw from?");
                Scanner scanAcctOut = new Scanner(System.in);
                String acctOut = scanAcctOut.nextLine();
                if("checking".equals(acctOut))
                {
                    System.out.println ("How much would you like to withdraw?");
                    Scanner scanOut = new Scanner (System.in);
                    String with = scanOut.nextLine();
                    String nWith = with.replace("$", "");
                    double aWith = Double.parseDouble(nWith);
                    BankSys.convertToCents(aWith);
                    checking.withdraw(cent);

                } else if ("savings".equals(acctOut)) {
                    System.out.println ("How much would you like to withdraw?");
                    Scanner scanOut = new Scanner (System.in);
                    String with = scanOut.nextLine();
                    String nWith = with.replace("$", "");
                    double aWith = Double.parseDouble(nWith);
                    BankSys.convertToCents(aWith);
                    savings.withdraw(cent);
                }



            } else if (menu == 3) {
                System.out.println("What bank account would you like to transfer from?");
                Scanner scanAcct1 = new Scanner (System.in);
                String transFrom = scanAcct1.nextLine();
                if ("checking".equals(transFrom)){

                    System.out.println("How much would you like to transfer?");
                    Scanner scanAmt = new Scanner (System.in);
                    String transfer = scanAmt.nextLine();

                    String nTransfer = transfer.replace("$", "");
                    double aTransfer = Double.parseDouble(nTransfer);
                    BankSys.convertToCents(aTransfer);
                    BankAccount.transfer(cent, checking, savings);
                } else if ("savings".equals(transFrom)){

                    System.out.println("How much would you like to transfer?");
                    Scanner scanAmt = new Scanner (System.in);
                    String transfer = scanAmt.nextLine();

                    String nTransfer = transfer.replace("$", "");
                    double aTransfer = Double.parseDouble(nTransfer);
                    BankSys.convertToCents(aTransfer);
                    BankAccount.transfer(cent, savings, checking);
                }
            } else if (menu == 4) {
                System.out.println("What account would you like to check the balance?");
                Scanner scanAcct3 = new Scanner (System.in);
                String checkbalance = scanAcct3.nextLine();
                if ("checking".equals(checkbalance))
                {
                    checking.balance();
                } else if ("savings".equals(checkbalance)){
                    savings.balance();
                }

            } else if (menu == 5) {
                System.out.println("How much will the check be for?");
                Scanner payThisMuch = new Scanner (System.in);
                String check = payThisMuch.nextLine();

                String nCheck = check.replace("$", "");
                double checka = Double.parseDouble (nCheck);
                BankSys.convertToCents(checka);

            } else if (menu == 6) {
                System.out.println("Have a nice day.");
                System.exit(0);

            } else {
                System.out.println("Please enter a correct choice.");
                BankSys newInstructions = new BankSys();
                newInstructions.instructions();
            }
    }


    public static int convertToCents (double money) {
        double newMoney = money * 100;
        int cent = (int)newMoney;
        System.out.println("You have " + cent + " cents"); //used this to check format
        BankSys.convertToDollars(cent); 
        return cent;
    }

    public static double convertToDollars (int cent){
        double newDollar = cent/100;
        System.out.println("You have $" + newDollar); //used this to check format and decimal places
        return newDollar;
    }

}
