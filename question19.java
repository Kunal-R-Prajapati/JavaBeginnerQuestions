import java.util.Scanner;

class MinAmountException extends Exception {

    public MinAmountException(String message) {
        super(message);
    }
}
class MaxAmountException extends Exception {

    public MaxAmountException(String message) {
        super(message);
    }
}

public class question19 {

    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int amount = sc.nextInt();
        if (amount < 500) {
            throw new MinAmountException("The amount must be less than 500");
        }
        else if (amount > 10000) {
            throw new MaxAmountException("The amount must be greater than 500");
        }
        else{

            System.out.println("Collect Your Money");
        }

    }
}