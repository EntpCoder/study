package day15.io;

import java.io.File;
import java.io.IOException;

/**
 * @author Yang Song
 * @date 2022/8/5 15:35
 */
public class FileDemo {
    public static void main(String[] args) {
        File filePath = new File("C://Users//Mr.Song//Desktop//test1");
        File filePathAndName = new File("C://Users//Mr.Song//Desktop//test1//hello.txt");
        if(!filePath.isDirectory()) {
            boolean b = filePath.mkdir();
            System.out.println("创建文件夹:" + b);
        }
        if(!filePathAndName.isFile()) {
            try {
                boolean newFile = filePathAndName.createNewFile();
                System.out.println("创建文件:" + newFile);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        String name = filePathAndName.getName();
        System.out.println("文件名:" + name);
        String absolutePath = filePathAndName.getAbsolutePath();
        System.out.println("全部路径:"+absolutePath);
        String parent = filePathAndName.getParent();
        System.out.println("父路径:"+parent);
        boolean isFile = filePathAndName.isFile();
        System.out.println(filePathAndName+"是否是文件:"+isFile);
        boolean isDirectory = filePath.isDirectory();
        System.out.println(filePath+"是否是路径:"+isDirectory);
    }
}
