import java.util.Scanner;

public class question8 {
    String acountNumber;
    String Name;
    double Balacnce;
    Scanner scanner = new Scanner(System.in);
    void Get_data(){
        System.out.print("Enter the Account Number : ");
        acountNumber = scanner.nextLine();
        System.out.print("Enter the Name : ");
        Name = scanner.nextLine();
        System.out.print("Enter the Balance : ");
        Balacnce = scanner.nextDouble();
        // scanner.close();
    }
    void Display(){
        System.out.println("Account Number : "+ acountNumber );
        System.out.println("Name  : "+Name);
        System.out.println("Balance : "+ Balacnce);
    }
    void Withdraw(){
        System.out.print("Enter the Amount to withdraw : ");
        double amt = scanner.nextDouble();
        if (amt > Balacnce) {
            System.out.println("Insufficient Balance!");
            return;
        }
        Balacnce = Balacnce - amt;
        System.out.println("Amount Withdraw Successfully :)");
        System.out.println("Remaining Balance : "+Balacnce);
        
    }
    void Deposit(){
        System.out.println("Enter the Amount to deposit : ");
        double amt = scanner.nextDouble();
        Balacnce = Balacnce + amt;
        System.out.println("Amount Deposited :)");
        System.out.println("Remaining Balance : "+Balacnce);
    }
    public static void main(String[] args) {
        question8 cust1 = new question8();
        cust1.Get_data();
        cust1.Deposit();
        cust1.Display();
        cust1.Withdraw();
    }
}
