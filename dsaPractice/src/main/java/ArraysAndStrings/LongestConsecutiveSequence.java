package ArraysAndStrings;

import java.util.*;

public class LongestConsecutiveSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,20,4,10,3,4,5};
		 // Convert to ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);  // Auto-boxing from int to Integer
        }
        
        Collections.sort(list);
        
        int res = 0, curr = nums[0], streak = 0, i = 0;

        while (i < nums.length) {
            if (curr != nums[i]) {
                curr = nums[i];
                streak = 0;
            }
            while (i < nums.length && nums[i] == curr) {
                i++;
            }
            streak++;
            curr++;
            res = Math.max(res, streak);
        }
        System.out.println(res);
	}

}
