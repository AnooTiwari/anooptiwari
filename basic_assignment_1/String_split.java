import java.util.Scanner;
import java.util.StringTokenizer;

public class String_split {
    public static void main(String a[]){
        int b;
          String c,d,temp;
        Scanner scanner = new Scanner(System.in);
        String s = "23 Hello world ABCDEFGH";
        String k = scanner.nextLine();
        String delims = " ";
        StringTokenizer st = new StringTokenizer(k, delims);
        System.out.println("No of Token = " + st.countTokens());
        while (st.hasMoreTokens()) {
            //System.out.println(st.nextToken());
            b=Integer.parseInt(st.nextToken());
            c= st.nextToken();
            d= st.nextToken();
            temp= st.nextToken();
            System.out.println((b+1)+" "+c+" "+d+" "+temp);

        }
    }}
