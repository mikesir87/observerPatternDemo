package demo.observer;

/**
 * A listener that simply doesn't care about the string that was typed because
 * Chuck Norris just doesn't care.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class WhoCares implements StringTypedListener {

	@Override
	public void stringTyped(String typedString) {
		System.out.println("Chuck Norris doesn't care");
	}
	
}
