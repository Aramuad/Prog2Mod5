//Sam Ballard

package lab10;

public class Queue {
	private Node head, tail;
	
	Queue() {
		this.head = this.tail = null;
	}

	public void enqueue(String data) {
		Node newNode = new Node(data);
		if(this.head == null) {
			this.head = newNode;
		} else {
			tail.setNextNode(newNode);
		}
		tail = newNode;
	}
	public String dequeue() {
		if(this.head == null) {
			System.out.println("Queue is empty");
		}
		Node temp = this.head;
		this.head = head.getNextNode();
		return temp.getData();
	}
	public String peek() {
		if(this.head == null) {
			System.out.println("Queue is empty");
		}
		return head.getData();
	}
	public void printBefore() {
		System.out.print("Contents before action taken: ");
		Node thisNode = this.head;
		while(thisNode != null) {
			System.out.print(thisNode.getData() + " ");
			thisNode = thisNode.getNextNode();
		}
		System.out.println();
	}
	public void printAfter() {
		System.out.print("Contents after action taken: ");
		Node thisNode = this.head;
		while(thisNode != null) {
			System.out.print(thisNode.getData() + " ");
			thisNode = thisNode.getNextNode();
		}
		System.out.println();
	}
}
