package leetcode190;

import java.security.interfaces.RSAKey;

public class Solution
{

	public int reverseBits(int n)
	{
		int res=0;
		for(int i=0;i<32;i++)
		{
			res<<=1;
			if((n&1)==1)
				res++;
			n>>=1;
			
		}
		return res;
	}

}
