package BinarySearch;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		
		int start = 0;
		int end = nums.length-1;
		int k =9;
		while(start < end) {
			int mid = (start+end)/2;
			
			if(nums[mid] == k) {
				System.out.println(mid);
				break;
			} 
			if(nums[mid] < k) {
				start = mid+1;
			} else if(nums[mid] >k) {
				end = mid-1;
			}
		}
	}

}
