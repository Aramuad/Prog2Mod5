package queueWithStacks;

public class Stack {
	private Node head;
	
	Stack() {
		this.head = null;
	}

	public Node peek() {
		if(this.head == null) {
			System.out.println("The queue is empty");
		}
			return this.head;
	}
	public void push(Person data) {
		Node newNode = new Node(data);
		newNode.setNextNode(this.head);
		this.head = newNode;
	}
	public Node pop() {
		if(this.head == null) {
			System.out.println("The queue is empty");
		}
		Node temp = this.head;
		this.head = this.head.getNextNode();
		return temp;
	}
	public void printStack() {
		Node thisNode = this.head;
		while(thisNode != null) {
			System.out.println("Name: " + thisNode.getData().getName());
			thisNode = thisNode.getNextNode();
		}
	}
	public Node getHead() {
		return this.head;
	}
	public void setHead(Node head) {
		this.head = head;
	}
}
