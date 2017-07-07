/**
 * Analyzes the sequence to decreasing.
 */
class CheckDecreasing {

  /**
   * Accepts a sequence, converts it to sequence of Ints, checks for increase, outputs the result to the console.
   * @param parts The checking sequnce.
   */
  public static void decreasing(String[] parts) {    	
    int sequence[] = new int[parts.length];
    try {
      for (int i = 0; i < parts.length; i++) {
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
    System.out.println("Entered sequence is decreasing.");	
  }
}