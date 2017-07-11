/**
 * The main part of Programm. Starts the programm.
 */
public class SequenceCheck { 
  
  public static void main(String[] args) {
    ConsolReader reader =  new ConsolReader();
    CheckerOfSequence checker =  new CheckerOfSequence();
    if (args.length != 0) { 
      checker.converts(args);
      checker.isdecreasing(checker.converts(args));
    } else {
      String[] parts = reader.read();       
      checker.isdecreasing(checker.converts(parts));
    }
  }
}