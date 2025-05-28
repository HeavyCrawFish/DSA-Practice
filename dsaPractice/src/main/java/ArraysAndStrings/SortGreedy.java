package ArraysAndStrings;

public class SortGreedy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,0,0,5,6,0,7,8,9};
		int n = nums.length;
		int i=n-1,j=n-1;
		while(i>=0 && j>0) {
			if(nums[i]!=0) {
				int temp = nums[j];
				nums[j] = nums[i];
				nums[i] = temp;
				i--;
				j--;
			} else {
				i--;
			}
		}
		
		for(int k=0;k<n;k++) {
			if(k==n-1) {
				System.out.print(nums[k]);
			} else {				
				System.out.print(nums[k]+",");
			}
		}
		int[] fnums2 = new int[n];
	}

}
