package Server;

import java.io.*;
public class CSMessage implements Task,Serializable {
    String result;
    public CSMessage() {}
    public Object getResult() {
        return result;
    }    
    public void executeTask() {}
}