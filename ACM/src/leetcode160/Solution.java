package leetcode160;

import java.util.HashSet;

public class Solution
{
	public ListNode getIntersectionNode(ListNode headA, ListNode headB)
	{
		HashSet<ListNode> set=new HashSet<>();
		while(headA!=null)
		{
			set.add(headA);
			headA=headA.next;
		}
		while(headB!=null)
		{
			if(set.contains(headB))
				return headB;
			headB=headB.next;
		}
		return null;
	}

	public  static class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
			next = null;
		}
	}

}
