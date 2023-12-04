import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class P5 {
    public static void main(String[] args) {
        String fileName = "file1.txt";

        // Read content from file1.txt and check if it's a palindrome
        int content = readFromFile(fileName);
        if (isPalindrome(content)) {
            System.out.println("The number " + content + " is a palindrome.");
        } else {
            System.out.println("The number " + content + " is not a palindrome.");
        }
    }

    // Read content from file
    public static int readFromFile(String fileName) {
        int content = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null) {
                content = Integer.parseInt(line.trim());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
        return content;
    }

    // Check if a number is palindrome
    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }
}

