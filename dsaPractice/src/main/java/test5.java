import java.util.*;
public class test5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int length = sc.nextInt();
		
		List<Integer> arr = new ArrayList<>();
		for(int i=0;i<length;i++) {
			arr.add(sc.nextInt());
		}
		
		int possum =0,negsum=0,pctr=0,nctr=0;
		
		for(int i=0;i<length;i++) {
			if(arr.get(i) >0) {
				possum+=arr.get(i);
				pctr++;
			} else if(arr.get(i) <0) {
				negsum+=arr.get(i);
				nctr++;
			}
		}
		
		if(Math.abs(possum) == Math.abs(negsum)) {
			System.out.println(pctr+nctr);
		}
		if(pctr>nctr || nctr>pctr) {
			int sum=pctr+nctr;
			System.out.println(sum - (sum%2));
		}
		
		sc.close();
	}
}
