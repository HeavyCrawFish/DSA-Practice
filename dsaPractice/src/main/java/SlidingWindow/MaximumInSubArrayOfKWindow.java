package SlidingWindow;
import java.util.*;
public class MaximumInSubArrayOfKWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,3,-1,-3,5,3,6,7};
		int k= 3;
		
		solve(nums,k);
	}

	private static void solve(int[] arr, int k) {
		// TODO Auto-generated method stub
		List<Integer> ans = new ArrayList<>();
		
		int i=0,j=0;
		Deque<Integer> queue = new ArrayDeque<>();
		
		
		while(j<arr.length) {
			//calculations
			while(queue.size() > 0 && queue.getLast() < arr[j]) {
				queue.pollLast();
			}
			queue.add(arr[j]);
			
			if(j-i+1 < k) {
				j++;
			} else if(j-i+1 == k) {
				ans.add(queue.getFirst());
				if(queue.getFirst() == arr[i]) {
					queue.removeFirst();
				}
				i++;
				j++;
			}
		}
		
		System.out.println(ans);
	}

}
