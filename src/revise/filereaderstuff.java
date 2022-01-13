package revise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class filereaderstuff {

	public static void main(String[] args) throws IOException {
		File file = new File("mytest.txt");
		BufferedReader bufferedReader = null;
		try {
			FileReader fileReader = new FileReader(file);
			bufferedReader = new BufferedReader(fileReader);
			
			String line = bufferedReader.readLine();
		} catch(FileNotFoundException e) {
			System.out.println("file not found");
		}
		finally {
			bufferedReader.close();
		}

	}

}
