package LinkedList;

public class LinkedList {

	public ListNode head;

	public static class ListNode {
		public int data; // Generic type
		public ListNode next;

		public ListNode(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void display(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + " --> ");
			current = current.next;
		}
		System.out.println("null");
	}

}
