package demo.observer;

/**
 * A listener that reverses the typed string and prints it to System.out
 * 
 * @author Michael Irwin (mikesir87)
 */
public class Reverser implements StringTypedListener {

	@Override
	public void stringTyped(String typedString) {
		StringBuilder sb = new StringBuilder();
		for (int i = typedString.length() - 1; i >= 0; --i)
			sb.append(typedString.charAt(i));
		System.out.println(sb.toString());
	}
	
}
