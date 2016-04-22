package leetcode2;

public class Solution
{
	public ListNode addTwoNumbers(ListNode l1, ListNode l2)
	{
		ListNode node1 = l1;
		ListNode node2 = l2;
		ListNode pre = null;
		boolean carry = false;
		while (node1 != null || node2 != null)
		{
			int sum = node1 == null ? node2.val : (node2 == null ? node1.val : node1.val + node2.val);
			if (carry)
				sum++;
			carry = sum / 10 == 1;
			sum = sum % 10;
			if (node1 == null)
			{
				node1 = new ListNode(sum);
				pre.next = node1;
			} else
			{
				node1.val = sum;
			}
			pre = node1;
			node1 = node1.next;
			node2 = node2 == null ? null : node2.next;

		}
		if (carry)
			pre.next = new ListNode(1);

		return l1;
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

	public static void main(String[] args) throws Exception
	{
		ListNode l1 = new ListNode(0);
		ListNode l2 = new ListNode(7);
		l2.next = new ListNode(3);
		Solution solution = new Solution();
		solution.addTwoNumbers(l1, l2);

	}

}
