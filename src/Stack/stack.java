package Stack;

public class stack {
	
	public static void main(String[] args) {
		
		//array
		
		//ArrayStack stack = new ArrayStack(10);
		
		LinkedStack stack = new LinkedStack();
		
		stack.push(new Employee("Jane","Jones",123));
		
		stack.push(new Employee("fane","fones",123));
		
		stack.push(new Employee("zane","zones",123));
		
		stack.push(new Employee("dane","dones",123));
		
		stack.push(new Employee("bane","bones",123));
		
		stack.printStack();
		
		System.out.println("peek");
		System.out.println(stack.peek());
		System.out.println("Pop");
		stack.pop();
		stack.printStack();
		System.out.println("Popping "+stack.pop());
		stack.printStack();
	}
	
}
