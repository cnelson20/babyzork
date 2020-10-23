import java.util.Scanner;
public class babyzork {

	private static int xpos;
	private static int ypos;
	private static String[][] locationDesc = {{}};

	public static void main (String[] args) {
		System.out.println("babyZork v0.1");
		Scanner inputDevice = new Scanner(System.in);
		String[] text = new String[5];
		text[0]= "";
		//load data
		xpos = 0;
		ypos = 0;
		// start of loop
		while (!(text[0].equals("quit"))) {
			text = (takeInput(inputDevice)).split(" +",16);
			if (text.length == 0) {break;}
			//System.out.println(text[0]);
			interpretCommands(text);
		}
		//write to save data

	}

	public static String takeInput(Scanner inputDevice) {
		System.out.print(":");
		String line = inputDevice.nextLine();
		return line;
	}

	public static void interpretCommands(String[] args) {
		String action = args[0];
		String targets[] = new String[args.length - 1];
		for (int i = 1; i < args.length; i++) {
			targets[i-1] = args[i];
		}
		switch (action) {
			case "n":
			case "north":
				ypos++;
				break;
			case "e":
			case "east":
				xpos++;
				break;
			case "s":
			case "south":
				ypos--;
				break;
			case "w":
			case "west":
				xpos--;
				break;
			case "look":
			case "where":
			case "location":
			case "pos":
				System.out.println("X Pos: " + xpos + " Y Pos: " + ypos);
				//System.out.println(locationDesc[xpos][ypos]);
				break;
			case "quit":
				break;
			default:
				System.out.println("That is not a valid command.");
				break;

		}
	}
}
