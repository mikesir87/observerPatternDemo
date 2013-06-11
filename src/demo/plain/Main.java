package demo.plain;

/**
 * The main class for the "plain" implementation.
 * 
 * This implementation uses a ConsoleReader that instantiates each StringWorker
 * that it thinks wants to hear about its events.  What's the problem? Well, it
 * may not know ALL StringWorkers that may need to be used in all situations. By
 * it declaring its own objects, the code becomes almost impossible to reuse
 * without modification.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class Main {

	public static void main(String[] args) {
		(new ConsoleReader()).run();
	}
	
}
