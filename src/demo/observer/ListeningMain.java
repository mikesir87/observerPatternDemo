package demo.observer;

/**
 * A runnable Main that creates the ConsoleReader, but also registers itself as
 * a listener.  When the user types "toggle", the Scrambler listener is toggled
 * from being a listener in the ConsoleReader.  This exercises how flexible the
 * class now is and how outside objects can affect who gets notified of string
 * read events.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class ListeningMain implements StringTypedListener {

	private Scrambler scrambler;
	private ConsoleReader reader;
	
	public static void main(String[] args) {
		new ListeningMain();
	}
	
	public ListeningMain() {
		scrambler = new Scrambler();
		
		reader = new ConsoleReader();
		reader.addListener(new Reverser());
		reader.addListener(scrambler);
		reader.addListener(new StringLength());
		reader.addListener(new WhoCares());
		reader.addListener(this);
		reader.run();
	}
	
	@Override
	public void stringTyped(String typedString) {
		if (!typedString.equals("toggle")) {  // Don't care if it's not toggle
			return;
		}
		if (scrambler != null) {
			reader.removeListener(scrambler);
			scrambler = null;
		}
		else {
			scrambler = new Scrambler();
			reader.addListener(scrambler);
		}
	}
	
}
