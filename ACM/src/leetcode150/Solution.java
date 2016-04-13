package leetcode150;

import java.util.Stack;

public class Solution
{
	public int evalRPN(String[] tokens)
	{
		Stack<Integer> operand=new Stack<>();
		for(int i=0;i<tokens.length;i++)
		{
			String s=tokens[i];
			if(s.equals("+"))
			{
				int val1=operand.pop();
				int val2=operand.pop();
				operand.push(val2+val1);
			}else if (s.equals("-")) 
			{
				int val1=operand.pop();
				int val2=operand.pop();
				operand.push(val2-val1);
			}else if (s.equals("*")) 
			{
				int val1=operand.pop();
				int val2=operand.pop();
				operand.push(val2*val1);
			}
			else if (s.equals("/")) 
			{
				int val1=operand.pop();
				int val2=operand.pop();
				operand.push(val2/val1);
			}else
			{
				operand.push(Integer.parseInt(s));
			}
			
		}
		
		return operand.pop();
	}
	
	
}
