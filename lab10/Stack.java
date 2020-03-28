//Sam Ballard

package lab10;

public class Stack {
	private Node head;
	
	Stack() {
		this.head = null;
	}
	
	public void push(String data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	public String pop() {
		if(this.head == null) {
			System.out.println("Stack is empty");
		}
		Node temp = this.head;
		this.head = this.head.getNextNode();
		return temp.getData();
	}
	public String peek() {
		if(this.head == null) {
			System.out.println("Stack is empty");
		}
		return this.head.getData();
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
	public Node getHead() {
		return this.head;
	}
}
