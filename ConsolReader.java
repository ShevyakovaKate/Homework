import java.util.Scanner;

/**
 * Reads sides of the triangle from the consol.
 */
class ConsolReader { 

  /**
  * Reads the sides of the triangle from the consol.
  * Doesn't check the correctness of the entered number.
  *
  * @return Array of values of sides.
  */
  public String[] readSides() {
    final int NUMBER_OF_SIDES = 3;
    Scanner input = new Scanner(System.in);
	String[] sides = new String[NUMBER_OF_SIDES];	
	System.out.println("Please, enter the sides:");	
	for (int i = 0; i < NUMBER_OF_SIDES; i++) {
	  sides[i] = input.next();
	}
    return sides;
	}
	
}
	
