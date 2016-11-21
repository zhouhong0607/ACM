package leetcode24;

public class Solution
{

	public ListNode swapPairs(ListNode head)
	{
		if (head == null || head.next == null)
			return head;
		ListNode newHead = head.next, a = head, b = a.next, pre = null;
		while (a != null && b != null)
		{
			a.next = b.next;
			b.next = a;
			if (pre != null)
				pre.next = b;
			if (a.next == null)
				break;
			b = a.next.next;
			pre = a;
			a = a.next;
		}
		return newHead;
	}

//	public ListNode swapPairs(ListNode head)
//	{
//		if (head == null)
//			return null;
//		ListNode pre = new ListNode(0);
//		pre.next = head;
//		ListNode fir = pre;
//		ListNode mid = head;
//		ListNode last = head.next;
//		while (last != null && last.next != null)
//		{
//			mid.next = last.next;
//			last.next = mid;
//			pre.next = last;
//			pre = mid;
//			mid = mid.next;
//			last = mid.next;
//		}
//		// 针对 剩余 2 个节点的情况 ， 交换最后这两个节点
//		if (last != null && last.next == null)
//		{
//			mid.next = last.next;
//			last.next = mid;
//			pre.next = last;
//		}
//
//		return fir.next;
//	}

	public static void main(String[] args) throws Exception
	{
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		Solution solution = new Solution();
		solution.swapPairs(head);
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

}
