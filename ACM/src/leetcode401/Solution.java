package leetcode401;

import java.util.ArrayList;
import java.util.List;

public class Solution
{
	public List<String> readBinaryWatch(int num)
	{
		int[] hourArray={1,2,4,8};//1,2,4,8
		int[] minArray={1,2,4,8,16,32};//1,2,4,8,16,32
		List<Integer> hours=new ArrayList<>();
		List<Integer> mins=new ArrayList<>();
		List<String> res=new ArrayList<>();
		for(int i=0;i<=num;i++)
		{
			selectHour(i,0,hours,hourArray,0);
			selectMin(num-i,0,mins,minArray,0);
			for(Integer hour:hours)
			{
				for(Integer min:mins)
				{
					res.add(hour+":"+ (min<10?"0"+min:min));
				}
			}
			hours.clear();
			mins.clear();
		}
		return  res;
	}
	
	public void selectHour(int num,int curVal,List<Integer> hours,int[] hourArray,int start)
	{
		if(num==0&&curVal<12)
		{
			hours.add(curVal);
			return;
		}
		for(int i=start;i< hourArray.length;i++  )
		{
			int val=curVal+hourArray[i];
		
			selectHour(num-1, val, hours, hourArray,i+1);
		}
	}
	
	public  void  selectMin(int num,int curVal,List<Integer> mins,int[] minArray,int start)
	{
		if(num==0&&curVal<60)
		{
			mins.add(curVal);
			return;
		}
		
		for(int i=start;i< minArray.length;i++)
		{
			int val=curVal+minArray[i];
			selectMin(num-1, val, mins, minArray,i+1);
		}
	}
	
	public static void main(String[] args) throws Exception
	{
		Solution solution=new Solution();
		System.out.println(solution.readBinaryWatch(0));
		
	}
	
	
}
