import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		String name;
		int age;
		
		do {
			System.out.println("Entered your name 1: ");
			name = input.next();
			System.out.println("Entered your age 1: ");
			age = input.nextInt();
			System.out.println("Name 1: " + name + ",\n" + "Age 1: " + age);
			System.out.println("It's not Mari " + !name.equals("mari"));
			System.out.println("It's not 18 " + (age!=18));
		} while(!name.equals("mari") || (age!=18)); // here or name or age
		
		System.out.println("Sei fortunato");
	
		do {
			System.out.println("Entered your name 2: ");
			name = input.next();
			System.out.println("Entered your age 2: ");
			age = input.nextInt();
		} while(name.equals("tomatina") || (age<18));
		
		System.out.println("Sei fortunato, "+ name + "e libero");
		System.out.println("Hai finito");
	}
}
