package wc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Wc {

	public static void findResult(File f, String option)
			throws FileNotFoundException, IOException {
		Map<String, Integer> result = new HashMap<String, Integer>();
		Integer count = 0;

		if (option.equals("-l") || option.equals("")) {
			Reader reader = new Reader(f);
			count = reader.getCountLines();
			result.put("l", count);
		}

		if (option.equals("-w") || option.equals("")) {
			Reader reader = new Reader(f);
			count = reader.getCountWord();
			result.put("w", count);
		}

		if (option.equals("-c") || option.equals("")) {
			Reader reader = new Reader(f);
			count = reader.getCountChar();
			result.put("c", count);
		}

		if (!option.equals("-l") && !option.equals("-w")
				&& !option.equals("-c") && !option.equals("")) {
			System.err.println("Wrong option.Please choice from following"
					+ "option: -l, -w, -c or empty option!");
		} else {
			for (Map.Entry<String, Integer> entry : result.entrySet()) {
				System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
			}
		}

	}

	public static void main(String[] args) {

		File f;
		String option;

		if (args.length > 0) {
			f = new File(args[0]);

			if (args.length > 1) {
				option = args[1];
			} else {
				option = "";
			}

			try {
				Wc.findResult(f, option);
			} catch (FileNotFoundException e) {
				System.err.println("Not found file!");
			} catch (IOException e) {
				System.err.println("An error occurs while reading the file!");
			}
		} else {
			System.err.println("Please specify file!");
		}

	}

}
