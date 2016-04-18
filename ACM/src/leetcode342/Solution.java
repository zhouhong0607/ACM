package leetcode342;

public class Solution
{
	 public boolean isPowerOfFour(int num) {
	        if(num==0) return false;
	        
	        int i=15;
	        while(num!=1&&i>0)
	        {
	        	num=num|num<<30;
	            num=num>>2;
	            i--;
	        }
	        return num==1;
	    }
	 
	 public static void main(String[] args) throws Exception
	 {
		 
		 Solution solution=new Solution();
		 solution.isPowerOfFour(5);
	 }
}
