package IO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BufferedDemo {
    public static void main(String[] args) throws Exception {
        FileInputStream fs = new FileInputStream("/Users/ucheelekwa/Desktop/JAVA/IO/utch.txt");
        BufferedInputStream bs = new BufferedInputStream(fs);

        while(bs.read() != -1)
        {
            System.out.println((char)(bs.read()));
        }
    }
}
