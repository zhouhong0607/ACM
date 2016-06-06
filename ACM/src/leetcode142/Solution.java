package leetcode142;

public class Solution
{
//	public ListNode detectCycle(ListNode head)
//	{
//		while (null != head)
//		{
//			if (Integer.MIN_VALUE != head.val)
//			{
//				head.val = Integer.MIN_VALUE;
//			} else
//			{
//				return head; // it's you~
//			}
//			head = head.next;
//		}
//
//		return null; // get the end: no-cycle
//	}

	public ListNode detectCycle(ListNode head)
	{
		if(head==null||head.next==null) return null;
		ListNode slow=head.next;
		ListNode fast=head.next.next;
		while(slow!=fast)
		{
			if(fast==null||fast.next==null) return null;
			slow=slow.next;
			fast=fast.next.next;
		}
		slow=head;
		while(slow!=fast)
		{
			slow=slow.next;
			fast=fast.next;
		}
		return slow;
	}
	
	
	
	static class ListNode
	{
		int val;
		ListNode next;

		ListNode(int x)
		{
			val = x;
			next = null;
		}
	}

	public static void main(String[] args) throws Exception
	{
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		node1.next = node2;
		Solution solution = new Solution();
		solution.detectCycle(node1);
	}

}
