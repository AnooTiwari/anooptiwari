import java.util.*;
class String_split
{
  public static void main(String[] args){
    int a;
    String s,b,c,d,temp;
    List<String> al=new ArrayList<String>();
    /*Scanner sc = new Scanner(System.in);
    s=sc.nextLine();*/
    s="23 Hello world ABCDEFGH";
    String str[] = s.split(" ");
    al=Arrays.asList(str);
    Iterator<String> iter = al.iterator();
    while (iter.hasNext()) {
      a=Integer.parseInt(iter.next()) ;
      System.out.print("a=  "+(a+1)+"\n");
      b=iter.next();
      c=iter.next();
      d=iter.next();
      System.out.println("b = "+b+"\nc = "+c+"\nd = "+d);

    }

  }
