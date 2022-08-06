package day15.homework;


import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.junit.Test;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

/**
 * @author Yang Song
 * @date 2022/8/5 18:05
 */
public class HomeWorkTest {
    @Test
    public void getAllFiles() {
        File file = new File("G:\\驰星");
        showFile(file);
    }
    @Test
    public void copyFile() {
        String sourceFile = "G:\\驰星\\before\\项目与答辩要求.md";
        String copyPath = "C:\\Users\\Mr.Song\\Desktop\\test2\\test1";
        System.out.println("copy:" + copyFile(sourceFile, copyPath));
    }
    @Test
    public void readExcel() {
        String fileName = "G:\\驰星\\课堂笔记\\3.JavaSE\\Java_day15_Map_IO\\作业\\student.xlsx";
        List<Student> list = new ArrayList<>();
        EasyExcel.read(fileName, Student.class, new PageReadListener<Student>(list::addAll)).sheet().doRead();
        list.forEach(System.out::println);
    }
    @Test
    public void calcCharNum() {
        String path = "G:\\驰星\\课堂笔记\\3.JavaSE\\Java_day15_Map_IO\\作业\\calcCharNum.txt";
        calcCharNum(path);
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

    /**
     * 复制文件
     * @param sourcePath 源地址
     * @param copyPath 目标地址
     * @return 是否成功
     */
    public boolean copyFile(String sourcePath, String copyPath) {
        // 目标路径
        File copyFile = new File(copyPath);
        // 源文件
        File sourceFile = new File(sourcePath);
        InputStream ips = null;
        OutputStream opt = null;
        // 如果目标路径不存在 就创建路径
        if (!copyFile.exists()) {
            boolean mkdirs = copyFile.mkdirs();
            System.out.println("创建文件夹:" + mkdirs);
        }
        // 将目标路径变更为目标文件 如果目标文件不存在就先创建文件
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
        // 复制文件信息
        try {
            ips = Files.newInputStream(sourceFile.toPath());
            opt = Files.newOutputStream(copyFile.toPath());
            byte[] buffer = new byte[1024];
            int len;
            while ((len = ips.read(buffer)) != -1) {
                opt.write(buffer, 0, len);
            }
            return true;
        } catch (IOException e) {
            System.out.println("写入文件发生异常");
            e.printStackTrace();
        } finally {
            try {
                if (ips != null) {
                    ips.close();
                }
                if (opt != null) {
                    opt.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return false;
    }

    /**
     * 统计txt 文件各个字出现的字数
     * @param sourcePath 文件地址
     */
    public void calcCharNum(String sourcePath) {
        File file = new File(sourcePath);
        if (!file.isFile()) {
            System.out.println("文件不存在");
            return;
        }
        InputStream ips = null;
        ByteArrayOutputStream bos = null;
        // 缓存
        byte[] buffer = new byte[1024];
        int len;
        // 读取的字符串信息
        String resultString;
        try {
            ips = Files.newInputStream(file.toPath());
            bos = new ByteArrayOutputStream();
            // 写入到输出流中
            while ((len = ips.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }
            // 将输出流转成字符串
            resultString = bos.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (ips != null) {
                    ips.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        // 字母与个数的映射
        Map<Character, Integer> map = new HashMap<>(128);
        for (int i = 0; i < resultString.length(); i++) {
            char c = resultString.charAt(i);
            if (Character.isLetter(c)) {
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + 1);
                } else {
                    map.put(c, 1);
                }
            }
        }
        // 输出字母与个数
        map.forEach((key, value) -> System.out.print(key + "(" + value + ") "));
    }
}
