package queueWithStacks;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack stac = new Stack();
		System.out.println("Enter a name: ");
		Person human = new Person(sc.nextLine().strip());
		stac.push(human);
		String answer = "";
		boolean stop = false;
		while(!stop) {
			System.out.println("Would you like to add someone, get the next person, or quit? (add/get/quit): ");
			answer = sc.nextLine().strip();
			if(answer.equals("add")) {
				System.out.println("Enter a name: ");
				human = new Person(sc.nextLine().strip());
				stac.push(human);
				stac.printStack();
			} else if(answer.equals("get")) {
				stac.pop();
				stac.printStack();
			} else if(answer.contentEquals("quit")) {
				stop = true;
			}
		}
		sc.close();
	}

}
