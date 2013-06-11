package demo.observer;

/**
 * The interface that defines what a object should look like if it declares to
 * support StringTypedListener objects.
 * 
 * @author Michael Irwin (mikesir87)
 *
 */
public interface StringTypedListeningSupport {

	void addListener(StringTypedListener listener);
	
	void removeListener(StringTypedListener listener);
	
}
