package training.controlstructures;

public class IfConstruct {

	public static void main(String[] args) {
		
		String RED = "red";
		String GREEN = "green";
		String AMBER = "amber";
		String signalColor = RED;
		
		if(signalColor.equals(RED)) {
			System.out.println("STOP");
		}
		else if (signalColor.equals(GREEN)) {
			System.out.println("GO");
		}
		else if (signalColor.equals(AMBER)) {
			System.out.println("Prepare to Stop");
		}
		else {
			System.out.println("Invalid command");
		}
		

	}

}
