//Sam Ballard

package assignment5;

public class Node {
	private BirdSpecies data;
	private Node nextNode;
	private int count = 1;
	
	Node() {
	}
	Node(BirdSpecies data) {
		this.data = data;
	}
	Node(BirdSpecies data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public BirdSpecies getData() {
		return this.data;
	}
	public void setData(BirdSpecies data) {
		this.data = data;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public int getCount() {
		return count;
	}
	public void increaseCount() {
		this.count = this.count + 1;
	}
}
