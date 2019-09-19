import java.rmi.*; 
import java.rmi.server.*;
public class Server
{
public static void main(String[]arg) throws RemoteException
{
RmiImpl Obj=new RmiImpl();
try
{
Naming.rebind("rmi://RmiExample",Obj);
}
catch(Exception e){
}

System.out.println("Server Started...");
}
}