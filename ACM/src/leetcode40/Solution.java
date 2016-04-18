package leetcode40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution
{
	// 迭代方式， 待 修改
	// public List<List<Integer>> combinationSum2(int[] candidates, int target)
	// {
	// List<List<Integer>> results=new ArrayList<>();
	// Arrays.sort(candidates);
	// int i=0;
	// int j=i;
	// int sum=0;
	//
	// while(i<candidates.length&&candidates[i]<=target)
	// {
	// if(i>0&&candidates[i]==candidates[i-1])
	// {
	// i++;
	// continue;
	// }
	//
	// Stack<Integer> stack=new Stack<>();
	// sum=0;
	// for(j=i;j<candidates.length;j++)
	// {
	// sum+=candidates[j];
	// if(sum>target)
	// {
	// sum-=candidates[j];
	// continue;
	// }
	// stack.push(candidates[j]);
	// if(sum==target)
	// {
	// results.add(new ArrayList<>(stack));
	// stack.pop();
	// sum-=candidates[j];
	//
	// if(stack.isEmpty())
	// break;
	// }
	// }
	// i++;
	//
	// }
	// return results;
	// }

	public List<List<Integer>> combinationSum2(int[] candidates, int target)
	{
		List<List<Integer>> res=new ArrayList<>();
		if(target<0||candidates==null||candidates.length<=0)
			return res;
		Arrays.sort(candidates);
		dfs(res, new ArrayList<>(),candidates, target, 0);
		return res;
		
	}
	private void dfs(List<List<Integer>> res,List<Integer> collection,int[] candidates, int target,int location)
	{
		if(target==0) res.add(new ArrayList<>(collection));
		if(location>=candidates.length||candidates[location]>target) return;
		
		
		
		for(int i=location;i<candidates.length;i++)
		{
			if(i>location&&candidates[i]==candidates[i-1]) continue;
			
			collection.add(candidates[i]);
			dfs(res, collection, candidates, target-candidates[i], i+1);
			collection.remove(collection.size()-1);
		}
		
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		int[] nums =
		{ 8, 7 ,4,3};
		Solution solution = new Solution();
		solution.combinationSum2(nums, 11);

	}
}
