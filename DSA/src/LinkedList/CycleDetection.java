package LinkedList;

import LinkedList.LinkedList.ListNode;

// Floyd's Cycle Detection Algorithm

public class CycleDetection {

	static boolean isCycle(ListNode head) {

		ListNode slowPtr = head;
		ListNode fastPtr = head;

		while (fastPtr != null && fastPtr.next != null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;

			if (fastPtr == slowPtr) {
				return true;
			}
		}

		return false;
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
		forth.next = third;

//		ll.display(head);

		boolean cycle = isCycle(head);
		if (cycle) {
			System.out.println("Cycle/Loop Detected");
		} else {
			System.out.println("Cycle/Loop Not Detected");
		}

	}

}
