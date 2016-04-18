package leetcode39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution
{
	public List<List<Integer>> combinationSum(int[] candidates, int target)
	{
		List<List<Integer>> res=new ArrayList<>();
		if(candidates==null||candidates.length<1) return res;
		Arrays.sort(candidates);
		dfs(res, new ArrayList<>(), candidates,target, 0);
		return res;
	}
	private void dfs(List<List<Integer>> res,List<Integer> collect,int[] candidates,int target,int location)
	{
		if(target==0) res.add(new ArrayList<>(collect));
		if(location>=candidates.length||candidates[location]>target) return;
		for(int i=location;i<candidates.length;i++)
		{
			if(i>location&&candidates[i]==candidates[i-1]) continue;
			collect.add(candidates[i]);
			dfs(res, collect, candidates, target-candidates[i], i);
			collect.remove(collect.size()-1);
		}
		
	}
	
}
