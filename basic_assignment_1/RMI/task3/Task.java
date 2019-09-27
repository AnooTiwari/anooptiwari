/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Server;
import java.math.BigDecimal;
/**
 *
 * @author s0274817
 */
public interface Task {
    //The Task interface (interaction contract) between clients and the server
    public void executeTask();
    public Object getResult();
}