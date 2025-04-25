package Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KlargestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {7,11,2,15,3,20};
		int k = 3;
		
		solve(arr,k);

	}
	
	private static void solve(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i=0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
		while(!minHeap.isEmpty()) {
			System.out.println(minHeap.poll()+" ");
		}
	}

}
