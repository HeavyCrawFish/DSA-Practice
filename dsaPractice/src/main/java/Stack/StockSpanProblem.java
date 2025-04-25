package Stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.*;

public class StockSpanProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr = {100,80,60,70,60,75,85};
			stockSpan(arr);
	}

	private static void stockSpan(int[] arr) {
		// we used nGL left index
		List<Integer> list = new ArrayList<>();
		Stack<Map.Entry<Integer,Integer>> st = new Stack<>();
//		List<Integer> arrList = new ArrayList(Arrays.asList(arr));
		
		for(int i=0;i<arr.length;i++) {			
			if(st.size() == 0) {
				list.add(-1);
			}
			else if(st.size() >0 && st.peek().getKey() > arr[i]) {
				list.add(st.peek().getValue());
				
			} 
			else if(st.size() >0 && st.peek().getKey() <= arr[i] ){
				while(st.size() >0 && st.peek().getKey() <= arr[i]) {
					st.pop();
				}
				if(st.size() == 0) {
					list.add(-1);
				} else {
					list.add(st.peek().getValue());
				}
			}
			Map.Entry<Integer, Integer> entry = new AbstractMap.SimpleEntry<>(arr[i], i);
			st.push(entry);
		}
		// array method
//		int[] v = list.stream().mapToInt(t->t).toArray();
//		
//		for(int i=0;i<v.length;i++) {
//			v[i] = i-v[i];
//			System.out.println(v[i]);
//		}
//		
		// list way java 8
		List<Integer> differences = IntStream.range(0, list.size())
                .mapToObj(i -> i - list.get(i))  // index - value
                .collect(Collectors.toList());

        System.out.println(differences);
	}

}
