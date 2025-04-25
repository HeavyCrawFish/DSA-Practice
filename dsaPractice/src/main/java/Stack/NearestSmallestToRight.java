package Stack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallestToRight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {4,5,2,10,8};
			ngl(arr);
	}

	private static void ngl(int[] arr) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		Stack<Integer> st = new Stack<>();
		
		for(int i=arr.length -1;i>=0;i--) {			
			if(st.size() == 0) {
				list.add(-1);
			}
			else if(st.size() >0 && st.peek() < arr[i]) {
				list.add(st.peek());
			} 
			else if(st.size() >0 && st.peek() >= arr[i] ){
				while(st.size() >0 && st.peek() >= arr[i]) {
					st.pop();
				}
				if(st.size() == 0) {
					list.add(-1);
				} else {
					list.add(st.peek());
				}
			}
			st.push(arr[i]);
		}
		Collections.reverse(list);
		System.out.println(list);
	}
}
