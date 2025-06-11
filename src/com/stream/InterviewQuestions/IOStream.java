package com.stream.InterviewQuestions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class IOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "C://JAVA8//Test//IOStreams.txt/"; // Replace with your file path
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        //using java 8
        try
        {
        	Stream<String>value=Files.lines(Paths.get(fileName));
        	value.forEach(line -> System.out.println(line));
        }
        catch(Exception e)
        {
        	e.printStackTrace();
        }
	}

}
