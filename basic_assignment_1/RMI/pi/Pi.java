import java.rmi.*; 
import java.util.*; 
/*ethods that can be invoked by remote clients. This interface should extend the Remote*/
public interface Pi extends Remote 
{ 
    public double CalcPi(double data) throws RemoteException; 
    

} 