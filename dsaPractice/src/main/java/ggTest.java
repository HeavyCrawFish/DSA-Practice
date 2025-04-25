//import java.util.*;
//
//
//class ggTest {
//    int k;
//    int[] nums;
//    public ggTest(int k, int[] nums) {
//        this.k=k;
//        this.nums = nums;
//    }
//    
//    public int add(int val) {
//        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//        List<Integer> list = new ArrayList<>();
//        for (int num : nums) {
//            list.add(num); // autoboxing int to Integer
//        }
//        list.add(val);
//        for(int i=0;i<list.size();i++){
//            minHeap.add(list.);
//            if(minHeap.size()>k){
//                minHeap.poll();
//            }
//        }
//        this.nums = newArr;
//        return minHeap.peek();
//    }
//    
//    public static void main(String[] args) {
//		System.out.println("hello");
//		int[] nums = {1,2,3,3};
//		ggTest gg = new ggTest(3,nums);
//		System.out.println(gg.add(3));
//	}
//}
//
//
