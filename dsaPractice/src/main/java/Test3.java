//import java.util.*;
//
//public class Test3 {
//
//	public static void main(String[] args) {
//		
//		//{{eat, tea, ate},
//		//{tan, nat},
//		//{bat}}
//		
//		//{"eat", "tea", "tan", "ate", "nat", "bat"};
//		List<String> list = new ArrayList<>();
//		list.add("eat");
//		list.add("tea");
//		list.add("tan");
//		list.add("ate");
//		list.add("nat");
//		list.add("bat");
//		
//		Map<String,List<String>> temp = new HashMap<>();
//
//		for(String s:list) {
//			
//			List<Character> list1 = new ArrayList<>();
//			char[] ch = s.toCharArray();
//			for(int i=0;i<ch.length;i++) {
//				list1.add(ch[i]);
//			}
//			Collections.sort(list1);
//			String str;
//			for(Character c:list1) {
//				str +=c.toString();
//			}
//			if(temp.get(list1).isEmpty()) {				
//				temp.put(,s);
//			} else {
//				
//			}
//		}
//		
//	}
//}
