package leetcode206;

import java.util.Stack;

public class Solution
{
	public ListNode reverseList(ListNode head)
	{
		ListNode fNode=null;
		while(head!=null)
		{
			ListNode nextNode=head.next;
			head.next=fNode;
			fNode=head;
			head=nextNode;
		}
		return fNode;
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
		ListNode head=new ListNode(1);
		ListNode node1=new ListNode(2);
		ListNode node2=new ListNode(3);
		head.next=node1;
		Solution solution=new Solution();
		solution.reverseList(head);
	}

}
