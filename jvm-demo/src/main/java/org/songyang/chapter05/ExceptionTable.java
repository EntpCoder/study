package org.songyang.chapter05;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * @author Yang Song
 * @date 2022/8/23 9:25
 */
public class ExceptionTable {
    public void add(){
        File f = new File("");
        try {
            Files.newInputStream(f.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
