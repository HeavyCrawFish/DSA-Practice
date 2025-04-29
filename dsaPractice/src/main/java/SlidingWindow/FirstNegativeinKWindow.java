package SlidingWindow;
import java.util.*;

public class FirstNegativeinKWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int[] arr = {12,-1,-7,8,-15,30,16,28};

		neg(arr,k);
	}

	private static void neg(int[] arr, int k) {
		// TODO Auto-generated method stub
		int i=0,j=0;
		List<Integer> res = new ArrayList<>();
		Queue<Integer> list = new LinkedList<>();
		while(j<arr.length) {
			if(arr[j] < 0) {
				list.add(arr[j]);
			}
			if(j-i+1 < k) {
				j++;
			} else if(j - i +1 == k) {
				if(list.isEmpty()) {
					res.add(0);
				} else {					
					res.add(list.peek());
					if(arr[i] == list.peek()) {
						list.remove();
					}
				}
				
				i++;
				j++;
			}
		}
		
		System.out.println(res);
	}

}
