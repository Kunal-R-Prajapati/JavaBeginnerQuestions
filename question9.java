
// Parent class
class Parent {
    int parentValue;

    void parentMethod() {
        System.out.println("This is the parent method");
    }
}

// Child class inheriting from Parent
class Child extends Parent {
    int childValue;

    void childMethod() {
        System.out.println("This is the child method");
    }
}

public class question9 {
    public static void main(String[] args) {
        // Creating an object of the Child class
        Child childObj = new Child();

        // Accessing the inherited member from the Parent class
        childObj.parentValue = 10;
        System.out.println("Parent value: " + childObj.parentValue);
        childObj.parentMethod();

        // Accessing members specific to the Child class
        childObj.childValue = 20;
        System.out.println("Child value: " + childObj.childValue);
        childObj.childMethod();
    }
}
