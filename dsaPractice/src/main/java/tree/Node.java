package tree;

public class Node {

	Node left;
	Node right;
	int info;
	
	public Node(int n) {
		this.info=n;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public Node(Node left, Node right, int info) {
		this.left = left;
		this.right = right;
		this.info = info;
	}
	
}
