package lab9;

public class ArrayList {
	private int[]arrayList, temp;
	
	ArrayList() {
		arrayList = new int[1];
	}
	ArrayList(int arrayLength) {
		arrayList = new int[arrayLength];
	}
	
	public void addElement(int element) {
		for(int i = 0; i < arrayList.length; i++) {
			if(arrayList[i] == 0) {
				arrayList[i] = element;
				return;
			} 
		}
		temp = new int[arrayList.length];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = arrayList[i];
		}
		arrayList = new int[temp.length+1];
		for(int i = 0; i < arrayList.length-1; i++) {
			arrayList[i] = temp[i];
			arrayList[arrayList.length-1] = element;
		}
	}
	public void removeElement(int index) {
		if(index < arrayList.length) {
				arrayList[index] = 0;
		}
		if(arrayList.length-1 > 0) {
			temp = new int[arrayList.length];
			for(int i = 0; i < temp.length; i++) {
				if(arrayList[i] != 0) {
					temp[i-1] = arrayList[i];
				}
			}
			arrayList = new int[temp.length-1];
			for(int i = 0; i < arrayList.length; i++) {
				arrayList[i] = temp[i];
			}
		} else {
			return;
		}
	}
	public int getElement(int index) {
		return arrayList[index];
	}
	public void printArrayBefore() {
		System.out.print("Contents of array before specified action taken: ");
		for(int i = 0; i < arrayList.length; i++) {
			System.out.print(arrayList[i] + ", ");
		}
		System.out.println();
	}
	public void printArrayAfter() {
		System.out.print("Contents of array after specified action taken: ");
		for(int i = 0; i < arrayList.length; i++) {
			System.out.print(arrayList[i] + ", ");
		}
		System.out.println();
	}
	public int sumElements() {
		int sum = 0;
		for(int i = 0; i < arrayList.length; i++) {
			sum = sum + arrayList[i];
		}
		return sum;
	}
}
