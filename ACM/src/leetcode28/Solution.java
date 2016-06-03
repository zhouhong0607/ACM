package leetcode28;

import java.math.BigInteger;
import java.util.Random;

public class Solution
{
	//暴力查找
//	public int strStr(String haystack, String needle)
//	{
//		if (haystack.equals(needle))
//			return 0;
//		int m = haystack.length();
//		int n = needle.length();
//		for (int i = 0; i <=m - n; i++)
//		{
//			int j;
//			for (j = 0; j < n; j++)
//				if (haystack.charAt(i + j) != needle.charAt(j))
//					break;
//			if (j == n)
//				return i;
//		}
//		return -1;
//	}
// KMP  dfa 有限状态自动机
	
//	public int strStr(String haystack, String needle)
//	{
//		
//		int m=needle.length();
//		//构造dfa
//		if(m<1) return 0;
//		int[][] dfa=new int[256][m];
//		dfa[needle.charAt(0)][0]=1;
//		for(int x=0,j=1;j<m;j++)
//		{
//			for(int c=0;c<256;c++)
//				dfa[c][j]=dfa[c][x];
//			dfa[needle.charAt(j)][j]=j+1;
//			x=dfa[needle.charAt(j)][x];	
//		}
//		int i,j,n=haystack.length();
//		for( i=0,j=0;i<n&&j<m;i++)
//		{
//			j=dfa[haystack.charAt(i)][j];
//			if(j==m) return i-m+1;
//		}
//		return -1;
//	}
	
	//Boyer-Moore 
//	public int strStr(String haystack, String needle)
//	{
//		int m=needle.length();
//		if(m==0) return 0;
//		int[] right=new int[256];
//		for(int c=0;c<256;c++)
//			right[c]=-1;
//		for(int j=0;j<m;j++)
//			right[needle.charAt(j)]=j;
//		
//		int n=haystack.length();
//		int skip;
//		for(int i=0;i<=n-m;i+=skip)
//		{
//			skip=0;
//			for(int j=m-1;j>=0;j--)
//			{
//				if(needle.charAt(j)!=haystack.charAt(i+j))
//				{
//					skip=j-right[haystack.charAt(j)];
//					if(skip<1) skip=1;
//					break;
//				}
//				
//			}
//			if(skip==0) return i;
//		}
//		return -1;
//	}
//Rabin-Karp 指纹字符串查找算法	
	public int strStr(String haystack, String needle)
	{
		int n=haystack.length();
		int m=needle.length();
		if(m<1) return 0;
		if(n<1||m>n) return -1;
		
		long Q=BigInteger.probablePrime(31, new Random()).longValue();
		long RM=1;
		for(int i=1;i<=m-1;i++)
			RM=(256*RM)%Q;
		long pathash=0;
		for(int j=0;j<m;j++)
			pathash=(256*pathash+needle.charAt(j))%Q;
		//search
	
		long txtHash=0;
		for(int j=0;j<m;j++)
			txtHash=(256*txtHash+haystack.charAt(j))%Q;
		
		if(pathash==txtHash) return 0;
		for(int i=m;i<n;i++)
		{
			txtHash=(txtHash+Q-RM*haystack.charAt(i-m)%Q)%Q;
			txtHash=(txtHash*256+haystack.charAt(i))%Q;
			
			if(txtHash==pathash) return i-m+1;
		}
		
		return -1;
	}
	
	
	
	public static void main(String[] args) throws Exception
	{
		String a = "aaa", b = "a";
		Solution solution = new Solution();
		System.out.println(solution.strStr(a, b));
	}
}
