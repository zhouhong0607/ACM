package leetcode53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        return sumArray(nums,0,n-1);
        
        
        
    }
    
    
    public int sumArray(int[] nums,int low,int high)
    {
        if(high<=low) return nums[low];
        int mid=(low+high)/2;
        
        return   max(midArray(nums,low,high,mid),sumArray(nums,low,mid),sumArray(nums,mid+1,high));
    }
    
    
    
    public int  midArray(int[] nums,int low,int high,int mid)
    {
        int maxValue=nums[mid];
        for(int i=mid-1;i>=low;i--)
        {
            if(maxValue+nums[i]>maxValue)
            {
                maxValue+=nums[i];
            }else
            {
                break;
            }
            
        }
        for(int i=mid+1;i<=high;i++)
        {
            if(maxValue+nums[i]>maxValue)
            {
                maxValue+=nums[i];
            }else
            {
                break;
            }
        }
        return maxValue;
        
    }
    
    
    public int max(int a,int b,int c)
    {
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        
        return max;
        
        
        
    }
    
    public static void main(String[] args) throws Exception
    {
    	Solution solution=new Solution();
    	int[] nums={-2,1};
    	System.out.print(solution.maxSubArray(nums));
    }
}