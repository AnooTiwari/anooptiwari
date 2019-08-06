import java.util.Scanner;
public class array_two
{

public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.print("Enter the size of array");
int n=s.nextInt();
int array[] =new int[n];
for(int i:array)
{
array[i]=s.nextInt();
}
}

}
