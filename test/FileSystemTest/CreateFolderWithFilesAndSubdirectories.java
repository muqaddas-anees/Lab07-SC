package FileSystemTest;

import java.io.File;
import java.io.IOException;

public class CreateFolderWithFilesAndSubdirectories {

    public static void main(String[] args) {
        // Specify the base directory
        String baseDirectory = "MyDirectory";

        // Create the base directory
        File baseDir = new File(baseDirectory);
        if (!baseDir.exists()) {
            baseDir.mkdir();
        }

        // Create two subdirectories
        File subDir1 = new File(baseDir, "Subdirectory1");
        File subDir2 = new File(baseDir, "Subdirectory2");

        if (!subDir1.exists()) {
            subDir1.mkdir();
        }

        if (!subDir2.exists()) {
            subDir2.mkdir();
        }

        // Create files in the base directory
        try {
            File fileInBaseDir = new File(baseDir, "FileInBaseDir.txt");
            fileInBaseDir.createNewFile();

            // Create files in the first subdirectory
            File fileInSubDir1a = new File(subDir1, "FileInSubDir1a.txt");
            fileInSubDir1a.createNewFile();

            File fileInSubDir1b = new File(subDir1, "FileInSubDir1b.txt");
            fileInSubDir1b.createNewFile();

            // Create files in the second subdirectory
            File fileInSubDir2a = new File(subDir2, "FileInSubDir2a.txt");
            fileInSubDir2a.createNewFile();

            File fileInSubDir2b = new File(subDir2, "FileInSubDir2b.txt");
            fileInSubDir2b.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Folder with files and subdirectories created successfully.");
    }
}
