import java.util.*;
import java.util.function.Consumer;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] nums = { { 1, 2 },{2,3}};
		System.out.println(findJudge(2, nums));
		

	}

	public static int findJudge(int n, int[][] trust) {

		Map<Integer, List<Integer>> graph = new HashMap<>();
		int i = 0;
		int mx = 0;
		for(int[] pair:trust) {
			int key = pair[0];
			int value = pair[1];
			graph.computeIfAbsent(key, k-> new ArrayList<>()).add(value);
		}
		System.out.println(graph);

		for (Map.Entry<Integer, List<Integer>> m : graph.entrySet()) {
			for(Integer k:m.getValue()) {
				if(graph.get(k) == null) {
					mx = k;
				}
			}
		}
		for (Map.Entry<Integer, List<Integer>> m : graph.entrySet()) {
			if(!m.getValue().contains(mx)) {
				return -1;
			}
		}
		if(mx == 0){
            return -1;
        } else {
            return mx;
        }

	}
}
