import java.util.Stack;

public class JavaStackClass {
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<>();

		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		myStack.push(50);
		myStack.push(60);

		System.out.println("The Stack size: "+myStack.size());
		System.out.println("Top of the stack: "+myStack.peek());

		while (!myStack.empty()){
			System.out.println("Poped item: "+myStack.pop());
		}

		System.out.println(" Empty: "+myStack.empty());
	}
}
