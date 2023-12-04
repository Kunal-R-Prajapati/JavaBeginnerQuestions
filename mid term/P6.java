import java.io.*;

public class P6 {
    public static void main(String[] args) {
        String file2Name = "file2.txt";
        String file3Name = "file3.txt";
        String file4Name = "file4.txt";

        writeToFile(file2Name, "Content of file2.txt");
        writeToFile(file3Name, "Content of file3.txt");

        mergeFiles(file2Name, file3Name, file4Name);
        System.out.println("Files merged successfully!");
    }

    public static void writeToFile(String fileName, String content) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            writer.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }

    public static void mergeFiles(String file2Name, String file3Name, String file4Name) {
        try (BufferedReader reader1 = new BufferedReader(new FileReader(file2Name));
             BufferedReader reader2 = new BufferedReader(new FileReader(file3Name));
             PrintWriter writer = new PrintWriter(new FileWriter(file4Name))) {

            String line;
            while ((line = reader1.readLine()) != null) {
                writer.println(line);
            }

            while ((line = reader2.readLine()) != null) {
                writer.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while merging the files.");
            e.printStackTrace();
        }
    }
}
