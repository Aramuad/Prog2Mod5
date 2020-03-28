//Sam Ballard

package lab10;

public class QueueTest {

	public static void main(String[] args) {
		Queue b = new Queue();
		b.enqueue("hallo!");
		b.enqueue("ich");
		b.enqueue("bin");
		b.printBefore();
		b.enqueue("laden");
		System.out.println("Added: \'laden\'");
		b.printAfter();
		b.printBefore();
		System.out.println("Removed: \'" + b.dequeue() + "\'");
		b.printAfter();
		b.printBefore();
		System.out.println("Peeked: \'" + b.peek() + "\'");
		b.printAfter();
	}

}
