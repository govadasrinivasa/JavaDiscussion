package com.jt.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CharacterFileReadWrite {

	public static void main(String[] args) throws IOException {
		
		characterRead();
		//bufferWriter();
	}
	
	static void characterRead() throws IOException {
		FileReader in = null;
		FileWriter out = null;
		
		try {
			in = new FileReader("Topics.txt");
			out = new FileWriter("output.txt");
			
			int c;
			while((c = in.read())!= -1) {
				out.write(c);
			}
		} catch(IOException e) {
			
		}finally {
			if(in != null)
				in.close();
			if(out != null)
				out.close();
		}
	}
	
	static void lineRead() throws IOException {
		BufferedReader inputStream = null;
		PrintWriter outputStream = null;
		BufferedWriter writer = null;
		
		try {
			inputStream = new BufferedReader(new FileReader("Topics.txt"));
			writer = new BufferedWriter(new FileWriter("output.txt"));
			
			String c;
			while((c = inputStream.readLine())!= null) {
//				outputStream.write(c);
//				outputStream.println();
				writer.write(c);
			}
		} catch(IOException e) {
			
		}finally {
			if(inputStream != null)
				inputStream.close();
			if(outputStream != null)
				outputStream.close();
		}
	}
	
	static void bufferWriter() throws IOException {
		
		BufferedReader reader = new BufferedReader(new FileReader("Topics.txt"));
	    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
	try {

           String line;
           while ((line = reader.readLine()) != null) {
               System.out.println("Reading: " + line); 
               writer.write(line);
               writer.newLine(); // Add a new line after each line read
           }
           System.out.println("File content successfully copied from Topics.txt to output.txt");

       } catch (FileNotFoundException e) {
           System.err.println("Error during file operation: " + e.getMessage());
       }catch (IOException e) {
           System.err.println("Error during file operation: " + e.getMessage());
       }
	reader.close();
	writer.close();
	}

}
