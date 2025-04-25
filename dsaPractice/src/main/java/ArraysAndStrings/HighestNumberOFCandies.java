package ArraysAndStrings;
import java.util.ArrayList;
import java.util.*;

public class HighestNumberOFCandies {
	public static void main(String[] args) {
		
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		
		ArrayList<Boolean> result = new ArrayList<Boolean>();
		
		result = maxCandies(candies,extraCandies);
		System.out.println(result);
		
		
		
		
		
	}

	private static ArrayList<Boolean> maxCandies(int[] candies, int extraCandies) {
		
		Map<Integer, Integer> sumMap = new HashMap<Integer,Integer>();
		ArrayList<Boolean> arr = new ArrayList<Boolean>();
		
		for(int i=0;i<candies.length;i++) {
			sumMap.put(i, (candies[i]+extraCandies));
			arr.add(i, true);
		}
		
		for(int i=0;i<candies.length;i++) {
			boolean temp=true;
			for(int j =0;j<candies.length;j++) {
				if(sumMap.get(i) >= candies[j]) {
					temp=true;
				} else {
					temp=false;
					break;
				}
			}
			arr.set(i, temp);
		}
		
		return arr;
	}
}
