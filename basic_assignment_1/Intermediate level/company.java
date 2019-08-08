public class company implements Comparable<company> {

  String product1;
  String product2;
  String brand;
  company(String first, String last, String book){
    this.product1 = first;
    this.product2 = last;
    this.brand = book;
  }
  public int compareTo(company au){
    int last = this.product2.compareTo(au.product2);
     System.out.println(last+" this.product2  =  "+this.product2+" au.product2  ="+au.product2+"\n");
     System.out.println(last+" this.product1  =  "+this.product1+" au.product1  ="+au.product1+"  \n");
    return last == 0 ? this.product1.compareTo(au.product1) : last;
    // System.out.println(last+" this.product1  =  "+this.product1+" au.product1  ="+au.product1+"  \n");
  }
}
