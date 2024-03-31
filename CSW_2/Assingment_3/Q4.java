import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class FileNotFoundExceptionCustom extends Exception {
    public FileNotFoundExceptionCustom(String message) {
        super(message);
    }
}

class FileReadPermissionException extends Exception {
    public FileReadPermissionException(String message) {
        super(message);
    }
}

public class Q4 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the file path.");
            return;
        }

        String filePath = args[0];

        try {
            readAndDisplayFileContents(filePath);
        } catch (FileNotFoundExceptionCustom e) {
            System.err.println("Custom FileNotFoundException: " + e.getMessage());
        } catch (FileReadPermissionException e) {
            System.err.println("Custom FileReadPermissionException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException occurred: " + e.getMessage());
        }
    }

    private static void readAndDisplayFileContents(String filePath)
            throws FileNotFoundExceptionCustom, FileReadPermissionException, IOException {
        File file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundExceptionCustom("File not found: " + filePath);
        }

        if (!file.canRead()) {
            throw new FileReadPermissionException("Permission denied to read file: " + filePath);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            System.out.println("Contents of the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
    }
}
