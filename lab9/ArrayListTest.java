package lab9;
import java.util.Scanner;
public class ArrayListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array length: ");
		int length = sc.nextInt();
		sc.nextLine();
		ArrayList al = new ArrayList(length);
		boolean stop = false;
		String response = "";
		System.out.println("Enter an element to add: ");
		al.addElement(sc.nextInt());
		sc.nextLine();
		while(!stop){
			System.out.println("Would you like to add, remove, or get an element? (add/remove/get): ");
			response = sc.nextLine().toLowerCase().strip();
			if(response.equals("add")) {
				al.printArrayBefore();
				System.out.println("Enter an element to add: ");
				al.addElement(sc.nextInt());
				sc.nextLine();
				al.printArrayAfter();
			} else if(response.equals("remove")) {
				al.printArrayBefore();
				System.out.println("Enter an index to remove: ");
				al.removeElement(sc.nextInt());
				sc.nextLine();
				al.printArrayAfter();
			} else if (response.equals("get")){
				System.out.println("Enter the index to get: ");
				System.out.println(al.getElement(sc.nextInt()));
				sc.nextLine();
			}
			System.out.println("Perform another action on the array? (yes/no): ");
			String again = sc.nextLine().toLowerCase().strip();
			if(again.equals("no")) {
				stop = true;
			}
		}
		System.out.println("Sum of all array list elements: " + al.sumElements());
		sc.close();
	}
}
