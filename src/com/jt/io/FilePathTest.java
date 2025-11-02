package com.jt.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FilePathTest {

	public static void main(String[] args) throws IOException {
		createFileNDirectory();
	}
	
	static void getPaths() {
		// Absolute path
        Path path = Paths.get("C:", "Users", "sgovada","softwares", "docs", "AI.txt");

        System.out.println("File Name: " + path.getFileName());
        System.out.println("Parent Directory: " + path.getParent());
        System.out.println("Root: " + path.getRoot());
        System.out.println("Number of elements: " + path.getNameCount());
        System.out.println("Subpath (from index 1 to 3): " + path.subpath(1, 3));
	}
	
	static void createFileNDirectory() {
		Path filePath = Paths.get("../Java21/myfile.txt");

        try {
            // Create a new file
            Files.createDirectories(filePath.getParent()); // Ensure parent directories exist
            Files.createFile(filePath);
            System.out.println("File created: " + filePath);

            // Write to the file
            Files.writeString(filePath, "Hello, Java 21!", StandardOpenOption.APPEND);
            System.out.println("Content written to file.");

            // Read from the file
            String content = Files.readString(filePath);
            System.out.println("Content read from file: " + content);

            // Delete the file
//            Files.delete(filePath);
//            System.out.println("File deleted: " + filePath);

        } catch (IOException e) {
            System.err.println("An I/O error occurred: " + e.getMessage());
        }
	}
	
	static void readfilefromRelativeDirectory() throws IOException {
		Path filePath = Paths.get("../Java21/myfile.txt");
		System.out.println(Files.readString(filePath));
	}

}
