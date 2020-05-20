package ques3;
import java.util.Stack;

class Node {
	int data;
	Node next;

	Node(int i)
	{
		this.data = i;
		this.next = null;
	}
}

class StcPalindrome
{
	

	public static void main(String[] args)
	{
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(2);
		head.next.next.next.next = new Node(1);

		if (isPalindrome(head)) {
			System.out.print("Linked List is a palindrome.");
		} else {
			System.out.print("Linked List is not a palindrome.");
		}
	}
	public static boolean isPalindrome(Node head)
	{
		Stack<Integer> s = new Stack<>();

		Node node = head;
		while (node != null) {
			s.push(node.data);
			node = node.next;
		}
		node = head;
		while (node != null)
		{
			int top = s.pop();
			if (top != node.data) {
				return false;
			}
			node = node.next;
		}
		return true;
	}
}