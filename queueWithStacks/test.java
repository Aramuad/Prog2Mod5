package queueWithStacks;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue list = new Queue();
		boolean stop = false;
		String answer = "";
		System.out.println("Enter a name: ");
		Person human = new Person(sc.nextLine().strip());
		list.enqueue(human);
		list.printStack();
		while(!stop) {
			System.out.println("Would you like to add someone or get the next person, or quit? (add/get/quit): ");
			answer = sc.nextLine().strip();
			if(answer.equals("add")) {
				System.out.println("Enter a name: ");
				human = new Person(sc.nextLine().strip());
				list.enqueue(human);
				list.printStack();
			} else if(answer.equals("get")) {
				list.dequeue();
				list.printStack();
			} else if(answer.contentEquals("quit")) {
				stop = true;
			}
		}
		sc.close();
	}

}
