package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class AudioFileReader {
    public static void main(String[] args) {
        String filePath = "/Users/ucheelekwa/Desktop/JAVA/IO/Rev.mp3";  // Change this to your file path

        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            System.out.println("Reading audio file: " + filePath);

            int byteData;
            while ((byteData = bis.read()) != -1) {
                System.out.print(byteData + " ");  // Print raw byte values
            }

            System.out.println("\nFinished reading audio file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}