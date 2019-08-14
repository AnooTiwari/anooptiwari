import java.util.*;
import javax.swing.*;
public class CpuScheduling1
{
  public static void main(String[ ]args)
  {
    int m=Integer.parseInt(JOptionPane.showInputDialog( "                Menu\n[1]First- Come First-Served\n\nEnter Choice:"));
    if (m==1)
    {
      FCFS();
    }
    else
    {
      JOptionPane.showMessageDialog(null,"Error Message","Error!",JOptionPane.ERROR_MESSAGE);
    }
  }
  public static void FCFS()
  {
    int bp[]=new int[5],wtp[] =new int[5],twt=0, awt,num;
    String output1[]=new String[10];
    for (num=0;num<=4;num++)
    {
      bp[num]=Integer.parseInt(JOptionPane.showInputDialog( "\nEnter Burst time for P"+(num+1)+" : "));
    }
    for (num=0;num<=4;num++)
    {
      if (num==0)
      {
        wtp[num]=0;
      }
      else
      {
        wtp[num]=wtp[ num-1]+bp[ num-1];
        output1[num]="\nWaiting time for P"+(num+1)+" = "+wtp[num];
      }
    }
    for (num=0;num<=4;num++)
    {
      twt=twt+wtp[ num];
    }
    awt=twt/5;
    JOptionPane.showMessageDialog(null,output1,"FCFS",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"\nAverage Waiting Time =" + awt,"FCFS",JOptionPane.INFORMATION_MESSAGE);
  }
}
