package Server.Codebase;
import Server.Task;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Div
 */
public class CalculatePrime implements Task,
Serializable {
    int x = 0, counter = 0;
    boolean result_;
    ArrayList finalresult;
    //int[] a;// = null;
    public CalculatePrime(int i) {
        x = i;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public void executeTask() {
        finalresult =calculatePrimes(x);
    }

    // return the final result
    public Object getResult() {
        return finalresult;
    }

    public ArrayList calculatePrimes(
        int z) {
        StringBuilder sb = new StringBuilder();
        List list = null;
        ArrayList a1 = new ArrayList();;

        for (int i = 2; i <= z; i++)
            if (isPrime(i) || i ==2)
                a1.add(i);
        //counter++;
        //sb.deleteCharAt(sb.length() - 1);
        //sb.deleteCharAt(sb.length() - 1);
        return a1;
    }
    //public StringBuilder calculatePrimes(int z)
    //{
    // StringBuilder sb = new StringBuilder();
    // for (int i = 2; i <= z; i++)
    // if (isPrime(i) || i == 2)
    // sb.append(i + ",");
    // sb.deleteCharAt(sb.length() - 1);
    // //sb.deleteCharAt(sb.length() - 1);
    // return sb;
    //}

    public boolean isPrime(int number) {
        for (int i = 2; i <number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}