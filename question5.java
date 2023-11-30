import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str = sc.nextLine();
        int count =0;
        for (char c : str.toCharArray()) {
            count++;
        }
        System.out.print("Length of string is : "+count);
        sc.close();
    }
}
