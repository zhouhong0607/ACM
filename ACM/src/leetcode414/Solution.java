package leetcode414;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.IntStream;

public class Solution
{
	/**
	 * 排序解法O（nlogn）
	 * 
	 * @param nums
	 * @return
	 */
	// public int thirdMax(int[] nums)
	// {
	// Arrays.sort(nums);
	// int count=2;
	// int thirdMax=nums[nums.length-1];
	// for(int i=nums.length-2;i>=0&&count>0;i--)
	// {
	// if(nums[i]!=nums[i+1])
	// {
	// count--;
	// thirdMax=nums[i];
	// }
	//
	// }
	// return count==0?thirdMax:nums[nums.length-1];
	// }

	/**
	 * 非排序解法 O（n）
	 * 
	 * @param nums
	 * @return
	 */
	// public int thirdMax(int[] nums)
	// {
	// final long[] a =
	// { Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE };
	//
	// for (int num : nums)
	// {
	// for (int i = 0; i < 3; i++)
	// {
	// if (num == a[i])
	// {
	// break;
	// } else if (num > a[i])
	// {
	// if (i == 0)
	// {
	// a[2] = a[1];
	// a[1] = a[0];
	// } else if (i == 1)
	// {
	// a[2] = a[1];
	// }
	//
	// a[i] = num;
	// break;
	// }
	// }
	// }
	// return (int) (a[2] == Long.MIN_VALUE || a[1] == Long.MIN_VALUE ? a[0] :
	// a[2]);
	// }

	/**
	 * 优先队列
	 * 
	 * @param nums
	 * @return
	 */
	public int thirdMax(int[] nums)
	{
		final PriorityQueue<Integer> queue = new PriorityQueue<>();

		IntStream.of(nums).distinct().forEach(num -> {
			//维持队列长度为3
			if (queue.size() < 3)
			{
				queue.add(num);
			} else if (num > queue.peek())
			{
				queue.poll();
				queue.add(num);
			}
		});

		if (queue.size() < 3)
		{
			while (queue.size() > 1) //队列长度为2 删除一个最小值
			{
				queue.poll();
			}
		}

		return queue.peek();
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums =
		{ 5, 2, -1 };
		Solution solution = new Solution();
		System.out.println(solution.thirdMax(nums));

	}
}
