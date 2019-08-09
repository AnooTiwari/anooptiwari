public class Detail implements Comparable<Detail> {


  /*String product1;
  String product2;
  String brand;*/
  /*
  al.add=new Detail(101,"vikash",50000.00,25,"9415418279","vikash@securifi.com");
  al.add=new Detail(102,"anoop",29000.00,27,"8563878480","anoop.tiwari@securifi.com");
  al.add=new Detail(103,"ronish",30000.00,30,"9984183098","ronish.pakhrin@securifi.com");
  int ID;
  String name;
  int age;
  String phone;
  String email;
  double salary;
  /*company(String first, String last, String book)*/
  Detail(int ID,String name,double salary,int age,String phone,  String email){
    /*
      this.product1 = first;
      this.product2 = last;
      this.brand = book; */
    this.ID=ID;
    this.name=name;
    this.salary=salary;
    this.age=age;
    this.phone=phone;
    this.email=email;
  }
  public int compareTo(Detail D){
    int last = this.product2.compareTo(D.product2);
     System.out.println(last+" this.product2  =  "+this.product2+" D.product2  ="+D.product2+"\n");
     System.out.println(last+" this.product1  =  "+this.product1+" D.product1  ="+D.product1+"  \n");
    return last == 0 ? this.product1.compareTo(D.product1) : last;
    // System.out.println(last+" this.product1  =  "+this.product1+" D.product1  ="+D.product1+"  \n");
  }
}
