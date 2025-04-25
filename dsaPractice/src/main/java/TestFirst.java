import java.util.List;
import java.util.*;

//import tree.HashSet;
//import tree.Set;

import java.util.*;

public class TestFirst{
	public static void main(String args[]) {
//		ArrayList<String> cc = new ArrayList<String>();
//		cc.add("12 0 21 14 0 23");
//		System.out.println(circles(cc));
//		
//		Set<Integer> flag = new HashSet<Integer>();
		String s="xx";
		String t="x";
		System.out.println(isAnagram(s, t));
		
	
		
	}
	
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
        
	
//	public List<List<String>> groupAnagrams(String[] strs) {
//        List<String> ch = new ArrayList<>();
//        HashMap<char[],Integer> tmap = new HashMap<>();
//        
//        for(int i=0;i<strs.length;i++){
//            for(int j=0;j<strs[i].length();j++) {
//            	
//            }
//        }
//    }
	public static boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            countS.put(s.charAt(i), countS.getOrDefault(s.charAt(i), 0) + 1);
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }
        return countS.equals(countT);
	}
	
	@SuppressWarnings("null")
	public static ArrayList<String> circles(List<String> circlePairs) {
		
		ArrayList<String> result = new ArrayList<String>();
		
		
		
		for(int i=0;i<circlePairs.size();i++) {
			String[] arr = circlePairs.get(i).split(" ");
			int xA = Integer.parseInt(arr[0]);
			System.out.println(xA);
			int yA = Integer.parseInt(arr[1]);
			int rA = Integer.parseInt(arr[2]);
			int xB = Integer.parseInt(arr[3]);
			int yB = Integer.parseInt(arr[4]);
			int rB = Integer.parseInt(arr[5]);
			
			double distance = Math.pow(((xA - xB)*2 + (yA-yB)*2),0.5);
			
			if(distance == rA+rB) {
				result.add("Touching");
			} else if(distance == 0 && rA == rB) {
				result.add("Concentric");
			} else if(distance < rA+rB) {
				result.add("Intersecting");
			} else if(distance > rA+rB) {
				if(distance > Math.max(rA,rB)) {
					result.add("Disjoint-Outside");
				} else {
					result.add("Disjoint-Inside");
				}
			}
			
		}
		
		return result;
	}
}