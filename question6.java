import java.io.*;

class question6 {
    void Rectangle (int a, int b) {
        System.out.println ("\nArea of rectangle with breadth "+a+" and length " +b+ " is : " + a*b);
    }
    void Circle (int a) {
        System.out.println ("\nArea of circle with radius " +a+ " is : " + 3.14 * a);
    }
    void Triangle (int a, int b, int c) {
        double temp = (a + b + c);
        double s= temp/2;
        double triarea = Math.sqrt (s* (s-a)* (s-b)* (s-c));
        System.out.println ("\nArea of triangle with length of sides "+a+","+b+" and " +c+" is : "+ triarea);
    }
    public static void main (String p []) throws IOException {
        question6 d = new question6();
        BufferedReader Br = new BufferedReader (new InputStreamReader (System.in));
        System.out.print ("\nFind area of \n1. Rectangle \n2. Triangle \n3. Circle \n\nSelect a choice : ");
        int choice =Integer.parseInt (Br.readLine ());
        switch (choice) {
            case 1:
                System.out.print ("\nEnter the breadth : ");
                int a =Integer.parseInt (Br.readLine ());
                System.out.print ("\nEnter the length : ");
                int b=Integer.parseInt (Br.readLine ());
                d.Rectangle(a, b);
                break;
            case 2:
                System.out.print ("\nEnter the length of first side : ");
                int x =Integer.parseInt (Br.readLine ());
                System.out.print ("\nEnter the length of second side : ");
                int y=Integer.parseInt (Br.readLine ());
                System.out.print ("\nEnter the length of third side : ");
                int z =Integer.parseInt (Br.readLine ());
                d.Triangle(x,y,z);
                break;
            case 3:
                System.out.print ("\nEnter the radius : ");
                int r =Integer.parseInt (Br.readLine ());
                d.Circle(r);
                break;
            default:
                System.out.println ("Invalid choice");
        }
    }
}