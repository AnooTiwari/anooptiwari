import java.io.*;
import java.util.*;
class maam_array
{
  public static void main(String[] args)
                       throws IOException
    {
      int n = 15;
      ArrayList<Integer> arrobj = new ArrayList<Integer>(n);
        for (int i=1; i<=n; i++)
        arrobj.add(i);
        System.out.println("Printing elements "+arrobj);
        int pos =arrobj.indexOf(10);
        System.out.println("Position of 10 is  "+pos);
         arrobj.remove(pos);
         System.out.println("Displaying ArrayList after deletion  "+arrobj);
       }
}
