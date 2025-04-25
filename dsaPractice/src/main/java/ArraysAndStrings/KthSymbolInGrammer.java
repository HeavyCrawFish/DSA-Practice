package ArraysAndStrings;

public class KthSymbolInGrammer {
	
	public static void main(String[] args) {
		
		int n=4,k=5;
		
		System.out.println(solve(n,k));
	}

	private static int solve(int n, int k) {
		// TODO Auto-generated method stub
		
		if(n==1 && k==1) {
			return 0;
		}
		int length = (int) Math.pow(2, n-1);
		int mid = length/2;
		
		if(k <= mid) {
			return solve(n-1,k);
		} else {
			return 1-solve(n-1,k-mid);
		}
		
	}

}
