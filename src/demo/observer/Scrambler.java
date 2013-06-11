package demo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * A listener that scrambles the typed text and prints it to System.out
 * 
 * @author Michael Irwin (mikesir87)
 */
public class Scrambler implements StringTypedListener {

	@Override
	public void stringTyped(String typedString) {
        List<Character> characters = new ArrayList<Character>();
        for(char c : typedString.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(typedString.length());
        while (characters.size() != 0){
            int randPicker = (int)(Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }
}
