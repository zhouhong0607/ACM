package leetcode67;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class Solution
{
	public String addBinary(String a, String b)
	{
		boolean carry = false;

		if (a.length() < b.length())
		{
			String c = a;
			a = b;
			b = c;
		}
		char[] achar = a.toCharArray();
		char[] bchar = b.toCharArray();

		for (int i = achar.length - 1; i >= (achar.length - bchar.length); i--)
		{
			if (achar[i] == bchar[i-(achar.length-bchar.length)])
			{
				if (achar[i] == '0')
				{
					if (carry)
					{
						achar[i] = '1';
					} else
					{
						achar[i] = '0';
					}
					
					carry = false;
				} else
				{
					if (carry)
					{
						achar[i] = '1';
					} else
					{
						achar[i] = '0';
					}
					
					carry = true;
				}

				
			} else
			{
				if (carry)
				{
					achar[i] = '0';
					carry = true;
				} else
				{
					achar[i] = '1';
					carry = false;
				}
			}

		}
		for (int i = achar.length - bchar.length - 1; i >= 0; i--)
		{
			if (achar[i] == '0')
			{
				if (carry)
				{
					achar[i] = '1';
				} else
				{
					achar[i] = '0';
				}
				carry = false;
			} else
			{
				if (carry)
				{
					achar[i] = '0';
					carry = true;
				} else
				{
					achar[i] = '1';
					carry = false;
				}

			}
		}
		String result=String.valueOf(achar);
		if(carry)
			result="1"+result;
		return result;

	}
	
	public static void main(String[] args)throws Exception
	{
		Solution solution=new Solution();
		String a="1";
		String b="1";
		solution.addBinary(a, b);
	}
}
