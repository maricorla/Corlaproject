import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String text;
		
		do {
			System.out.print("Enter your command: ");
			text = input.nextLine();
			
			switch(text) {
			 
			 case "start":
				 System.out.println("Machine started!");
				 break;
			 case "stop":
				 System.out.println("Machine stopped!");
				 break;
				 
			default:
				System.out.println("Command doesn't recognized");
			}
		} while (text.equals("start") || text.equals("stop"));
		
		System.out.print("Shut down system");

	}
}
