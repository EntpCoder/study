package day15.homework;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;

/**
 * @author Yang Song
 * @date 2022/8/5 18:05
 */
public class HomeWorkTest {
    @Test
    public void readExcel(){
        String fileName = "C:\\Users\\Mr.Song\\Desktop\\student.xlsx";
        EasyExcel.read(fileName,Student.class,new PageReadListener<Student>(dataList ->{
            for (Student s :
                    dataList) {
                System.out.println(s);
            }
        })).sheet().doRead();
    }
    @Test
    public void getAllFiles() {
        File file = new File("G:\\驰星");
        showFile(file);
    }
    @Test
    public void copyFile() {
        String sourceFile = "C:\\Users\\Mr.Song\\Pictures\\Screenshots\\屏幕截图(1).png";
        String copyPath = "C:\\Users\\Mr.Song\\Desktop";
        copy(sourceFile, copyPath);
    }
    public boolean copy(String sourcePath, String copyPath) {
        File copyFile = new File(copyPath);
        File sourceFile = new File(sourcePath);
        InputStream ips = null;
        OutputStream opt = null;
        if (!copyFile.exists()) {
            boolean mkdirs = copyFile.mkdirs();
            System.out.println("创建文件夹:" + mkdirs);
        }
        copyFile = new File(copyPath + File.separator + sourceFile.getName());
        if (!copyFile.exists()) {
            try {
                boolean isNewFile = copyFile.createNewFile();
                System.out.println("创建文件:" + isNewFile);
            } catch (IOException e) {
                System.out.println("新建文件发生异常");
                e.printStackTrace();
                return false;
            }
        }
        try {
            ips = Files.newInputStream(sourceFile.toPath());
            opt = Files.newOutputStream(copyFile.toPath());
            int read;
            while ((read = ips.read()) != -1) {
                opt.write(read);
            }
        } catch (IOException e) {
            System.out.println("写入文件发生异常");
            e.printStackTrace();
            return false;
        }finally {
            try {
                if(ips != null){
                    ips.close();
                }
                if(opt != null){
                    opt.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return true;
    }

    /**
     * 获取所有文件
     *
     * @param file 文件路径
     */
    public void showFile(File file) {
        File[] files = file.listFiles();
        if (files == null) {
            return;
        }
        for (File f :
                files) {
            if (f.isDirectory()) {
                showFile(f);
            } else {
                System.out.println(f.getName());
            }
        }
    }
}
