package com.FileHandling;

import java.util.Scanner;
import java.io.File;

public class ReadFromFile {

	public static void main(String[] args) {
		try {
			File doc = new File("C:\\Users\\Krishna\\eclipse-workspace\\javaBasics\\src\\com\\FileHandling\\SampleText.txt");
			Scanner read = new Scanner(doc);

			while (read.hasNextLine()) {
				System.out.println(read.nextLine());
			}
			read.close();
		}
		catch(Exception E) {
			System.out.println(E);
		}
		finally {
			System.out.println("Finally Over!");
		}

	}

}
