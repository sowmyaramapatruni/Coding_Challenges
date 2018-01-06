import java.util.*;
public class SortStack {
    public static Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> resultStack = new Stack<Integer>();
	while(! stack.isEmpty()){
	    int n = stack.pop();
	    if(resultStack.isEmpty()) {
	        resultStack.push(n);
		continue;
	    }
            while(! resultStack.isEmpty() && n > resultStack.peek()){
	        stack.push(resultStack.pop());
	    }
	    resultStack.push(n);
	}
        return resultStack;
    }
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
	stack.push(2);
	stack.push(8);
	stack.push(4);
	stack.push(5);
	System.out.println(stack);
	Stack<Integer> newStack = new Stack<Integer>();
	newStack = sortStack(stack);
	System.out.println(newStack);
    }

}
