//without static function 

import java.util.Stack;

public class stack_2 {
  public static void main(String[] args) {
    Stack<String> stck = new Stack<>();
    stck.push("Anoop");
    stck.push("Vikash");
    stck.push("Dipti");
    stck.push("Ronish");
    System.out.println("Stack => " + stck+"\n");
    String stacktop = stck.pop();
    System.out.println("Stack.pop() => " + stacktop);
    System.out.println("Current Stack => " + stck+"\n");
    stacktop = stck.peek();
    System.out.println("Stack.peek() => " + stacktop);
    System.out.println("Current Stack => " + stck);

  }
}
