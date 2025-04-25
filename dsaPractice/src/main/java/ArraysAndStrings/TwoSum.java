package ArraysAndStrings;

public class TwoSum {
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(twoSum(nums,3));
	}
	
	public static int[] twoSum(int[] numbers, int target) {
		
		int i =0,n=numbers.length -1;
		
		if(n == 0) {
			return numbers;
		}
		while(i<n) {
			if(numbers[i] + numbers[n] == target) {
				int []res = {numbers[i],numbers[n]};
				return res;
			} else if(numbers[i] + numbers[n] > target) {
				n--;
			} else if(numbers[i] + numbers[n] < target) {
				i++;
			}
		}
		return numbers;
        
    }
}
