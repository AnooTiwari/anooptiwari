import java.util.*;
import javax.swing.*;
import java.io.*;

public class Round_robin{
  public static void main(String args[]){
    int m=Integer.parseInt(JOptionPane.showInputDialog( "Menu\nRound Robin\n\nEnter 1 for Start "));
    if (m==1)
    {
      RR();
    }
    else
    {
      JOptionPane.showMessageDialog(null,"Error Message","Error!",JOptionPane.ERROR_MESSAGE);
    }
  }/*Main  Funtion End*/
  public static void RR()
  {
    Scanner sc = new Scanner(System.in);
    int i,j,k,q,sum=0;
    String output1[]=new String[10];
    int n=Integer.parseInt(JOptionPane.showInputDialog( "\nEnter the process : "));
    int bt[]=new int[n];
    int wt[]=new int[n];
    int tat[]=new int[n];
    int a[]=new int[n];

    for(i=0;i<n;i++){
      bt[i]=Integer.parseInt(JOptionPane.showInputDialog( "\nEnter Burst time for P"+(i+1)+" : "));
    }

    q=Integer.parseInt(JOptionPane.showInputDialog( "\nEnter Time quantum:  "));
    for(i=0;i<n;i++)
    a[i]=bt[i];
    for(i=0;i<n;i++)
    wt[i]=0;
    do{
      for(i=0;i<n;i++){
        if(bt[i]>q){
          bt[i]-=q;
          for(j=0;j<n;j++){
            if((j!=i)&&(bt[j]!=0))
            wt[j]+=q;
          }
        }
        else{
          for(j=0;j<n;j++){
            if((j!=i)&&(bt[j]!=0))
            wt[j]+=bt[i];
          }
          bt[i]=0;
        }
      }
      sum=0;
      for(k=0;k<n;k++)
      sum=sum+bt[k];
    }
    while(sum!=0);
    for(i=0;i<n;i++)
    tat[i]=wt[i]+a[i];
    
    for(i=0;i<n;i++){
      JOptionPane.showMessageDialog(null,"process"+(i+1)+"  "+a[i]+"  "+wt[i]+"  "+tat[i],"Output",JOptionPane.INFORMATION_MESSAGE);
    }

    float avg_wt=0;
    float avg_tat=0;
    for(j=0;j<n;j++){
      avg_wt+=wt[j];
    }
    for(j=0;j<n;j++){
      avg_tat+=tat[j];
    }
    JOptionPane.showMessageDialog(null,"\nAverage Waiting Time =  " + (avg_wt/n)," Round Robin",JOptionPane.INFORMATION_MESSAGE);
    JOptionPane.showMessageDialog(null,"\nAverage turn around time  "+(avg_tat/n)," Round Robin",JOptionPane.INFORMATION_MESSAGE);
  }
}
