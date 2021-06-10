import java.util.ArrayList;
import java.util.List;

public class MinStack {
    List<Integer> stack;
    List<Integer> minStack;
    /** initialize your data structure here. */
    public MinStack() {
        stack=new ArrayList<>();
        minStack=new ArrayList<>();
    }

    public void push(int x) {
        if (stack.size()==0 || x<= minStack.get(minStack.size()-1)){
            minStack.add(x);
        }
        stack.add(x);
    }

    public void pop() {
        if (stack.size()>0){
            if (stack.get(stack.size()-1).intValue()==minStack.get(minStack.size()-1).intValue()){
                minStack.remove(minStack.size()-1);
            }
            stack.remove(stack.size()-1);
        }

    }

    public int top() {
        return stack.get(stack.size()-1);
    }

    public int min() {
        return minStack.get(minStack.size()-1);
    }

    public static void main(String[] args) {
        MinStack minStack=new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.min());
    }
}
