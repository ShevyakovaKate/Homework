import java.util.Scanner;

public class SequenceCheck {
  public static void main(String[] args) {
    boolean check = true;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter some sequence:");
    String input = in.nextLine();
    String parts[] = input.split(" "); 	
    int sequence[] = new int[parts.length];
    try {
        for (int i = 0; i < parts.length; i++){
            sequence[i] = Integer.parseInt(parts[i]);
	}
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format.");
        System.exit(0);
    }
    for (int i = 0; i < sequence.length; i++) {
	System.out.println(sequence[i]);
    }
    for (int i = 1; i < sequence.length; i++) {
        if (sequence[i] >= sequence[i-1]) {
            check = true;
        } else {
            System.out.println("Entered sequence is decreasing.");
            check = false;
            break;
        }
    } 
    if (check == true) {
        System.out.println("Entered sequence is non-decreasing.");
    }		
  }
}