import java.util.Scanner;

public class question7 {
    double bill;
    int unit;
    question7(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units : ");
        unit = sc.nextInt();
        sc.close();
    }
    public void calculateBill(){
        if (unit <100) {
            bill = 1.2 * unit;
        }
        else if (unit <200 && unit >=100) {
            bill = (1.2*100) +(( unit- 100 )*2);
        }
        else{
            bill = (1.2*100) +(100*2) +((unit -200)*3);
        }
    }
    public void Show_bill(){
        System.out.println("Number of Units Consumed = " +unit);
        System.out.println("Total bill Amount is = "+ bill);
    }
    public static void main(String[] args) {
        question7 ob = new question7();
        ob.calculateBill();
        ob.Show_bill();
    }
}
