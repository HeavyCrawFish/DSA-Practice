package Stack;

import java.util.*;

import Factory.Pair;
public class MaxAreaOfRectangleInBinaryMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4,m=4;
		int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
		int max = 0;
		int[] v = new int[m];
		for(int j=0;j<m;j++) {
			v[j] = arr[0][j];
			System.out.print(v[j]);
		}
		System.out.println();
		max = maxAreaHistogram(v);
		for(int i=1;i<n;i++) {
			for(int j=0;j<m;j++) {
//				System.out.print(arr[i][j]);
				if(arr[i][j] == 0) {
					v[j] = 0;
				} else {
					v[j] =v[j] +arr[i][j];
				}
				
				System.out.print(v[j]);
			}
			System.out.println();
			max = Math.max(max, maxAreaHistogram(v));
			
		}
		
		System.out.println("Max area is:"+max);

	}

	private static int maxAreaHistogram(int[] nums) {
		List<Integer> nslIndex = nsl(nums);
		List<Integer> nsrIndex = nsr(nums);
		
		System.out.println(nsrIndex);
		System.out.println(nslIndex);
		List<Integer> area = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			area.add((nsrIndex.get(i) - nslIndex.get(i) -1) * nums[i]); // area logic
		}
//		System.out.println(area);
		return Collections.max(area);
	}
	
	private static List<Integer> nsr(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		Stack<Pair<Integer,Integer>> st = new Stack<Pair<Integer,Integer>>();
		
		for(int i=nums.length -1;i>=0;i--) {
			if(st.size() == 0) {
				res.add(nums.length);//taking the furthest index as 7 for now
			} else if(st.size() > 0 && st.peek().getSecond() < nums[i]) {
				res.add(st.peek().getFirst());
			} else if(st.size() > 0 && st.peek().getSecond() >= nums[i]) {
				while(st.size()>0 && st.peek().getSecond() >= nums[i]) {
					st.pop();
				}
				if(st.size() ==0) {
					res.add(nums.length);
				} else {
					res.add(st.peek().getFirst());
				}
			}
			
			st.push(new Pair<Integer,Integer>(i,nums[i]));
		}
		Collections.reverse(res);
		return res;
	}

	private static List<Integer> nsl(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		Stack<Pair<Integer,Integer>> st = new Stack<Pair<Integer,Integer>>();
		
		for(int i=0;i<nums.length;i++) {
			if(st.size() == 0) {
				res.add(-1);//taking the furthest index as -1 for now
			} else if(st.size() > 0 && st.peek().getSecond() < nums[i]) {
				res.add(st.peek().getFirst());
			} else if(st.size() > 0 && st.peek().getSecond() >= nums[i]) {
				while(st.size()>0 && st.peek().getSecond() >= nums[i]) {
					st.pop();
				}
				if(st.size() ==0) {
					res.add(-1);
				} else {
					res.add(st.peek().getFirst());
				}
			}
			
			st.push(new Pair<Integer,Integer>(i,nums[i]));
		}
		return res;
	}

}
