

import java.util.*;

public class Scanner_sunday_test {
   public static void main(String[] args) {
       int x;
       String a,b,c,e;

   String s = "Anoop Tiwari 3 3.0 ";


      Scanner scanner = new Scanner(s);
      a=scanner.next();
      b=scanner.next();
      c=scanner.next();

      e=scanner.next();
      f=scanner.next();
      g=scanner.next();
      System.out.println("" + a);
      System.out.println("" + b);
      System.out.println("" +  (Integer.parseInt(c)+1));

      System.out.println("" + Float.parseFloat(e));

      scanner.close();
   }
}
