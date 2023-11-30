abstract class Shape {
    // Abstract method to draw upward triangle
    public abstract void drawTriangle(int n);

    // Abstract method to draw downward triangle
    public abstract void drawInvertedTriangle(int n);
}
class DrawShape extends Shape {

    @Override
    public void drawTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    @Override
    public void drawInvertedTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/**
 * question13
 */
public class question13 {

    public static void main(String[] args) {
        DrawShape dr = new DrawShape();
        dr.drawTriangle(5);
        System.out.println("");
        dr.drawInvertedTriangle(5);
    }
}