/**
 * Check the traingle.
 */

class TraingleCheck {
  /**
   * Tranfers the size of sides array of String to array of int.
   * Checks the сorrectness of input array.
   *
   * @param sides array of String.
   * @return true if the array is correct and transfed to int, false is not.
   * @throws NumberFormatException if the sides is not int.
   */
  public int[] transferIntoInt(String[] sides) throws NumberFormatException {
    int[] intSides = new int[sides.length];
    try {
      for (int i = 0; i < sides.length; i++) {
        intSides[i] = Integer.parseInt(sides[i]);
    }
    } catch (NumberFormatException e) {
      System.err.println("Invalid number format.");
    }    
    return intSides;
  }
  
  /**
   * Check, whether the sides amout is equally to three,
   * the size of sides is positive, 
   * the traingle can be exist.
   *
   * @param intSides sides array of int.
   * @throws IllegalArgumentException if the sides is negative.
   */
  public boolean traingleExist(int[] intSides) throws IllegalArgumentException {
    if (intSides.length > 3) {
      System.out.println("Wrong sides amount of the triangle.");
	  return false;
    } 
	for (int i = 0; i < intSides.length; i++) {
      if (intSides[i] <= 0) {
	    throw new IllegalArgumentException("The size of side can not be negative.");
	  }
    }
    int sideA = intSides[0];
	int sideB = intSides[1];
	int sideC = intSides[2];
	if (sideA < sideB + sideC && sideB < sideA + sideC && sideC < sideA + sideB) { 
	  return true;
	} else {
	  System.out.println("The tringle with such sides can not be exist.");
	  return false;
	}
  }
  /**
   * Check, whether the traingle is equilateral or isosceles.
   * @param intSides sides array of int.
   */  
  public void traingleCheck(int[] intSides) {
    int sideA = intSides[0];
	int sideB = intSides[1];
	int sideC = intSides[2];
	if (sideA == sideB && sideA == sideC) {
	  System.out.println("The triangle is equilateral.");
	} else if (sideA == sideB || sideB == sideC || sideC == sideA){
	    System.out.println("The triangle is isosceles.");
		} else {
		  System.out.println("The traingle is usual.");
		}
  }	 
  
}
	
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  