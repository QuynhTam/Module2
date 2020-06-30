package IO;

import java.io.*;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class CoppyFileBig {
    void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            inputStream = new FileInputStream(source);
            outputStream = new FileOutputStream(dest);
            byte[] buffe = new byte[1024];
            int length;
            while ((length = inputStream.read()) != -1) {
                outputStream.write(buffe, 0, length);
            }
        } finally {
            inputStream.close();
            outputStream.close();
        }

    }

}
