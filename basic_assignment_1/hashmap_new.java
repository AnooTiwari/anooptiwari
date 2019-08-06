
import java.util.*;
public class hashmap_new{
public static void main(String[] args) {
  system("CLS");
  ArrayList<String> name =new ArrayList<String>();
  ArrayList<String> last =new ArrayList<String>();
  HashMap<String,String> map = new HashMap<String,String>();
  Scanner sc =new Scanner(System.in);
  while(true)
  {
System.out.println("Enter the First name\n");
name.add(sc.next());
System.out.println("Enter the last name");
last.add(sc.next());
map.put(name.get(0),last.get(0));
name.clear(); last.clear();
System.out.println(map);
  }

}
}
