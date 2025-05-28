package Stack;
import java.util.*;
public class MinStack {
	public Stack<Integer> st;
	Stack<Integer> mst;
    public MinStack() {
        st = new Stack<Integer>();
        mst = new Stack<Integer>();
    }
    
    public void push(int val) {
        st.push(val);
        if(mst.isEmpty() ||  val <= mst.peek()) {
        	mst.push(val);
        }
    }
    
    public void pop() {
        int x = st.pop();
        if(x == mst.peek()) {
        	mst.pop();
        }
    }
    
    public int top() {
       return st.peek();
    }
    
    public int getMin() {
        return mst.peek();
    }
}

