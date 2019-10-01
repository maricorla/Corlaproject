import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String text;
		boolean validCommand = false;
		
		do {
			System.out.print("Enter your command: ");
			text = input.nextLine();
			
			switch(text) {
			 
			 case "start":
				 System.out.println("Machine started!");
				 validCommand = true;
				 break;
			 case "stop":
				 System.out.println("Machine stopped!");
				 validCommand = true;
				 break;
			 case "pause":
				 System.out.println("Pausa!");
				 validCommand = true;
				 break;
				 
			default:
				System.out.println("Command doesn't recognized");
				validCommand = false;
			}
		} while (validCommand == true);
		
		System.out.print("Shut down system");

	}
}
