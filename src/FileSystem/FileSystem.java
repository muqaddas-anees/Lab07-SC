package FileSystem;
import java.io.File;

public class FileSystem {
    public static boolean isCaseInsensitiveMatch(String str1, String str2) {
        return str1.equalsIgnoreCase(str2);
    }
    /**
     * Returns the complete file path.
     *
     * @param directory The directory to search in.
     * @param fileName The file to be searched.
     * @return The complete filepath.
     */

    public static String findFilePath(File directory, String fileName) {
        File[] files = directory.listFiles();

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                if (file.isDirectory()) {
                    String result = findFilePath(file, fileName); // Recursively search subdirectories
                    if (result != null) {
                        return result; // Return the result if found in a subdirectory
                    }
                } else if (isCaseInsensitiveMatch(file.getName(), fileName)) {
                    return file.getAbsolutePath(); // Return the file path when found
                }
            }
        }

        return null; // Return null when the file is not found
    }

}
