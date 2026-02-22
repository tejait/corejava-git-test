package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWrite {

	public static void main(String[] args) throws IOException {
		File file=new File("C:\\Users\\chint\\Downloads\\files\\test.txt");// path- file location
		FileWriter writer=new FileWriter(file);
		BufferedWriter bw=new BufferedWriter(writer);
				   bw.write("Your Java Stop!");
				   bw.newLine();
				   bw.write(" SR nagar");
				   bw.close();
		           writer.close();
		           
	}
}
