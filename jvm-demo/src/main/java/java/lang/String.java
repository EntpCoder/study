package java.lang;

/**
 * @author Yang Song
 * @date 2022/8/18 20:02
 */
public class String {
    static {
        System.out.println("我是自定义String的static静态代码块");
    }
    public static void main(String[] args) {
        //  错误: 在类 java.lang.String 中找不到 main 方法, 请将 main 方法定义为:
        //  public static void main(String[] args)
        //  否则 JavaFX 应用程序类必须扩展javafx.application.Application
        System.out.println("my String");
    }
}
