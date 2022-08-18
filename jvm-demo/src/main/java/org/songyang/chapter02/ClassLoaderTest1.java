package org.songyang.chapter02;

/**
 * @author Yang Song
 * @date 2022/8/18 15:28
 */
public class ClassLoaderTest1 {
    public static void main(String[] args) {
        // 获取系统类加载器
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        // sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(systemClassLoader);
        // 获取其上层:扩展类加载器
        ClassLoader extClassLoader = systemClassLoader.getParent();
        // sun.misc.Launcher$ExtClassLoader@4554617c
        System.out.println(extClassLoader);
        // 试图获取其上层 BootStrapClassLoader  获取不到引导类加载器
        ClassLoader bootStrapClassLoader = extClassLoader.getParent();
        // null
        System.out.println(bootStrapClassLoader);
        // 对于用户自定义类来说 默认使用系统类加载器加载
        ClassLoader classLoader = ClassLoaderTest1.class.getClassLoader();
        // sun.misc.Launcher$AppClassLoader@18b4aac2
        System.out.println(classLoader);
        // String 类是使用引导类加载器加载  --> Java核心类库由引导类加载器加载
        ClassLoader stringClassLoader = String.class.getClassLoader();
        // null
        System.out.println(stringClassLoader);
    }
}
