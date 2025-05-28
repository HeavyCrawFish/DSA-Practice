package tree;

import java.util.Scanner;

public class Executor {

	public static void main(String[] args) {
		
		try {
			
			System.out.println("Make a tree!!");
			Node btree = new Node(10);
			btree.setLeft(new Node(5));
			btree.setRight(new Node(4));
			btree.getLeft().setLeft(new Node(3));
			btree.getLeft().setRight(new Node(6));
			btree.getRight().setLeft(new Node(9));
			btree.getRight().getLeft().setRight(new Node(8));
			System.out.println("Choose:");
			System.out.println("1. height of a tree");
			System.out.println("2. BFS");
			Scanner sc= new Scanner(System.in);
			int a = sc.nextInt();
			switch(a) {
			
			case 1: int height = calculateHeight(btree);
			System.out.println("height of the tree is:"+height);
			break;
			
			case 2:System.out.println("Give a number to search from the tree: ");
			int k = sc.nextInt();
			BFS(btree,k);
			break;
			
			default: System.out.println("wrong option!");
			}
			
				
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	private static void BFS(Node btree, int k) {
		// TODO Auto-generated method stub
		
	}

	private static int calculateHeight(Node node) {
//		int sum=0;
		// TODO Auto-generated method stub
		if(node == null) {
			return 0;
		}
		return 1+Math.max(calculateHeight(node.getLeft()),calculateHeight(node.getRight()));
		
		
	}
}
