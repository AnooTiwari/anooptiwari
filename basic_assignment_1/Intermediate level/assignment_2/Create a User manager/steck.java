import java.io.*;
import java.util.*;
//With-out statc keyword

class steck
{
	public static void main (String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();
		steck s = new steck();
		System.out.print("\033[H\033[2J");
		System.out.print("\t\t\t   without static\n");

		s.StackPush(stack);
	 	s.StackPop(stack);
		s. StackPush(stack);
		s. StackPeek(stack);
		s. StackSerch(stack, 2);
		s. StackSerch(stack, 12);

	}
	void StackPush(Stack<Integer> stack)
	{
		for(int i = 0; i < 15; i++)
		{
			stack.push(i);
		}
	}

	 void StackPop(Stack<Integer> stack)
	{
		System.out.println("Pop :");

		for(int i = 0; i < 15; i++)
		{
			Integer k =  stack.pop();
			System.out.println("\t\t\t\t["+k+"]");
		}
	}

	 void StackPeek(Stack<Integer> stack)
	{
		Integer peekelement =  stack.peek();
		System.out.println("Element on stack top : " + peekelement);
	}
	 void StackSerch(Stack<Integer> stack, int element)
	{
		Integer position = (Integer) stack.search(element);

		if(position == -1)
		System.out.println("Element not found");
		else
		System.out.println("Element is found at position " + position);
	}
}
