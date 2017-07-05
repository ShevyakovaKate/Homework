

class RunCheckTraingle {
 
  public static void main (String[] args) {
    ConsolReader reader = new ConsolReader();
	TraingleCheck checker = new TraingleCheck();
	int[] intSides = checker.transferIntoInt(reader.readSides());
	if (checker.traingleExist(intSides)) {
		checker.traingleCheck(intSides);
	}
  }
}