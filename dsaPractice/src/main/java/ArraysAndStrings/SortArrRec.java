package ArraysAndStrings;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class SortArrRec {
	
	static void sort(List<Integer> arr) {
		if(arr.size() == 1) {
			System.out.println("Arr is sorted:"+arr.get(0));
			return;
		}
		
		int temp = arr.get(arr.size()-1);
		List<Integer> newArr = IntStream.range(0, arr.size() - 1) // Exclude last index
                .mapToObj(arr::get)
                .collect(Collectors.toList());
		insert(newArr,temp);
		
	}
	
	private static void insert(List<Integer> arr, int temp) {
		// TODO Auto-generated method stub
		if(arr.size() == 0 || arr.get(arr.size()-1) <= temp) {
			arr.add(temp);
		}
		int val = arr.get(arr.size()-1);
		List<Integer> newList = IntStream.range(0, arr.size() - 1) // Exclude last index
                .mapToObj(arr::get)
                .collect(Collectors.toList());
		arr = newList;
		if(val > temp) {			
			insert(arr,temp);
		} else {
			arr.add(val);
		}
		return;
		
	}

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>(List.of(2,0,1,5));
		sort(arr);
		arr.stream().forEach(x -> System.out.println(x));
//		System.out.println(arr);
	}

}
