package lab9;
import java.util.Scanner;
public class LinkedListTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		boolean stop = false;
		String response = "";
		while(!stop){
			System.out.println("Would you like to add, remove, or get data? (add/remove/get): ");
			response = sc.nextLine().toLowerCase().strip();
			if(response.equals("add")) {
				list.printListBefore();
				System.out.println("Enter data to add: ");
				list.add(sc.nextInt());
				sc.nextLine();
				list.printListAfter();
			} else if(response.equals("remove")) {
				list.printListBefore();
				int data = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter data to remove: ");
				if(list.remove(data) == false) {
					System.out.println("Data not in list");
				} else {
					list.printListAfter();
				}
			} else if (response.equals("get")){
				list.printListBefore();
				System.out.println("Enter index to retrieve: ");
				int data = sc.nextInt();
				sc.nextLine();
				if(list.find(data) == 0) {
					System.out.println("That data is not in the list");
				} else {
					System.out.println(list.find(data));
				}
			}
			System.out.println("Perform another action on the list? (yes/no): ");
			String again = sc.nextLine().toLowerCase().strip();
			if(again.equals("no")) {
				stop = true;
			}
		}
		System.out.println("Sum of all array list elements: " + list.sumElements());
		sc.close();
	}
}
