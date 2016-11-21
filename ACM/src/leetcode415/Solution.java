package leetcode415;

public class Solution
{
	public String addStrings(String num1, String num2)
	{
		StringBuilder sBuilder=new StringBuilder();
		int k=0;
		for(int i=num1.length()-1,j=num2.length()-1;i>=0||j>=0||k==1;i--,j--)
		{
			int a=(i>=0)?num1.charAt(i)-'0':0;
			int b=(j>=0)?num2.charAt(j)-'0':0;
			int sum=a+b+k;
			sBuilder.append(sum%10);
			k=sum/10;
		}
		return sBuilder.reverse().toString();
	}
	
	public static void main(String[] args) throws Exception
	{
		String s1="3876620623801494171";
		String s2="6529364523802684779";
		Solution solution =new Solution();
		System.out.println(solution.addStrings(s1, s2));
		
	}
}
