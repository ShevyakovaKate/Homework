import java.util.Scanner;

public class SequenceCheck {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter some sequence:");
    String input = scanner.nextLine();
    String parts[] = input.split(" "); 	
    int sequence[] = new int[parts.length];
    try {
        for (int i = 0; i < parts.length; i++){
            sequence[i] = Integer.parseInt(parts[i]);
	}
    } catch (NumberFormatException e) {
        System.err.println("Invalid number format.");
        return;
    }
    for (int i = 1; i < sequence.length; i++) {
        if (sequence[i] < sequence[i-1]) {
            System.out.println("Entered sequence is non-decreasing.");
        return;
        } 
    } 
    System.out.println("Entered sequence is non-decreasing.");	
  }
}