package leetcode225;

public class MyStack
{
	int[] s;
	int top;
	int size;

	/** initialize your data structure here. */
	public MyStack()
	{
		s = new int[10];
		top = -1;
		size = 0;

	}

	private void resize(int size)
	{
		int[] rs = new int[size];
		for (int i = 0; i <= top; i++)
		{
			rs[i] = s[i];
		}
		s = rs;
	}

	public void push(int x)
	{

		s[++top] = x;
		size++;
		if (size >= s.length / 2)
			resize(2 * s.length);

	}

	public void pop()
	{

		top--;
		size--;
		if (size <= s.length / 4)
			resize(s.length / 2);

	}

	public int top()
	{
		return top != -1 ? s[top] : 0;
	}

	public boolean empty()
	{
		return size==0;
	}
}
