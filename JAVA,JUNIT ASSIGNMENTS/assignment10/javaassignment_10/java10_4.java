package javaassignment_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class java10_4 {

	public static void main(String[] args) {
		try {
			String data= Files.readString(Path.of("C:\\Users\\hi\\OneDrive\\Desktop\\java\\JAVA\\Assignment 10 java11\\studentlist.txt"));
			data.replace("\n", "");
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
