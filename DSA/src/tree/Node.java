package tree;

// Representation of Tree

public class Node {

	int data;
	Node left;
	Node right;

	public Node(int key) {
		this.data = key;
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(3);
		root.right = new Node(4);
		root.right.left = new Node(7);

		System.out.println(root);

	}

}
