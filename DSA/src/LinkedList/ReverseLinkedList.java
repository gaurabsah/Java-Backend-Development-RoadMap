package LinkedList;

import LinkedList.LinkedList.ListNode;

public class ReverseLinkedList {

	public static ListNode reverse(ListNode head) {
		if (head == null) {
			return head;
		}

		ListNode current = head;
		ListNode next = null;
		ListNode previous = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ListNode head = new ListNode(10);
		ListNode second = new ListNode(1);
		ListNode third = new ListNode(8);
		ListNode forth = new ListNode(11);

//		connecting them
		head.next = second; // 10 -> 1
		second.next = third; // 10 -> 1 -> 8
		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		ll.display(head);

		ListNode reverse = reverse(head);
		ll.display(reverse);

	}

}
