//Write a program to sort ArrayList of Strings in descending order
import java.util.ArrayList;
import java.util.Collections;
import  java.util.Scanner;
import java.util.*;

public class shortArrayList
{
public static void main(String[] args) {
int flag=1,size=3;
Scanner sc = new Scanner(System.in);
ArrayList<String> al =new ArrayList<String>();
while(size>=0)
{
System.out.println("Eenter the string");
al.add(sc.next());
size--;
// System.out.println("1 continiue 0 stop");
// flag=sc.nextInt();
// if(flag==0)
// break;
}


System.out.println("Normal list   "+al);
Collections.sort(al);
System.out.println("Sorted list "+al);
 Collections.reverse(al);
 System.out.println("Sort ArrayList of Strings in descending order\ns"+al);

}


}
