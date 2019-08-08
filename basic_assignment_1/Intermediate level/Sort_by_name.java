import java.util.ArrayList;
import java.util.Collections;
public class Sort_by_name{
  public static void main(String args[]){
    ArrayList<company> al=new ArrayList<company>();
    al.add(new company("Almond","penut", "Securifi"));
    al.add(new company("Router","Wifidongle", "Netgare"));
    al.add(new company("Ipad","Macbook", "Apple"));
    al.add(new company("Bluetooth","Modem", "Tplink"));
    al.add(new company("Motherboard","Smps", "Asus"));
    Collections.sort(al);
    for(company str:al){
      System.out.println(str.product1+" "+
      str.product2+" "+"Brand "+str.brand);
    }
  }
}
