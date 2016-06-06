package leetcode141;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

public class Solution
{
	// approach 1
//	public boolean hasCycle(ListNode head)
//	{
//		if (head == null)
//			return false;
//		Set<ListNode> stack = new HashSet<>();
//		while (head != null)
//		{
//			if (stack.contains(head))
//				return true;
//			stack.add(head);
//			head = head.next;
//		}
//		return false;
//	}

	public boolean hasCycle(ListNode head)
	{
		if (head == null )
			return false;
		
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast)
		{
			if (fast == null || fast.next == null)
			{
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}

	class ListNode
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
