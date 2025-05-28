package Stack;
import java.util.*;
public class CarFleet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] position = {4,1,0,7};
		int[] speed = {2,2,1,1};
		int target = 10;
		
		System.out.println(carFleet(target, position, speed));
	}
	
	public static int carFleet(int target, int[] position, int[] speed) {
        Map<Integer,Integer> temp = new TreeMap<>(Collections.reverseOrder());
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<position.length;i++) {
        	temp.put(position[i], speed[i]);
        }
        
        for(Map.Entry<Integer, Integer> mp:temp.entrySet()) {
        	
        }
        
        
        return 0;
    }

}
