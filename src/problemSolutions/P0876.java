package problemSolutions;

import java.util.ArrayList;
import java.util.List;

import SupportClasses.ListNode;

public class P0876 {
	public static ListNode middleNode(ListNode head) {

		ListNode next = head;
		List<ListNode> nodes = new ArrayList<>();
		while(next != null) {
			nodes.add(next);
			next = next.next;
		}
		int index = 0;
		if(nodes.size() %2 == 0) {
			index = (nodes.size()/2);
		}else {
			index = (int) Math.ceil(nodes.size()/2);
		}
		return nodes.get(index);
	}

	public static void main(String[] args) {

		ListNode a1 = new ListNode(1);
		ListNode a2 = new ListNode(2);
		ListNode a3 = new ListNode(3);
		ListNode a4 = new ListNode(4);
		ListNode a5 = new ListNode(5);
		a1.next = a2;
		a2.next = a3;
		a3.next = a4;
		a4.next = a5;

		ListNode b1 = new ListNode(1);
		ListNode b2 = new ListNode(2);
		ListNode b3 = new ListNode(3);
		ListNode b4 = new ListNode(4);
		ListNode b5 = new ListNode(5);
		ListNode b6 = new ListNode(6);
		b1.next = b2;
		b2.next = b3;
		b3.next = b4;
		b4.next = b5;
		b5.next = b6;

		System.out.println(middleNode(b1).val);

	}
}
