/**
 * The main part of Programm. Starts the programm.
 */
public class SequenceCheck { 
  
  public static void main(String[] args) {
    ConsolReader reader =  new ConsolReader();
    CheckDecreasing checker =  new CheckDecreasing();
    if (args.length != 0) { 
      checker.decreasing(args);
    } else {
      String[] parts = reader.read();       
      checker.decreasing(parts);
    }
  }
}