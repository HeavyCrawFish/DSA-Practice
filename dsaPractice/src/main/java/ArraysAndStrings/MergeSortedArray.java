package ArraysAndStrings;
import java.util.*;
public class MergeSortedArray {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		int m = 3,  n = 3;
		
//		merge(nums1, m, nums2, n);
		mergeOptimized(nums1,m,nums2,n);
	}
	private static void mergeOptimized(int[] nums1, int m, int[] nums2, int n) {
		// TODO Auto-generated method stub
		   int i=m-1;
	       int j=n-1;

	       int l = m+n-1;

	       while(i>=0 && j>=0){
	            if(nums1[i] >= nums2[j]){
	                nums1[l--] = nums1[i--];
	            } else {
	                nums1[l--] = nums2[j--];
	            }
	       }
	       while (j>=0){
	            nums1[l--] = nums2[j--];
	       }
	       
	       
	       for(int p=0;p<nums1.length;p++){
	    	   System.out.print(nums1[p]+",");
	       }
	}
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
	       List<Integer> arr = new ArrayList<>();
	       if(n==0){
	    	   for(int p=0;p<nums1.length;p++) {	    		   
	    		   System.out.println(nums1[p]+",");
	    	   }
	            return;
	       }
	       if(m==0){
	            for(int i=0;i<n;i++){
	                nums1[i] = nums2[i];
	            }
	            for(int p=0;p<nums1.length;p++) {	    		   
		    		   System.out.println(nums1[p]+",");
		    	   }
//	            System.out.println(nums1);
	            return;
	       }
	       int i=0,j=0;
	       while(i<m && j<n){
	            if(nums1[i]<nums2[j]){
	                arr.add(nums1[i]);
	                i++;
	            } else if(nums1[i]>nums2[j]){
	                arr.add(nums2[j]);
	                j++;
	            } else if(nums1[i] == nums2[j]){
	                arr.add(nums1[i]);
	                arr.add(nums2[j]);
	                i++;
	                j++;
	            }
	       }

	       while(i<m){
	        arr.add(nums1[i]);
	        i--;
	       }
	       while(j<n){
	        arr.add(nums2[j]);
	        j--;
	       }


	       for(int p=0;p<arr.size();p++){
//	            nums1[p] = arr.get(p);
	    	   System.out.print(arr.get(i)+",");
	       }

//	       System.out.println(nums1);
	    }

}
