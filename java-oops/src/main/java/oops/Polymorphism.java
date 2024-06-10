package oops;

/*Polymorphism allows methods to do different things based on the object it is acting upon.
 It can be achieved through method overriding (inherited methods)
 and method overloading (same method name with different parameters)
 */
public class Polymorphism {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public static class Cat extends Polymorphism {
        @Override
        public void makeSound() {
            System.out.println("Meow");
        }
    }

    public static void main(String[] a) {
        Polymorphism myAnimal = new Cat();
        myAnimal.makeSound(); // Output: Meow
    }
}
