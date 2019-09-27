/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server.Codebase;
import Server.Task;
import static Server.Codebase.CalculatePi.computePi;
import java.io.Serializable;
/**
 *
 * @author Div
 */
public class CalculateGCD implements Task,Serializable {
    private long a, b;
    private String finalresult_;

    //assign user inputs to instance variables
    public CalculateGCD(long l,
        long l0) {
        a = l;
        b = l0;
    }
    //getters and setters methods
    public long getA() {
        return a;
    }
    public void setA(long a) {
        this.a = a;
    }
    public long getB() {
        return b;
    }
    public void setB(long b) {
        this.b = b;
    }

    //method execute task
    public void executeTask() { finalresult_ = Long.toString(CalculateGCD(a, b));
    }

    // return the final result
    public Object getResult() {
        return finalresult_;
    }

    //class business logic
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
}