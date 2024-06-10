package oops;

import java.io.Serial;
import java.io.Serializable;

public class Testdata implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Testdata(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}
