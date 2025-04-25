package ArraysAndStrings;

public class ReversePartOfArray {

	public static void main(String[] args) {
		
		int[] arr = {3,4,2,8,3,9,6,2,8,10};
		int start =3;
		int end = 7;
		
		while (start<end) {
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			
			start++;
			end --;
		}

		for(int i=0;i<arr.length;i++) {			
			System.out.print(arr[i]+", ");
		}
	}

}
