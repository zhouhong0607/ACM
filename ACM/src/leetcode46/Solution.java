package leetcode46;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<List<Integer>> permute(int[] nums)
	{
		int n = nums.length;
		List<List<Integer>> results = new ArrayList<>();
		List<Integer> list = new ArrayList<>();

		perm(results, 0, n - 1, nums, list);

		for (List<Integer> num : results)
		{
			for (int i = 0; i < num.size(); i++)
			{
				System.out.print(num.get(i) + ",");
			}
			System.out.println();
		}

		return results;
	}

	private void perm(List<List<Integer>> results, int low, int high, int[] nums, List<Integer> list)
	{
		if (low >= high)
		{
			list.add(nums[low]);
			List<Integer> aList = new ArrayList<>();
			for (Integer i : list)
			{
				aList.add(i);
			}
			results.add(aList);
			list.remove(list.size() - 1);
			return;
		}

		for (int k = low; k <=high; k++)
		{
			exchange(nums, low, k);
			list.add(nums[low]);
			perm(results, low + 1, high, nums, list);
			list.remove(list.indexOf(nums[low]));
			exchange(nums, low, k);
			
		}

	}

	private void exchange(int[] nums, int i, int j)
	{
		int k = nums[i];
		nums[i] = nums[j];
		nums[j] = k;
	}

	public static void main(String[] args) throws Exception
	{
		int[] nums = { 1, 2, 3 };
		Solution solution = new Solution();
		solution.permute(nums);

	}

}