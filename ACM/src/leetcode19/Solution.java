package leetcode19;

public class Solution
{
	 public ListNode removeNthFromEnd(ListNode head, int n)
		{
			ListNode node = head;
			int count = 0;
			while (node != null)
			{
			    node=node.next;
				count++;
			}
			count = count - n -1;
			if(count<0)
			{
				head=head.next;
				return head;
			}
			
			
			node = head;
			
				while (count > 0)
				{
					count--;
					node = node.next;
				}
			

//	 		ListNode deleteNode = node.next;
			node.next = node.next.next;
			return head;

		}


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
