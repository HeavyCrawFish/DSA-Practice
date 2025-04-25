package ArraysAndStrings;

public class Printing1toN {

	//1 to n
	public static void func(int n) {
		if(n==1) {			
			System.out.print(1+" ");
			return;
		} 
		func(n-1);
		System.out.print(n+" ");
	}
	
	//n to 1
	public static void revfunc(int k) {
		if(k==1) {			
			System.out.print(1+" ");
			return;
		} 
		System.out.print(k+" ");
		revfunc(k-1);
	}
	
	//factorial
	public static int fact(int n) {
		if(n==1) {			
			return n;
		}
		return n*fact(n-1);
	}
	
	public static void main(String[] args) {
//		func(10);
//		System.out.println("\n");
//		revfunc(12);
		System.out.println(fact(5));
	}
}
