package demo.plain;

/**
 * An implementation of the StringWorker that simply outputs the length of
 * the typed string
 * 
 * @author Michael Irwin (mikesir87)
 */
public class StringLength implements StringWorker {

	public void workOnData(String data) {
        System.out.println("Length of " + data.length());
    }
	
}
