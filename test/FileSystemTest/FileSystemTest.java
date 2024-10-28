package FileSystemTest;
import org.junit.Before;
import org.junit.Test;

import FileSystem.FileSystem;

import static org.junit.Assert.assertEquals;

import java.io.File;

public class FileSystemTest {
    private File rootDirectory;
    private String fileName1;
    private String fileName2;
    private String fileName3;

    @Before
    public void setup() {
        // Create the folder with files and subdirectories for testing
        CreateFolderWithFilesAndSubdirectories.main(new String[0]);

        // Initialize the variables used in the tests
        rootDirectory = new File("MyDirectory");
        fileName1 = "FileInBaseDir.txt";
        fileName2 = "FileInSubDir1a.txt";
        fileName3 = "NonExistentFile.txt";
    }

    @Test
    public void testFindFilePathWhenFileExistsInRootDirectory() {
        String filePath = FileSystem.findFilePath(rootDirectory, fileName1);
        // Assert
        assertEquals(new File(rootDirectory, fileName1).getAbsolutePath(), filePath);
    }

    @Test
    public void testFindFilePathWhenFileExistsInSubDirectory() {
        String filePath = FileSystem.findFilePath(rootDirectory, fileName2);
        // Assert
        assertEquals(new File(rootDirectory, "Subdirectory1/" + fileName2).getAbsolutePath(), filePath);
    }

    @Test
    public void testFindFilePathWhenFileDoesnotExist() {
        String filePath = FileSystem.findFilePath(rootDirectory, fileName3);
        // Assert
        assertEquals(null, filePath);
    }

}

