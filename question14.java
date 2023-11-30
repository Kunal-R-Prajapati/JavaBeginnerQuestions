interface Circle_Functions {
    double PI = 3.14159; // Final instance variable

    // Method to calculate circumference
    void Circumference(double radius);

    // Method to calculate area
    void Area(double radius);
}

class Circle implements Circle_Functions {
    @Override
    public void Circumference(double radius) {
       System.out.println("Circumference of Circle is : "+ (2 * PI * radius));
    }

    @Override
    public void Area(double radius) {
        System.out.println("Area of Circle is : "+ ( PI * radius * radius));
    }
}


public class question14 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.Circumference(5);
        circle.Area(5);
    }
    
}
