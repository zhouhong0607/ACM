package leetcode232;

import java.util.Stack;

public class MyQueue
{
	Stack<Integer> stack;
	
	public MyQueue()
	{
		// TODO Auto-generated constructor stub
		stack=new Stack<>();
	}
	
	
	// Push element x to the back of queue.
	public void push(int x)
	{
		stack.push(x);
	}

	// Removes the element from in front of queue.
	public void pop()
	{
		Stack<Integer> aStack=new Stack<>();
		int size=stack.size();
		for(int i=0;i<size;i++)
		{
			aStack.push(stack.pop());
		}
		stack.pop();
		int asize=aStack.size();
		for(int j=0;j<asize;j++)
		{
			stack.push(aStack.pop());
		}
	}

	// Get the front element.
	public int peek()
	{
		int val;
		Stack<Integer> aStack=new Stack<>();
		int size=stack.size();
		for(int i=0;i<size-1;i++)
		{
			aStack.push(stack.pop());
		}
		val=stack.peek();
		int asize=aStack.size();
		for(int j=0;j<asize;j++)
		{
			stack.push(aStack.pop());
		}
		return val;
	}

	// Return whether the queue is empty.
	public boolean empty()
	{
		return stack.isEmpty();
	}
	
	public static void main(String[] args)throws Exception
	{
		MyQueue queue=new MyQueue();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.peek());
	}
	
}
