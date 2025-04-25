package Heap;

import java.util.*;

public class SortKsortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = {6,5,3,2,8,10,9};
		int[] arr = {4,23,11,8,5,7,9};
		int k = 3;
		
		solve(arr,k);
	}

	private static void solve(int[] arr, int k) {
		// TODO Auto-generated method stub
		List<Integer> newArr = new ArrayList<Integer>();
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int i = 0;i<arr.length;i++) {
			minHeap.add(arr[i]);
			if(minHeap.size() > k) {
				newArr.add(minHeap.poll());
			}
		}
		while(!minHeap.isEmpty()) {
			newArr.add(minHeap.poll());
		}
		
		for(Integer temp:newArr) {
			System.out.print(temp+",");
		}
	}

}
