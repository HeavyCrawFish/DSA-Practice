package SlidingWindow;

public class LargestSubarraywithSumK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int k = 5; // this is the sum 
		int[] arr = {4,1,1,1,2,3,5};

		largestSub(arr,k);
	}

	private static void largestSub(int[] arr, int k) {
		// TODO Auto-generated method stub
		int i=0,j=0,sum=0,mx =Integer.MIN_VALUE;
		
		while(j<arr.length) {
			sum+=arr[j];
			while(sum > k) {					
				sum-=arr[i];
				i++;
			}
			if(sum<k) {
				j++;
			} else if(sum == k) {
				mx = Math.max(j-i+1, mx);
				
				j++;
			}
		}
		System.out.println(mx);
	}

}
