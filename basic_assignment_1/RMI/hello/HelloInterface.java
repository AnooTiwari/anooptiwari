import java.rmi.*;
 
 //Remote Interface for the "Hello, world!" example.
public interface HelloInterface extends Remote {
  public String say() throws RemoteException;
}