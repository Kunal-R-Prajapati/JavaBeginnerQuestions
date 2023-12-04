import java.io.File;

public class P2 {
    public static void main(String[] args) {
        String directoryPath = "D:\\anuksha\\Java Questions\\JavaBeginnerQuestions"; // Replace with your directory path

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Files in " + directoryPath + ":");
            listFiles(directory);
        } else {
            System.out.println("Specified directory does not exist or is not a directory.");
        }
    }

    public static void listFiles(File directory) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println(file.getName());
                }
            }
        }
    }
}
