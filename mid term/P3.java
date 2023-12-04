import java.io.File;

public class P3 {
    public static void main(String[] args) {
        String directoryPath = "D:\\anuksha\\Java Questions"; // Replace with your directory path

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            System.out.println("Subdirectories in " + directoryPath + ":");
            listSubDirectories(directory);
        } else {
            System.out.println("Specified directory does not exist or is not a directory.");
        }
    }

    public static void listSubDirectories(File directory) {
        File[] subDirectories = directory.listFiles(File::isDirectory);

        if (subDirectories != null) {
            for (File subDirectory : subDirectories) {
                System.out.println(subDirectory.getName());
            }
        }
    }
}
