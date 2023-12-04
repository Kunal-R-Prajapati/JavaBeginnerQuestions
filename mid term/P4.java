import java.io.*;
import java.util.Scanner;

public class P4 {
    public static void main(String[] args) {
        String fileName = "file1.txt";

        // Create file named file1.txt
        createFile(fileName);

        // Ask user to enter a three-digit number
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit number: ");
        int number = scanner.nextInt();
        scanner.close();

        // Write the number to file1.txt
        writeToFile(fileName, number);

        // Read the content from file1.txt and check if it's a palindrome
        int content = readFromFile(fileName);
        if (isPalindrome(content)) {
            System.out.println("The number " + content + " is a palindrome.");
        } else {
            System.out.println("The number " + content + " is not a palindrome.");
        }
    }

    // Create file
    public static void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + fileName);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    // Write number to file
    public static void writeToFile(String fileName, int number) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(number);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    // Read content from file
    public static int readFromFile(String fileName) {
        int content = 0;
        try (Scanner scanner = new Scanner(new File(fileName))) {
            if (scanner.hasNextInt()) {
                content = scanner.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
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

