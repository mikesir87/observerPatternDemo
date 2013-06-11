package demo.observer;

/**
 * The listener interface that defines the callback to be used when text has
 * been typed by the user.
 * 
 * @author Michael Irwin (mikesir87)
 */
public interface StringTypedListener {

	void stringTyped(String typedString);
	
}
