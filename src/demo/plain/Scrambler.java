package demo.plain;

import java.util.ArrayList;
import java.util.List;

/**
 * An implementation of the StringWorker that scrambles up the letters of the
 * typed word and prints them out.
 * 
 * @author Michael Irwin
 */
public class Scrambler implements StringWorker {

	public void workOnData(String data) {
        List<Character> characters = new ArrayList<Character>();
        for(char c : data.toCharArray()){
            characters.add(c);
        }
        StringBuilder output = new StringBuilder(data.length());
        while (characters.size() != 0){
            int randPicker = (int)(Math.random() * characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }
}
