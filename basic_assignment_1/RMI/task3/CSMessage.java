/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
/**
 *
 * @author Div
 */
import java.io.*;
public class CSMessage implements Task,
Serializable {
    //The variable that holds the error information
    private String finalResult;
    public CSMessage() {}
    //Return the final computing result
    public Object getResult() {
        return finalResult;
    }
    //Set the error message
    public void setMessage(String msg) {
        finalResult = msg;
    }
    public void executeTask() {}
}