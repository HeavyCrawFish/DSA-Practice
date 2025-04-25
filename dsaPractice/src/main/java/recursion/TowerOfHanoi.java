package recursion;

public class TowerOfHanoi {

	
	public static void main(String[] args) {
		int n=4; // number of plates
	
		hanoi(1,3,2,n);
		
	}

	private static void hanoi(int s, int d, int h, int n) {
		// TODO Auto-generated method stub
		if(n == 1) {
//			System.out.println("Only one plate!!");
			System.out.println("Moving plate "+s+" to "+d+ ";");
			return;
		}
		hanoi(s,h,d,n-1);
		System.out.println("Moving plate "+s+" to "+d+ ";");
		hanoi(h,d,s,n-1);
		return;
	}
}
