
import java.util.*;
public class Test2 {
	//{4,5,2,4,2,10,9,10}
	public static void main(String[] args) {		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(5);
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(10);
		list.add(9);
		list.add(10);
		
		
		
		Map<Integer,Integer> temp = new HashMap<>();
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<list.size();i++) {
			if(temp.get(list.get(i)) == null) {
				temp.put(list.get(i),1);
			} else {
				int freq =temp.get(list.get(i)) ;
				temp.replace(list.get(i), freq+=1);
			}
		}
		
		for(Map.Entry<Integer, Integer> m : temp.entrySet()) {
			if(m.getValue() == 1) {
				list1.add(m.getKey());
			}
		}
		
		for(int i=0;i<list.size();i++) {
			if(list1.indexOf(list.get(i)) != -1) {
				System.out.println(list1.get(list1.indexOf(list.get(i))));
				break;
			}
		}
	}
	
	

}
