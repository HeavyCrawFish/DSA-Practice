package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {7,11,2,15,3,20};
		int k = 3;
		
		System.out.println(solve(arr,k));
	}

	private static Integer solve(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
		for(int i=0;i<arr.length;i++) {
			maxHeap.add(arr[i]);
			if(maxHeap.size() > k) {
				maxHeap.poll();
			}
		}
		return maxHeap.peek();
	}

}
