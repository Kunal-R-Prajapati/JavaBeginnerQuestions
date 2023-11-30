public class question21 {
    public static void main(String[] args) {
        int[][] jaggedArray = {
            { 1, 2, 3 },
            { 4, 5 },
            { 6, 7, 8, 9 }
        };

        int maxLength = 0;
        // Finding the maximum length of sub-arrays
        for (int[] row : jaggedArray) {
            if (row.length > maxLength) {
                maxLength = row.length;
            }
        }

        // Initializing an array to store column sums
        int[] columnSums = new int[maxLength];

        // Calculating the sum of each column
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                columnSums[j] += jaggedArray[i][j];
            }
        }

        // Displaying the sum of each column
        for (int k = 0; k < columnSums.length; k++) {
            System.out.println("Sum of column " + (k + 1) + ": " + columnSums[k]);
        }
    }
}
