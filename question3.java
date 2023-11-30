import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First number : ");
        num1 = sc.nextInt();
        System.out.print("Enter the Second number : ");
        num2 = sc.nextInt();
        num3 = num1 + num2;
        System.out.println("Sum of Entered number is  : "+num3);
        sc.close();
    }
}
