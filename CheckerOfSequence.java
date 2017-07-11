/**
 * Analyzes the sequence to decreasing.
 */
class CheckerOfSequence {

  /**
   * Accepts a sequence of String, converts it to sequence of Ints.
   * @param parts The checking sequnce.
   * @return sequence converted into Int.
   */
  public static int[] converts(String[] parts) {    	
    int sequence[] = new int[parts.length];
    try {
      for (int i = 0; i < parts.length; i++) {
        sequence[i] = Integer.parseInt(parts[i]);
      }
    } catch (NumberFormatException e) {
      System.err.println("Invalid number format.");
      System.exit(1);
    }
    return sequence;
  }

  /**
   * Checks for increase, outputs the result to the console.
   * @param sequence 
   */
   public void isdecreasing(int[] sequence) {
     for (int i = 1; i < sequence.length; i++) {
       if (sequence[i] < sequence[i-1]) {
         System.out.println("Entered sequence is non-decreasing.");
         return;
       } 
     } 
     System.out.println("Entered sequence is decreasing.");	
   }
}