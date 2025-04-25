package Heap;
import java.util.*;
public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2,2,3,3};
		int k=2;
		solve(nums,k);
	}

	private static void solve(int[] nums, int k) {
		// TODO Auto-generated method stub
		Map<Integer,Integer> freq = new HashMap<>();
		List<Integer> list = new ArrayList<>();
		PriorityQueue<Map.Entry<Integer,Integer>> minheap = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getValue));
        for(int i=0;i<nums.length;i++) {
        	if(freq.containsKey(nums[i])){
        		int temp = freq.get(nums[i]);
        		freq.put(nums[i], temp+=1);
        	} else {
        		freq.put(nums[i], 1);
        	}
        }
        System.out.println(freq);
        
        for(Map.Entry<Integer, Integer> temp:freq.entrySet()) {
        	minheap.add(temp);
        	if(minheap.size() > k) {
        		minheap.poll();
        	}
        }
        System.out.println(minheap);
        while(!minheap.isEmpty()) {
        	System.out.println(minheap.peek().getKey()+":"+minheap.peek().getValue());
        	minheap.poll();
        	list.add(minheap.peek().getKey());
        }
       
	}

}
