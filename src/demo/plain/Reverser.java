package demo.plain;

/**
 * An implementation of the StringWorker that reverses the string, then outputs
 * it.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class Reverser implements StringWorker {

	public void workOnData(String data) {
		StringBuilder sb = new StringBuilder();
		for (int i = data.length() - 1; i >= 0; --i)
			sb.append(data.charAt(i));
		System.out.println(sb.toString());
	}
	
}
