import java.util.Scanner;
public class babyzork {
	public static void main (String[] args) {
		System.out.println("babyZork v0.1");
		Scanner inputDevice = new Scanner(System.in);
		String[] text = new String[5]; 
		text[0]= "";
		while (!(text[0].equals("quit"))) {
			text = (takeInput(inputDevice)).split(" +",5);
			if (text.length == 0) {break;}
			System.out.println(text[0]);
		}
		
	}
	public static String takeInput(Scanner inputDevice) {
		System.out.print(":");
		String line = inputDevice.nextLine();
		return line;
	}
	public static void intepretCommands(String[] args) {
		String verb = args[0];
		String target = args[1];		
	
	}
}	
