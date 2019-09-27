package Server;
import Server.Codebase.CalculateGCD;
import Server.Codebase.CalculatePi;
import Server.Codebase.CalculatePrime;
import java.net.*;
import java.io.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ComputeServer implements Serializable
{
    //NO ARGUMENT CONSTRUCTOR
    public ComputeServer() {}
    //class main starts
    public static void main(
        String args[]) throws ClassNotFoundException,
        NoClassDefFoundError,
        IOException {
            new ComputeServer().runServer();
        }
    public void runServer
    () throws ClassNotFoundException,
        IOException {
            try {
                //defining server port number (rendomly)
                int serverPort = 8888;
                //creating socket to do two way communication
                Socket clientSocket;
                //defining listening socket on server port no
                ServerSocket listenSocket = new ServerSocket(serverPort);
                //now server is setup, readyb to accept client/join them
                System.out.println("Server up and ready for connection to client....!");

                while (true) {
                    //when client weakup and trying to connect defined server port accept() method
                    // will cennect client server successfully
                    clientSocket =listenSocket.accept();
                    //connection successful
                    System.out.println("Connection successful");
                    //make a connection using multi threaded server
                    Connection c =new Connection(clientSocket);
                }
            } catch (IOException e) {
                System.out.println("Listen socket:" +e.getMessage());
            }
        }
    class Connection extends Thread {
        //object in-out streams
        ObjectInputStream in ;
        ObjectOutputStream out;
        Socket clientSocket;
        CSMessage message =
            new CSMessage();
        Task iTask;

        public Connection(
            Socket aClientSocket) {
            try {
                clientSocket =aClientSocket; 
                in =new ObjectInputStream(clientSocket.getInputStream());
                out =new ObjectOutputStream(clientSocket.getOutputStream());
                //start thread, this is to connect multiple clients with different threads
                this.start();
            } catch (IOException e) {
                System.out.println("Connection:" +e.getMessage());
            }
        }

        @Override
        public void run() {
            try {
                //repeatedly catching input choice from client
                while (true) {
                    //Reading user choice, 1. Pi, 2. Prime, 3. GCD and 4. Prime
                    Object a = in.readObject();
                    switch ((String) a) {
                        case ("1"):
                            //user's choice
                            System.out.println("Received Object: " +a);
                            //user's second input
                            Object b= (int) in.readObject();
                            //creating Object from CalculatePi class
                            CalculatePi cp =new CalculatePi((int) b);
                            //Assigning object to task interface
                            iTask =(Task)cp;
                            //which method of which class is being performed by server
                            System.out.println("Performing a task for " +iTask.getClass().getName());
                            // Execute the task
                            iTask.executeTask();
                            // send the compute object back to client
                            out.writeObject(cp);
                            break;
                        case ("2"):
                            //user's choice
                            System.out.println("Received Object: " +a);
                            //user's second input
                            Object c= (int) in.readObject();
                            //creating Object from CalculatePrime class
                            CalculatePrime pm=new CalculatePrime((int) c);
                            //Assigning object to task interface
                            iTask =(Task) pm;
                            //which method of which class is being performed by server
                            System.out.println("Performing a task for " +iTask.getClass().getName());
                            // Execute the task
                            iTask.executeTask();
                            // send the compute object back to client
                            out.writeObject(pm);
                            break;
                        case ("3"):
                            //user's choice
                            System.out.println("Received Object: " +a);
                            //user's second input
                            Object d= in.readObject();
                            //user's third input
                            Object e = in.readObject();
                            //creating Object from CalculateGCD class
                            CalculateGCD gcd=new CalculateGCD((long) d,(long) e);
                            //Assigning object to task interface
                            iTask =(Task) gcd;
                            //which method of which class is being performed by server
                            System.out.println("Performing a task for " +iTask.getClass().getName());
                            // Execute the task
                            iTask.executeTask();
                            // send the compute object back to client
                            out.writeObject(gcd);
                            break;
                        case ("4"):
                            //do nothing
                            break;
                        default:
                            String msg="Please enter valid option, Thank You";
                            Object t = msg;out.writeObject(t);
                            break;
                    }
                }
            } catch (EOFException e) 
            {System.out.println("EOF:" + e.getMessage());}
            catch (IOException e)
            { System.out.println("readline:" +e.getMessage());}
            catch (ClassNotFoundException ex) 
            {//exception message
                System.out.println("The compute-task " +ex.getMessage().getClass() + " cannot befound!");
                String msg = new String("Upload the compute-task " +ex.getMessage().getClass() + " before calling the server!");
                //CSMessage csmsg=new CSMessage();
                message.setMessage(msg);
                try {
                    out.writeObject(message);
                } catch (IOException ex1) {
                    Logger.getLogger(ComputeServer.class.getName()).log(Level.SEVERE,null,ex1);
                }
            } catch (NoClassDefFoundError ex) 
            {   //exception message
                System.out.println("The compute-task " + ex.getMessage() +" cannot be found!");
                String msg =new String("Upload the compute-task " +ex .getMessage() +" before calling theserver!" );
                //CSMessage csmsg=new CSMessage();
                message.setMessage(msg);
                try { out.writeObject(message);
                } catch (IOException ex1) {
                    Logger.getLogger(ComputeServer.class.getName()).log( Level.SEVERE,null, ex1);
                }
            } finally {
                try {
                    clientSocket.close();
                } catch (IOException e) {/*close failed*/ }
            }
        }
    } //connection class ends
} //class compute server ends here