public class FCFS{
  static void WT(int processes[], int n, int bt[], int wt[], int at[])
  {
    int stime[] = new int[n];
    stime[0] = 0;
    wt[0] = 0;

    for (int i = 1; i < n ; i++)
    {
      stime[i] = stime[i-1] + bt[i-1];
      wt[i] = stime[i] - at[i];
      if (wt[i] < 0)
      wt[i] = 0;
    }
  }

  static void TT(int processes[], int n, int bt[],
  int wt[], int tat[])
  {
    for (int i = 0; i < n ; i++)
    tat[i] = bt[i] + wt[i];
  }
  static void AT(int processes[], int n, int bt[], int at[])
  {
    int wt[] = new int[n], tat[] = new int[n];
    WT(processes, n, bt, wt, at);
    TT(processes, n, bt, wt, tat);
    System.out.print("Processes " + " Burst Time " + " Arrival Time "
    + " Waiting Time " + " Turn-Around Time "
    + " Completion Time \n");
    int total_wt = 0, total_tat = 0;
    for (int i = 0 ; i < n ; i++)
    {
      total_wt = total_wt + wt[i];
      total_tat = total_tat + tat[i];
      int compl_time = tat[i] + at[i];
      System.out.println(i+1 + "\t\t" + bt[i] + "\t\t"
      + at[i] + "\t\t" + wt[i] + "\t\t "
      + tat[i] + "\t\t " + compl_time);
    }

    System.out.print("Average waiting time = "
    + (float)total_wt / (float)n);
    System.out.print("\nAverage turn around time = "
    + (float)total_tat / (float)n+"\n\n");
  }
  public static void main(String args[]) {
    int processes[] = {1, 2, 3,4,5,6};
    int n = processes.length;
    int bt[] = {10, 210, 70,70,90,50};
    int arrival_time[] = {0, 110, 110,130,130,100};

   AT(processes, n, bt, arrival_time);
  }
}
