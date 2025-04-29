package SlidingWindow;

public class MaxSubrraySumwithKwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 3;
		int[] arr = {2,5,1,6,5,4};
//		maxSum(arr,k);
		System.out.println(maxSum(arr,k));
		
	}

	private static int maxSum(int[] arr, int k) {
		// TODO Auto-generated method stub
		int i=0,j=0,sum=0,mx=Integer.MIN_VALUE;
		
		while(j<arr.length) {
			sum+=arr[j];
			if(j-i+1 < k) {
				j++;
			} else if(j -i + 1 == k) {
				mx = Math.max(sum, mx);
			
				sum -= arr[i];
				i++;
				j++;
			}
		}
		
		
		return mx;
	}

}
