package Stack;

public class RainWaterTrapping {
	public static void main(String[] args) {
		int[] arr = {3,0,0,2,0,4};
		
		rainWaterTrap(arr);
	}

	private static void rainWaterTrap(int[] arr) {
		// TODO Auto-generated method stub
		int n= arr.length;
		int[] mxl = new int[n];
		int[] mxr = new int[n];
		mxl[0] = arr[0];
		mxr[n-1] = arr[n-1];
		for(int i=1;i<n;i++) {
			mxl[i] = Math.max(mxl[i-1], arr[i]);
		
		}
	
		for(int j=n-2;j>=0;j--) {
			mxr[j] = Math.max(mxr[j+1], arr[j]);
			
		}
	
		int[] water = new int[n];
		for(int i=0;i<n;i++) {
			water[i] = Math.min(mxl[i], mxr[i]) - arr[i];
			
		}
		
		int sum=0;
		for(int i=0;i<n;i++) {
			sum += water[i];
		}
		
		System.out.println("Max area of rainwater:"+sum);
	}
}
