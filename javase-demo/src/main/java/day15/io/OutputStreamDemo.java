package day15.io;

import java.io.*;
import java.nio.file.Files;

/**
 * @author Yang Song
 * @date 2022/8/5 16:24
 */
public class OutputStreamDemo {
    public static void main(String[] args) {
        //写数据到C://Users//Mr.Song//Desktop//test1//hello.txt
        File filePathAndName = new File("C://Users//Mr.Song//Desktop//test1//hello.txt");
        String text = "你好 IO流！！！";
        OutputStream fops = null;
        if(!filePathAndName.isFile()) {
            try {
                boolean newFile = filePathAndName.createNewFile();
                System.out.println("创建文件:" + newFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            fops = Files.newOutputStream(filePathAndName.toPath());
            fops.write(text.getBytes());
            System.out.println("写入成功");
        } catch (IOException e) {
            System.out.println("写入失败");
            e.printStackTrace();
        } finally {
            try {
                if (fops != null) {
                    fops.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
