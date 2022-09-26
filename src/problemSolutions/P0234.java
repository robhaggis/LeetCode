package problemSolutions;

import java.util.Stack;

import SupportClasses.ListNode;

public class P0234 {

	public static boolean isPalindrome(ListNode head) {
		ListNode next = head;
		boolean isPalin = false;
		Stack<Integer> stack = new Stack<Integer>();
		while (next != null) {
			stack.push(next.val);
			next = next.next;
		}

		while (head != null) {
			int i = stack.pop();
			if (head.val == i) {
				isPalin = true;
			} else {
				isPalin = false;
				break;
			}
			// Move to the next element in stack and the list
			head = head.next;
		}
		return isPalin;
	}

	public static void main(String[] args) {

		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		a1.next = a2;

		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(2);
		ListNode b3 = new ListNode(2);
		ListNode b4 = new ListNode(1);
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;

		System.out.println(isPalindrome(a2));

	}
}
