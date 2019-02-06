package ru.io.example1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class Main {

	public static void main(String... args) throws IOException {
		readWrite();
	}
	
	public static void readWrite() throws IOException {
		Reader read = new FileReader("test.txt");
		Writer write = new FileWriter("text_output.txt");
		
		int c = read.read();
		
		while(c != -1) {
			write.write(c);
			c = read.read();
		}
		read.close();
		write.close();
	}
}
