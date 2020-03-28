package queueWithStacks;

public class Node {
	private Person data;
	private Node nextNode;
	
	Node() {
	}
	Node(Person human) {
		this.data = human;
	}
	Node(Person human, Node nextNode) {
		this.data = human;
		this.nextNode = nextNode;
	}
	public Person getData() {
		return data;
	}
	public void setData(Person human) {
		this.data = human;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}
