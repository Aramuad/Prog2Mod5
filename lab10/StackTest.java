//Sam Ballard

package lab10;

public class StackTest {

	public static void main(String[] args) {
		Stack a = new Stack();
		a.push("Hello");
		a.push("my");
		a.push("name");
		a.printBefore();
		String name = "Sam";
		a.push(name);
		System.out.println("Added: \'Sam\'");
		a.printAfter();
		a.printBefore();
		System.out.println("Removed: \'" + a.pop() + "\'");
		a.printAfter();
		a.printBefore();
		System.out.println("Peeked: \'" + a.peek() + "\'");
		a.printAfter();
	}

}
