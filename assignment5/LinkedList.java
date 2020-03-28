//Sam Ballard

package assignment5;

public class LinkedList {
	private Node head;
	private int size;
	
	LinkedList() {
		this.head = new Node();
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public void addBird(BirdSpecies species) {
		int counter = 0;
		Node thisNode = this.head;
		while(thisNode != null && thisNode.getNextNode() != null) {
			if(thisNode.getData().getSpecies().equals(species.getSpecies())) {
				thisNode.increaseCount();
				counter++;
			}
			thisNode = thisNode.getNextNode();
		}
		if(counter == 0) {
			Node newNode = new Node(species, head);
			this.head = newNode;
			size++;
			newNode.getData().setIndex(this.size);
		}
	}
	public void getCount() {
		Node thisNode = this.head;
		while(thisNode != null && thisNode.getNextNode() != null) {
			System.out.println(thisNode.getData().getSpecies() + " with count " + thisNode.getCount());
			thisNode = thisNode.getNextNode();
		}
		System.out.println();
	}
	public String getReport(BirdSpecies species) {
		String report = "";
		Node thisNode = this.head;
		if(thisNode == null) {
			report = "A special message that says the list is empty";
		}
		while(thisNode != null && thisNode.getNextNode() != null) {
			if(thisNode.getData().getSpecies().equals(species.getSpecies())) {				
				report = "Entered bird species " + thisNode.getData().getSpecies() + " at position: " + thisNode.getData().getIndex();
			}
			thisNode = thisNode.getNextNode();
		}
			System.out.println();
			return report;
	}
}
