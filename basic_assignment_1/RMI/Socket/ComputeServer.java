    package Server;
    import java.net.*;
    import java.io.*;
    import java.io.IOException;
    import java.io.ObjectInputStream;
    import java.net.Socket;
    import java.io.Serializable;
    public class ComputeServer implements Serializable
    {
        public ComputeServer() {}
        public static void main(String args[]) throws ClassNotFoundException,IOException
        {
                new ComputeServer().runServer();
        }
        public void runServer() throws ClassNotFoundException,IOException 
        {
                try {
                    int serverPort = 1920;
                    Socket clientSocket;
                    ServerSocket listenSocket = new ServerSocket(serverPort);
                    System.out.println("Server is ready for  client....!");

                    while (true) {
                        clientSocket =listenSocket.accept();
                        System.out.println("clientSocket  "+clientSocket);
                        System.out.println("Connection successful");
                        Connection c =new Connection(clientSocket);
                    }
                } catch (IOException e)
                {
                    System.out.println(" socket is Listening:" +e.getMessage());
                }
        }
        class Connection extends Thread
        {
            ObjectInputStream in ;
            ObjectOutputStream out;
            Socket clientSocket;
            CSMessage message =new CSMessage();
            Task iTask;
            public Connection(Socket client) 
            {
                try {
                    clientSocket =client; 
                    in =new ObjectInputStream(clientSocket.getInputStream());
                    out =new ObjectOutputStream(clientSocket.getOutputStream());
                    this.start();
                    }
                    catch (IOException e) {
                    System.out.println("Connection:" +e.getMessage());
                }
            }
            public void run() 
            {
            try 
            {
                
                iTask =(Task)in.readObject();
                System.out.println("Performing a task for " +iTask.getClass().getName());
                iTask.executeTask();
                out.writeObject(iTask);
            }
            catch (EOFException e) 
            {
            System.out.println("EOF:" + e.getMessage());
            }
            catch (IOException e) { }
            catch (ClassNotFoundException ex) {}
            }
        }
    } 