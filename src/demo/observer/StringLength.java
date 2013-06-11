package demo.observer;

/**
 * A listener that outputs the string length to System.out
 * 
 * @author Michael Irwin (mikesir87)
 */
public class StringLength implements StringTypedListener {

	@Override
	public void stringTyped(String typedString) {
		System.out.println("Length of " + typedString.length());
    }
	
}
