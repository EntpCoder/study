package day15.myclass;

import java.io.File;

/**
 * @author Yang Song
 * @date 2022/8/5 18:50
 */
public class FileDemo {
    public static void main(String[] args) {
        File file = new File("G:\\驰星");
        showFile(file);
    }
    public static void showFile(File file){
        if(file == null){
            return;
        }
        File[] files = file.listFiles();
        if(files != null){
            for (File f:
                    files) {
                if(f.isFile()){
                    System.out.println(f.getName());
                }else{
                    showFile(f);
                }
            }
        }
    }
}
