import java.nio.file.*;
import java.io.IOException;

public class P1 {
    public static void main(String[] args) {
        String directoryPath = "D:\\anuksha\\Java Questions\\JavaBeginnerQuestions"; // Replace with your directory path

        try {
            Path directory = Paths.get(directoryPath);

            if (Files.exists(directory) && Files.isDirectory(directory)) {
                System.out.println("Files and directories in " + directoryPath + ":");
                listFilesAndDirectories(directory);
            } else {
                System.out.println("Specified directory does not exist or is not a directory.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void listFilesAndDirectories(Path directory) throws IOException {
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(directory)) {
            for (Path fileOrDir : stream) {
                if (Files.isDirectory(fileOrDir)) {
                    System.out.println("Directory: " + fileOrDir.getFileName());
                    listFilesAndDirectories(fileOrDir); // Recursively list files and directories within this directory
                } else {
                    System.out.println("File: " + fileOrDir.getFileName());
                }
            }
        }
    }
}
