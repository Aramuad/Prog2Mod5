package lab9;

public class LinkedList {
	private Node head;
	private int size;
	
	LinkedList() {
		head = new Node();
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	public int find(int index) {
		int count = 0;
		Node thisNode = this.head;
		while(thisNode != null) {
			if(count == index) {
				return thisNode.getData();
			}
			count++;
			thisNode = thisNode.getNextNode();
		}
		return 0;
	}
	public void add(int data) {
		Node newNode = new Node(data, head);
		this.head = newNode;
		this.size++;
	}
	public boolean remove(int data) {
		Node thisNode = this.head;
		Node prevNode = null;
		while(thisNode != null) {
			if(thisNode.getData() == data) {
				if(prevNode != null) {
					prevNode.setNextNode(thisNode.getNextNode());
				} else {
					this.head = null;
				}
				this.setSize(this.getSize() - 1);
				return true;
			}
			prevNode = thisNode;
			thisNode = thisNode.getNextNode();
		}
		return false;
	}
	public void printListBefore() {
		Node thisNode = this.head;
		System.out.print("Linked List before specified action taken: ");
		while(thisNode != null) {
			System.out.print(thisNode.getData() + ", ");
			thisNode = thisNode.getNextNode();
		}
		System.out.println();
	}
	public void printListAfter() {
		Node thisNode = this.head;
		System.out.print("Linked List after specified action taken: ");
		while(thisNode != null) {
			System.out.print(thisNode.getData() + ", ");
			thisNode = thisNode.getNextNode();
		}
		System.out.println();
	}
	public int sumElements() {
		int sum = 0;
		Node thisNode = this.head;
		while(thisNode != null) {
			sum = sum + thisNode.getData();
		}
		return sum;
	}
}
