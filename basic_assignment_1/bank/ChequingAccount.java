    import java.util.Date;

    public class ChequingAccount extends Account {
        private static ChequingAccount obj = new ChequingAccount();

        private ChequingAccount() {}
        
        public static ChequingAccount getObject(){
            
            return obj;
        }


        public ChequingAccount(String cName, int accNum, double accBalance) {
            super(cName, accNum, accBalance);
            /*using account class varible */
        }


        public void deposit(double amount) {
            double accAmount = getBalance();
            double balance=0;
            if(amount>1){
            balance=accAmount += amount;
            setBalance(balance);
            System.out.printf("Your deposit of :Rs " + amount + " was successful your new account balance is :Rs %.2f",setBalance(balance));
            Transaction t1 = new Transaction(new Date()     , 'D'    ,  setBalance(balance),      "Deposit Made:");
            transactions.add(t1);
        }else
        System.out.println("Opps! Please give Correct Ammout");
        }


    }
