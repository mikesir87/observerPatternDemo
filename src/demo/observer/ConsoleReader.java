package demo.observer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * A ConsoleReader that now implements the StringTypedListeningSupport, which
 * allows others to register and remove listeners at any point.  This object no
 * longer needs to construct its own listeners, is no longer coupled to any 
 * other object, and is flexible in its usage.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class ConsoleReader implements StringTypedListeningSupport {
	
	private BufferedReader reader;
	private Set<StringTypedListener> listeners = 
			new HashSet<StringTypedListener>();

	public void run() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		
		String input;
		while (true) {
			input = readLine();
			if (input.equals("exit"))
				System.exit(0);

			 /*
			  * We use getListeners() to clone the set of listeners to allow
			  * any listener to make modifications to the registered listeners 
			  * without getting ConcurrentModificationExceptions.
			  */ 
			 for (StringTypedListener listener : getListeners()) {
				listener.stringTyped(input);
			}
		}
	}
	
	private Set<StringTypedListener> getListeners() {
		Set<StringTypedListener> copy = new HashSet<StringTypedListener>();
		copy.addAll(listeners);
		return copy;
	}
	
	@Override
	public void addListener(StringTypedListener listener) {
		listeners.add(listener);
	}
	
	@Override
	public void removeListener(StringTypedListener listener) {
		listeners.remove(listener);
	}

	private String readLine() {
		try {
			System.out.print(">> ");
			return reader.readLine();
		} catch (IOException e) {
			return "exit";
		}
	}
	
}
