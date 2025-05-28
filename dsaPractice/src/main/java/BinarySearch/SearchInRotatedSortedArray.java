package BinarySearch;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {11,12,15,18,2,5,6,8};
		
		System.out.println(solve(nums));
	}

	private static int solve(int[] nums) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length -1;
		int n = nums.length;
		if(nums[0] < nums[n-1]) {
			return nums[0];
		}
		while(start < end) {
			int mid = (start+end)/2;
			
			int next = (mid+1)%2;
			int prev = (mid + n -1)%2;
			
			if(nums[mid] < nums[prev] && nums[mid] <= nums[next]) {
				return nums[mid];
			}
			
				if(nums[0] <= nums[mid]) {
					start = mid+1;
				} else if(nums[mid] <= nums[n-1]){
					end = mid -1;
				}
		}
		
		return -1;
	}

}
