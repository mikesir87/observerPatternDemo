package demo.plain;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * An object that when running, reads a line of text from the console and passes
 * it off to its own configured list of StringWorker objects.
 * 
 * This class is obviously very coupled to the implementations of StringWorker
 * and doesn't allow any outside modification of what workers are used, the
 * toggling of them, or anything.
 * 
 * @author Michael Irwin (mikesir87)
 */
public class ConsoleReader {
	
	private BufferedReader reader;

	public void run() {
		reader = new BufferedReader(new InputStreamReader(System.in));
		List<StringWorker> workers = new ArrayList<StringWorker>();
		workers.add(new Scrambler());
		workers.add(new StringLength());
		workers.add(new Reverser());

		String input;
		while (true) {
			input = readLine();
			if (input.equals("exit"))
				System.exit(0);

			for (StringWorker worker : workers) {
				worker.workOnData(input);
			}
		}
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
