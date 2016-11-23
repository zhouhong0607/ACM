package leetcode20;

import java.util.Stack;

public class Solution
{
	// 精简写法
	public boolean isValid(String s)
	{
		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray())
		{
			if (c == '(' || c == '{' || c == '[')
				stack.push(c);
			else if (stack.empty() || Math.abs(c - stack.pop()) > 2)
				return false;
		}
		return stack.empty();
	}

	// 笨蛋解法
	// public boolean isValid(String s)
	// {
	// if (s == null || s.length() < 1)
	// return false;
	// char[] cs = s.toCharArray();
	// Stack<Character> stack = new Stack<>();
	// for (int i = 0; i < cs.length; i++)
	// {
	// if (cs[i] == '(' || cs[i] == '{' || cs[i] == '[')
	// {
	// stack.push(cs[i]);
	// } else if (cs[i] == ')')
	// {
	// if (stack.isEmpty())
	// return false;
	// char c = stack.pop();
	// if (c == '(')
	// continue;
	// else
	// return false;
	// } else if (cs[i] == '}')
	// {
	// if (stack.isEmpty())
	// return false;
	// char c = stack.pop();
	// if (c == '{')
	// continue;
	// else
	// return false;
	// } else if (cs[i] == ']')
	// {
	// if (stack.isEmpty())
	// return false;
	// char c = stack.pop();
	// if (c == '[')
	// continue;
	// else
	// return false;
	// }
	// }
	// return stack.isEmpty();
	// }

	// 大牛解法
	// public boolean isValid(String s)
	// {
	// String map = "()[]{}";
	// StringBuilder stack = new StringBuilder();
	// for (char c : s.toCharArray())
	// {
	// int ind = map.indexOf(c);
	// if (ind == -1)
	// return false;
	// if (ind % 2 == 0)
	// stack.append(c);
	// else
	// {
	// if (stack.length() == 0)
	// return false;
	// if (stack.charAt(stack.length() - 1) == map.charAt(ind - 1))
	// stack.deleteCharAt(stack.length() - 1);
	// else
	// return false;
	// }
	// }
	// return stack.length() == 0;
	// }

}
