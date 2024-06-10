package oops;

public abstract class Abstraction {
    public abstract void draw();

    public static class Circle extends Abstraction {
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    public static void main(String[] a) {
        Abstraction myShape = new Circle();
        myShape.draw();
    }
}

