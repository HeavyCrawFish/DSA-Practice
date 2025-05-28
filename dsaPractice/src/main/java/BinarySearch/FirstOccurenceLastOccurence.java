package BinarySearch;

public class FirstOccurenceLastOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,4,10,10,10,18,20};
		int k = 10;
		System.out.println(FirstOcc(nums,k));
		System.out.println(LastOcc(nums,k));
	}

	private static int LastOcc(int[] nums, int k) {
		// TODO Auto-generated method stub
		int start = 0;
		int end= nums.length -1;
		int res = -1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(nums[mid] == k) {
				res = mid;
				start = mid+1;
			} 
			else if(k > nums[mid]) {
				start = mid+1;
			} else if(k < nums[mid]) {
				end = mid-1;
			}
		}
		
		return res;
	}

	private static int FirstOcc(int[] nums, int k) {
		// TODO Auto-generated method stub
		int start = 0;
		int end= nums.length -1;
		int res = -1;
		while(start<=end) {
			int mid = (start+end)/2;
			if(nums[mid] == k) {
				res = mid;
				end = mid-1;
			} 
			else if(k > nums[mid]) {
				start = mid+1;
			} else if(k < nums[mid]) {
				end = mid-1;
			}
		}
		
		return res;
	}

}
