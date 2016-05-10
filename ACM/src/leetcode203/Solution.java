package leetcode203;

public class Solution
{
	public ListNode removeElements(ListNode head, int val)
	{
		if (head == null)
			return null;
		while (head != null && head.val == val)
			head = head.next;

		ListNode node = head;
		ListNode pre = new ListNode(0);
		pre.next = node;
		while (node != null)
		{
			if (node.val == val)
			{
				pre.next = node.next;
				node = node.next;
			} else
			{
				node = node.next;
				pre = pre.next;
			}
		}
		return head;
	}

//	public ListNode removeElements(ListNode head, int val)
//	{
//		if (head == null)
//			return null;
//		head.next = removeElements(head.next, val);
//		return head.val == val ? head.next : head;
//	}

	public class ListNode
	{
		int val;
		ListNode next;
		ListNode(int x)
		{
			val = x;
		}
	}

}
