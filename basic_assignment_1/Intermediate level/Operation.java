import java.util.ArrayList;
import java.util.Collections;
public class Operation{
  public static void main(String args[]){
    ArrayList<Detail> al=new ArrayList<Detail>();
      al.add=new Detail(101,"vikash",50000.00,25,"9415418279","vikash@securifi.com");
      al.add=new Detail(102,"anoop",29000.00,27,"8563878480","anoop.tiwari@securifi.com");
      al.add=new Detail(103,"ronish",30000.00,30,"9984183098","ronish.pakhrin@securifi.com");
      Collections.sort(al);
    for(Detail str:al){
      System.out.println(str.product1+" "+
      str.product2+" "+"Brand "+str.brand);
    }
  }
}
