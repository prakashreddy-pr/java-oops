import oops.Testdata;

import java.io.*;

public class test {
    Testdata data = new Testdata("ram", 35);

    public static void main(String[] a) {

        Testdata person = new Testdata("John Doe", 30);

        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            out.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException i) {
            i.printStackTrace();
        }

        Testdata testdata = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("person.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            testdata = (Testdata) objectInputStream.readObject();
        } catch (Exception i) {
            i.printStackTrace();
        }

        if (testdata != null) {
            System.out.println("Deserialized Person...");
            System.out.println("Name: " + testdata.getName());
            System.out.println("Age: " + testdata.getAge());
        }
    }
}

