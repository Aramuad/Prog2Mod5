//Sam Ballard

package assignment5;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
		BirdSpecies bird;
		boolean stop = false;
		String answer = "";
		while(!stop) {
			System.out.print("Enter a bird species: ");
			System.out.println();
			bird = new BirdSpecies(sc.nextLine().toLowerCase().strip());
			list.addBird(bird);
			System.out.println(list.getReport(bird));
			System.out.print("Are you done entering birds? (yes/no): ");
			answer = sc.nextLine().toLowerCase().strip();
			if(answer.equals("yes")) {
				stop = true;
			}
		}
		list.getCount();
		sc.close();
	}

}
