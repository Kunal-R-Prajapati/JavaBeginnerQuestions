import java.util.Scanner;

public class question17 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter the Elements in arr : ");
        for (int i = 0; i < 10; i++) {
            arr[i]= sc.nextInt();
        }
        int index =-1;
        System.out.print("Enter the number to search in array : ");
        int k = sc.nextInt();
        for (int i = 0; i < 10; i++) {
            if(arr[i]  == k){
                index = i;;
            }
        }
        if (index != -1) {
            System.out.println("Element is Found at index : "+ index);
        } else {
            System.out.println("The Element is not found."  );
        }
        
        sc.close();
    }
}
