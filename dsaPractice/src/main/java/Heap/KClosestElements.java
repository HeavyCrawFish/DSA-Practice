package Heap;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class KClosestElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 6, 7, 8, 9 };
		int k = 3;
		int x = 7;

		solve(arr, k, x);
	}

	private static void solve(int[] arr, int k, int x) {
		// TODO Auto-generated method stub
		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((a,
				b) -> (a != b) ? Integer.compare(a.getKey(), b.getKey()) : Integer.compare(a.getValue(), b.getValue()));
	}

}
