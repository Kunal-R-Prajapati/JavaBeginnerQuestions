import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Elements in arr : ");
        for (int i = 0; i < 10; i++) {
            arr[i]= sc.nextInt();
        }
        int sum_of_even_elements =0;
        for (int i = 0; i < 10; i++) {
            if(arr[i] % 2 == 0){
                sum_of_even_elements += arr[i];
            }
        }
        if (sum_of_even_elements == 0) {
            System.out.println("There is no Even Element in the Array");
        } else {
            System.out.println("Sum of Even Elements is : " + sum_of_even_elements );
        }
        
        sc.close();
    }
}
