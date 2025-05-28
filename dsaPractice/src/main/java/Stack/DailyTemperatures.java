package Stack;
import java.util.*;
public class DailyTemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] temp = {30,38,30,36,35,40,28};
		int[] res = dailyTemperatures(temp);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static int[] dailyTemperatures(int[] temperatures) {
        List<Integer> list = new ArrayList<>();
		Stack<Map.Entry<Integer,Integer>> st = new Stack<>();
//		List<Integer> arrList = new ArrayList(Arrays.asList(arr));
		
		for(int i=temperatures.length-1;i>=0;i--) {			
			if(st.size() == 0) {
				list.add(i);
			}
			else if(st.size() >0 && st.peek().getKey() > temperatures[i]) {
				list.add(st.peek().getValue());
				
			} 
			else if(st.size() >0 && st.peek().getKey() <= temperatures[i] ){
				while(st.size() >0 && st.peek().getKey() <= temperatures[i]) {
					st.pop();
				}
				if(st.size() == 0) {
					list.add(i);
				} else {
					list.add(st.peek().getValue());
				}
			}
			Map.Entry<Integer, Integer> entry = new AbstractMap.SimpleEntry<>(temperatures[i], i);
			st.push(entry);
		}
		Collections.reverse(list);
		System.out.println(list);
		// array method
		int[] v = list.stream().mapToInt(t->t).toArray();
		
		for(int i=0;i<v.length;i++) {
			v[i] =v[i]-i;
		}
		return v;
    }
}
