package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String name = buffer.readLine();
		System.out.println(name);
		
		int age = Integer.parseInt(buffer.readLine());
		System.out.println(age);
	}

}
