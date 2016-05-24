package leetcode84;

import java.util.Stack;

public class Solution
{
//	public int largestRectangleArea(int[] heights)
//	{
//		if (heights == null || heights.length < 1)
//			return 0;
//
//		int result = 0;
//		Stack<Integer> s = new Stack<>();
//		for (int i = 0; i <= heights.length; i++)
//		{
//			int h = (i == heights.length) ? 0 : heights[i];
//			if (s.isEmpty() || h >= heights[s.peek()])
//			{
//				s.push(i);
//			} else
//			{
//				int p = s.pop();
//				result = Math.max(result, heights[p] * (s.isEmpty() ? i : (i - 1 - s.peek())));
//				i--;
//			}
//		}
//		return result;
//	}
	
/**
 * 快速解法
 * @param args
 * @throws Exception
 */
	
	public int largestRectangleArea(int[] height)
	{
		if(height==null||height.length<1) return 0;
		int[] stack = new int[height.length+1];
		int len = 0, max = 0;
		for (int i = 0; i <=height.length; i++)
		{
			int h=(i==height.length)?0:height[i];
			while (len != 0&&(i==height.length|| height[stack[len - 1]] > h))
			{
				if (len == 1)
					max = Math.max(height[stack[--len]] * i, max);
				else
					max = Math.max(height[stack[--len]] * (i - stack[len - 1] - 1), max);
			}
			stack[len++] = i;
		}
		return max;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums = { 0 };
		Solution solution = new Solution();
		solution.largestRectangleArea(nums);

	}
}
