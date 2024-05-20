package LinkedList;

import LinkedList.LinkedList.ListNode;

public class MergeTwoSortedList {

	static ListNode merge(ListNode l1, ListNode l2) {

		ListNode tempNode = new ListNode(0);
		ListNode current = tempNode;

		while (l1 != null && l2 != null) {
			if (l1.data <= l2.data) {
				current.next = l1;
				l1 = l1.next;
			} else {
				current.next = l2;
				l2 = l2.next;
			}

			current = current.next;
		}

		if (l1 != null) {
			current.next = l1;
			l1 = l1.next;
		}

		if (l2 != null) {
			current.next = l2;
			l2 = l2.next;
		}
		return tempNode.next;
	}

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ListNode head = new ListNode(1);
		ListNode second = new ListNode(2);
		ListNode third = new ListNode(3);
		ListNode forth = new ListNode(4);

//		connecting them
		head.next = second; // 10 -> 1
		second.next = third; // 10 -> 1 -> 8
		third.next = forth; // 10 -> 1 -> 8 -> 11 -> null

		ll.display(head);

		ListNode h = new ListNode(1);
		ListNode s = new ListNode(4);
		ListNode t = new ListNode(7);
		ListNode f = new ListNode(8);

//		connecting them
		h.next = s; // 10 -> 1
		s.next = t; // 10 -> 1 -> 8
		t.next = f; // 10 -> 1 -> 8 -> 11 -> null

		ll.display(h);

		ListNode merge = merge(head, h);
		ll.display(merge);
	}

}
