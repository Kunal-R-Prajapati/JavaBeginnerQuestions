import java.util.Scanner;
public class question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num1 = sc.nextInt();
        long fact =1;
        for (int i = 2; i <= num1; i++) {
            fact = fact*i;
        }
        System.out.println("Factorial of "+num1 + " is "+fact);
        sc.close();
    }
}
