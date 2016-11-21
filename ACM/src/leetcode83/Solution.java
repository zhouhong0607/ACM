package leetcode83;

public class Solution
{
	public ListNode deleteDuplicates(ListNode head)
	{
		if(head==null) return null;
		
		ListNode pre=head;
		ListNode node=head.next;
	
		while(node!=null)
		{
			if(pre.val==node.val)
			{
				pre.next=node.next;
			}else
			{
			pre=pre.next;
			}
			node=node.next;
		}
		return head;
	}

	public static void main(String[] args)throws Exception
	{
		ListNode node=new ListNode(1);
		node.next=new ListNode(1);
		node.next.next=new ListNode(2);
		node.next.next.next=new ListNode(3);
		node.next.next.next.next=new ListNode(3);
		Solution solution=new Solution();
		solution.deleteDuplicates(node);
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
