package ArraysAndStrings;
import java.util.*;
public class RemoveDuplicatesFromSorted {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int j=0;
        arr.add(nums[0]);
        for(int i=1;i<nums.length;i++){
        	System.out.print(nums[i]+",");
            if(nums[i] == arr.get(j)){
                continue;
            } else {
                arr.add(nums[i]);
                j++;
            }
        }
        return arr.size();
    }
}
