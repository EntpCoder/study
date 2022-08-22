package org.songyang.chapter05;

/**
 * @author Yang Song
 * @date 2022/8/22 19:31
 */
public class Father {
    public Father() {
        System.out.println("father的构造器");
    }

    public static void showStatic(String str) {
        System.out.println("father " + str);
    }

    public final void showFinal() {
        System.out.println("father show final");
    }

    public void showCommon() {
        System.out.println("father 普通方法");
    }
}

class Son extends Father {
    public Son() {
        //invokeSpecial
        super();
    }
    public Son(int age) {
        //invokeSpecial
        this();
    }

    /**
     * 不是重写的父类的静态方法，因为静态方法不能被重写！
     * @param str "
     */
    public static void showStatic(String str) {
        System.out.println("son " + str);
    }
    private void showPrivate(String str) {
        System.out.println("son private" + str);
    }
    public void show() {
        //invokeStatic
        showStatic("songyang.com");
        //invokeStatic
        super.showStatic("good!");
        //invokeSpecial
        showPrivate("hello!");
        //invokeSpecial
        super.showCommon();
        //invokeVirtual
        showFinal();//因为此方法声明有final，不能被子类重写，所以也认为此方法是非虚方法。
        //虚方法如下：
        // invokeVirtual  你没有显示的加super.，编译器认为你可能调用子类的showCommon(即使son子类没有重写，也		  会认为)，所以编译期间确定不下来，就是虚方法。
        showCommon();
        info();

        MethodInterface in = null;
        //invokeInterface
        in.methodA();
    }
    public void info() {

    }

    public void display(Father f) {
        f.showCommon();
    }

    public static void main(String[] args) {
        Son so = new Son();
        so.show();
    }
}
interface MethodInterface {
    void methodA();
}
