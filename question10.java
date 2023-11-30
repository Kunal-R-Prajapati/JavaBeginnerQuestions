
// Parent class
class Parent {
    void display() {
        System.out.println("This is the Parent class");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    // Method overriding - overriding the display method from the Parent class
    @Override
    void display() {
        System.out.println("This is the Child class");
    }
}

public class question10{
    public static void main(String[] args) {
        // Creating objects of both Parent and Child classes
        Parent parentObj = new Parent();
        Child childObj = new Child();

        // Calling display() method of Parent class
        parentObj.display();

        // Calling display() method of Child class
        childObj.display();
    }
}
