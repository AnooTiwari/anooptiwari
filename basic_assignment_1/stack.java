import java.io.*;
import java.util.*;

class steck
{
	static void StackPush(Stack<Integer> stack)
	{
		for(int i = 0; i < 15; i++)
		{
			stack.push(i);
		}
	}

	static void StackPop(Stack<Integer> stack)
	{
		System.out.println("Pop :");

		for(int i = 0; i < 15; i++)
		{
			Integer k =  stack.pop();
			System.out.println("\t\t\t\t["+k+"]");
		}
	}

	static void StackPeek(Stack<Integer> stack)
	{
		Integer peekelement =  stack.peek();
		System.out.println("Element on stack top : " + peekelement);
	}
	static void StackSerch(Stack<Integer> stack, int element)
	{
		Integer position = (Integer) stack.search(element);

		if(position == -1)
		System.out.println("Element not found");
		else
		System.out.println("Element is found at position " + position);
	}


	public static void main (String[] args)
	{
		Stack<Integer> stack = new Stack<Integer>();

		StackPush(stack);
		StackPop(stack);
		StackPush(stack);
		StackPeek(stack);
		StackSerch(stack, 2);
		StackSerch(stack, 12);
	}
}
