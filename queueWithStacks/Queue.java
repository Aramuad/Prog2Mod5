package queueWithStacks;

public class Queue {
	private Stack one, two;
	
	Queue() {
		this.one = new Stack();
		this.two = new Stack();
	}
	
	public Person dequeue() {
		Node thisNode = one.getHead();
		while(thisNode != null) {
			two.push(one.pop().getData());
			thisNode = thisNode.getNextNode();
		}
		Node data = two.pop();
		thisNode = two.getHead();
		while(thisNode != null) {
			one.push(two.pop().getData());
			thisNode = thisNode.getNextNode();
		}
		return data.getData();
	}
	public void enqueue(Person data) {
		one.push(data);
	}
	public void printStack() {
		Node thisNode = one.getHead();
		while(thisNode != null) {
			System.out.println("Name: " + thisNode.getData().getName());
			thisNode = thisNode.getNextNode();
		}
	}
}
