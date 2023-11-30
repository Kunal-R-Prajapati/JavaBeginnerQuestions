public class question20 {
    
    public static void main(String[] args) {
        int[][] jaggedArray = {
            { 1, 2, 3 },
            { 4, 5 },
            { 6, 7, 8, 9 }
        };

        // Calculating and displaying the sum of each row
        for (int i = 0; i < jaggedArray.length; i++) {
            int sum = calculateRowSum(jaggedArray[i]);
            System.out.println("Sum of row " + (i + 1) + ": " + sum);
        }
    }

    public static int calculateRowSum(int[] row) {
        int sum = 0;
        for (int i = 0; i < row.length; i++) {
            sum += row[i];
        }
        return sum;
    }
}
