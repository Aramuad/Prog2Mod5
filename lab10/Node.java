//Sam Ballard

package lab10;

public class Node {
	private String data;
	private Node nextNode;
	
	Node() {
	}
	Node(String data) {
		this.data = data;
	}
	Node(String data, Node nextNode) {
		this.data = data;
		this.nextNode = nextNode;
	}
	
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getNextNode() {
		return nextNode;
	}
}
