package com.jt.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeTest {

	public static void main(String[] args) {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employee.ser"))) {
            Employee emp = (Employee) ois.readObject();
            System.out.println("✅ Object Deserialized Successfully!");
            System.out.println(emp);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
