import java.util.Scanner;

 /**
   * Reads the sequence from consol.
   */
class ConsolReader {

  /**
   * Reads the sequence from consol.
   * @return parts. Array of numbers.
   */
  public String[] read() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter some sequence:");
    String input = scanner.nextLine();
    String parts[] = input.split(" ");
    return parts;	
  }
}