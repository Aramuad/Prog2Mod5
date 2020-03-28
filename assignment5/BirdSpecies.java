//Sam Ballard

package assignment5;

public class BirdSpecies {
	private String species;
	private int index;
	
	BirdSpecies() {
	}
	BirdSpecies(String species) {
		this.species = species;
	}
	
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getIndex() {
		return index;
	}
	public void setIndex(int index) {
		this.index = index;
	}
	@Override
	public String toString() {
		return species;
	}
}
