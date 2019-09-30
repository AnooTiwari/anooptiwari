package Server;
import Server.Task;
import static Server.CalculatePi.computePi;
import java.io.Serializable;

public class CalculateGCD implements Task,Serializable {
    private long a, b;
    private String finalresult;

    //assign user inputs to instance variables
    public CalculateGCD(long num1,long num2) {
        a = num1;
        b = num2;
    }
    // public long getA() {
    //     return a;
    // }
    // public void setA(long a) {
    //     this.a = a;
    // }
    // public long getB() {
    //     return b;
    // }
    // public void setB(long b) {
    //     this.b = b;
    // }

    //method execute task
    public void executeTask() 
    {
    finalresult = Long.toString(CalculateGCD(a, b));
    }

    public long CalculateGCD(long a,long b) 
    {
        if (a == 0) return b;
        else {
            while (b != 0) {
                if (a > b) a = a -b;
                else b = b - a;
            }
            return a;
        }
    }
    // return the final result
    public Object getResult() {
        return finalresult;
    }
}