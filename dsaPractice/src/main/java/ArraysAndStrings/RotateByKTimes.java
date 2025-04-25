package ArraysAndStrings;
import java.util.*;

public class RotateByKTimes {

	public static void main(String[] args) {
		int[] arr = {3,-2,1,4,6,9,8};
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		
		
		//reversing the whole array
		int start =0, end=arr.length-1;
		
		while(start<end) {
			swap(arr,start,end);
			
			start++;
			end--;
		}
		
		//handling first k elements
		start=0;end=k-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
		//handling n-k elements
		start=k; end=arr.length-1;
		while(start<end) {
			swap(arr,start,end);
			start++;
			end--;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.printf(arr[i]+", ");
		}
	}

	private static void swap(int[] arr, int st, int ed) {
		int temp = arr[st];
		arr[st]=arr[ed];
		arr[ed]=temp;
	}

}
