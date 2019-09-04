import java.util.Scanner;
class account
{
  private long accountNum;
  private String name;
  long balance;
  public void setdataA(long A)
  {
    accountNum=A;
  }
  public void setdataB(long B)
  {
    balance=B;
  }
  public void setdataN(String N)
  {
    name=N;
  }
  public long getdataA()
  {
    return(accountNum);
  }
  public String getdataN()
  {
    return(name);
  }
  public long getdataB()
  {
    return(balance);
  }
}
class intrest extends account
{
  private int year,rateofintrest;
  private long intrest;
  public void setRateofintrest(int ROI)/*rate of intrest ROI*/
  {
    rateofintrest=ROI;
  }
  public void SetYear(int Y)
  {
    year=Y;
  }
  public long intrest()
  {
    intrest=((balance*year*rateofintrest)/100);
    return (intrest);

  }
  public void withdrawal(long Wamount)/*amount come from main withdrael amount == Wamount*/
  {
    balance=balance-Wamount;
    //return (balance);
  }
  public long Wdrawal()
  {
    return (balance);
  }
  public void setdeposit(long Damount)/*deposit amount==Damount*/
  {
    balance=balance+Damount;

  }
  public long getdeposit()
  {
    return (balance);
  }

}
class BANK
{

  public static void main(String args[])
  {String Aname;long Anumber,Baccount,WA,DA;int roi,y,ch1,ch2,k=1;
    intrest obj=new intrest();

    Scanner sc=new Scanner(System.in);

    System.out.println("Entetr the name of the Account holder ");
    Aname=sc.next();
    obj.setdataN(Aname);

    System.out.println("Enter the account number");
    Anumber=sc.nextLong();
    obj.setdataA(Anumber);

    System.out.println("Feed the balance detail");
    Baccount=sc.nextLong();
    obj.setdataB(Baccount);

    System.out.println("Enter the Rate of Intrest");
    roi=sc.nextInt();
    obj.setRateofintrest(roi);

    System.out.println("Enter the intrest year");
    y=sc.nextInt();
    obj.SetYear(y);
    while(k>0)
    {
      System.out.println("IF want to update you account Balance press 1 or 0 for exit");
      ch1=sc.nextInt();
      switch(ch1)
      {
        case 1:
        System.out.println("Press 1 for withdral 2 for deposit,3 for exit");
        ch2=sc.nextInt();
        switch(ch2)
        {
          case 1:
          System.out.println("Enter the Withdrol amount");
          WA=sc.nextLong();
          if(WA>obj.balance)
          System.out.println("you can't Withdrol more then balance money");
          else
          {
            obj.withdrawal(WA);
            System.out.println("your new balance is "+obj.Wdrawal());
          }
          break;
          case 2:
          System.out.println("Enter the deposit amount");
          DA=sc.nextLong();
          obj.setdeposit(DA);
          System.out.println("your new balance is "+obj.getdeposit());

          break;
          case 3:
          //System.exit(0);
          break;
        }
        break;
        case 0:
        System.out.println("Thanks for visiting bank");
        //System.exit(0);
        k=0;
        break;
      }

      System.out.println("Account owner name is "+obj.getdataN());
      System.out.println("accounr number is "+obj.getdataA());
      System.out.println("balance is "+obj.getdataB());
      System.out.println("intrest on amount is  "+obj.intrest());

    }

  }}
