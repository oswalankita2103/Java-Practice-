import java.util.Stack;
public class StackDemo {
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		System.out.println("all elements =" +s);
		s.pop();s.pop();
		System.out.println("all elements =" +s);
		s.peek();
		System.out.println("all elements =" +s);
		System.out.println("dispaly using for each");
		for (Integer integer : s) {
			System.out.println(integer);
		}
		System.out.println("SIZE() = It is use to get a size of stack,how many elements are prasent in stack");
		System.out.println("PUSH() = It is use to push element in stack");
		System.out.println("POP() = It is use to remove the element from stack");
	}}
