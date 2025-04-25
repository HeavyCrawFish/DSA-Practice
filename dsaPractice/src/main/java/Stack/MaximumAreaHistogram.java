package Stack;

import java.util.*;

import Factory.Pair;

public class MaximumAreaHistogram {
	

	private static void maxAreaHistogram(int[] nums) {
		// we use nsl index and nsr index to find area
		
		List<Integer> nslIndex = nsl(nums);
		List<Integer> nsrIndex = nsr(nums);
		
		System.out.println(nsrIndex);
		System.out.println(nslIndex);
		
		List<Integer> area = new ArrayList<>();
		for(int i=0;i<nums.length;i++) {
			area.add((nsrIndex.get(i) - nslIndex.get(i) -1) * nums[i]); // area logic
		}
		
		System.out.println(Collections.max(area)); // max area
		
	}

	private static List<Integer> nsr(int[] nums) {
		List<Integer> res = new ArrayList<Integer>();
		Stack<Pair<Integer,Integer>> st = new Stack<Pair<Integer,Integer>>();
		
		for(int i=nums.length -1;i>=0;i--) {
			if(st.size() == 0) {
				res.add(nums.length);//taking the furthest index as nums.length for now
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
	
	public static void main(String[] args) {
		int[] nums = {6,2,5,4,5,1,6};
		maxAreaHistogram(nums);
	}

}
