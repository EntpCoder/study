package org.songyang.chapter02;

import sun.misc.Launcher;
import sun.security.ec.CurveDB;

import java.net.URL;
import java.security.Provider;
import java.util.Properties;

/**
 * @author Yang Song
 * @date 2022/8/18 15:47
 */
public class ClassLoaderTest2 {
    public static void main(String[] args) {
        System.out.println("**************启动类加载器****************");
        // 获取BootStrapClassLoader能够加载的api路径
        URL[] urLs = Launcher.getBootstrapClassPath().getURLs();
        for (URL u :
                urLs) {
            System.out.println(u.toExternalForm());
        }
        // Provider 为jsse.jar下的类 由bootStrapClassLoader加载 所以获取不到classLoader
        ClassLoader providerClassLoader = Provider.class.getClassLoader();
        System.out.println(providerClassLoader);
        System.out.println("**************扩展类加载器****************");
        String property = System.getProperty("java.ext.dirs");
        // C:\Program Files\Java\jdk1.8.0_77\jre\lib\ext
        // C:\WINDOWS\Sun\Java\lib\ext
        for (String p :
                property.split(";")) {
            System.out.println(p);
        }
        // 从上面路径随便选一个类 来看看他的类加载器是什么
        ClassLoader curveDBClassLoader = CurveDB.class.getClassLoader();
        System.out.println(curveDBClassLoader);

    }
}
