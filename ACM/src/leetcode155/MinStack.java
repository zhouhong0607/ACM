package leetcode155;

import java.util.Stack;

public class MinStack
{
	int[] s;
	int top;
	int minVal;
	int size;

	/** initialize your data structure here. */
	public MinStack()
	{
		s=new int[10];
		top=-1;
		minVal=Integer.MAX_VALUE;
		size=0;
		
	}

	private void resize(int size)
	{
		int[] rs=new int[size];
		for(int i=0;i<=top;i++)
		{
			rs[i]=s[i];
		}
		s=rs;
	}
	
	public void push(int x)
	{
		if(x<=minVal)
		{
			s[++top]=minVal;
			size++;
			minVal=x;
		}
		s[++top]=x;
		size++;
		if(size>=s.length/2)
			resize(2*s.length);
		
	}

	public void pop()
	{
		if(minVal==s[top])
		{
			
			minVal=s[--top];
			size--;
		}
		top--;
		size--;
		if(size<=s.length/4)
			resize(s.length/2);
		
	}

	public int top()
	{
		return top!=-1? s[top]:0;
	}

	public int getMin()
	{
		return minVal;
	}
}
