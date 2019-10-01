package Server;
import Server.Task;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CalculatePrime implements Task,Serializable {
    int x = 0, counter = 0;
    boolean result_;
    ArrayList finalresult;
    public CalculatePrime(int i) {
        x = i;
    }

    // public int getX() {
    //     return x;
    // }
    // public void setX(int x) {
    //     this.x = x;
    // }

    // public void executeTask() {
    //     finalresult =calculatePrimes(x);
    // }

    // public Object getResult() {
    //     return finalresult;
    // }

    public ArrayList calculatePrimes(int z) 
    {
        StringBuilder sb = new StringBuilder();
        List list = null;
        ArrayList a1 = new ArrayList();;

        for (int i = 2; i <= z; i++)
            if (isPrime(i) || i ==2)
            a1.add(i);       
            return a1;
    }
    public boolean isPrime(int number) {
        for (int i = 2; i <number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}