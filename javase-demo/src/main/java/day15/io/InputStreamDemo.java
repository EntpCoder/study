package day15.io;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * @author Yang Song
 * @date 2022/8/5 16:36
 */
public class InputStreamDemo {
    public static void main(String[] args) {
        File file = new File("C://Users//Mr.Song//Desktop//hello.txt");
        byte[] b = new byte[(int)file.length()];
        int read;
        InputStream fips = null;
        try {
            fips = Files.newInputStream(file.toPath());
            for(int i = 0;(read = fips.read()) != -1;i++){
                System.out.println(read);
                b[i] = (byte) read;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
