import java.util.*;
class Comparableinterface
{
  public static void main(String[] args) {
    List<String> list  =new ArrayList<String>();
    list.add("Anoop");
    list.add("Tiwari");
    list.add("vikash");
    list.add("Ronish");
    list.add("sridevi");
    list.add("kailash");
    list.add("UP");
    list.add("zakir");
    list.add("mayank");
    System.out.println(list);
    Collections.sort(list);
    System.out.println(list);
  }
}
