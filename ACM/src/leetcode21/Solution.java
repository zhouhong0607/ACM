package leetcode21;

import java.util.List;

public class Solution
{
	public ListNode mergeTwoLists(ListNode l1, ListNode l2)
	{
		
		ListNode fir=new ListNode(0);
		ListNode node=fir;
		while(l1!=null&&l2!=null)
		{
			if(l1.val<l2.val)
			{
				node.next=l1;
				l1=l1.next;
			}else {
				node.next=l2;
				l2=l2.next;
			}
			node=node.next;
		}
		if(l1!=null)
		{
			node.next=l1;
		}else
		{
			node.next=l2;
		}
		
		return fir.next;
	}

	public static class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
		}
	}
	
	public static void main(String[] args)throws Exception
	{
		ListNode l1=new ListNode(1);
		l1.next=new ListNode(3);
		ListNode l2=new ListNode(2);
		l2.next=new ListNode(4);
		
		Solution solution=new Solution();
		solution.mergeTwoLists(l1, l2);
		
		
		
		
		
	}
	
}
