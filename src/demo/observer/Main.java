package demo.observer;

/**
 * A runnable Main class that creates the ConsoleReader and registers several
 * listeners to it.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class Main {

	public static void main(String[] args) {
		ConsoleReader reader = new ConsoleReader();
		reader.addListener(new Reverser());
		reader.addListener(new Scrambler());
		reader.addListener(new StringLength());
		reader.addListener(new WhoCares());
		reader.run();
	}
		
}
