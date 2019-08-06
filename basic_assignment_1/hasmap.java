import java.util.*;
public class hasmap
{
public static void main(String[] args) {
  int size,i=0;
  String a,b;
HashMap<String,String> map= new HashMap<String, String>();
Scanner sc =new Scanner(System.in);
System.out.println("How Much data you want to insert");
size=sc.nextInt();
while(i!=size)
{

map.put(a=sc.next(),b=sc.next());
i++;

  }
System.out.println(map.entrySet());
// for(Map.Entry m:map.entrySet()) {
//             System.out.println(m.getKey()+" "+m.getValue());
//         }
}

}
