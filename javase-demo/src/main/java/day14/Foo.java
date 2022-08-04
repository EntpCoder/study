package day14;

/**
 * @author Yang Song
 * @date 2022/8/4 9:37
 */
public class Foo {
    private String code;
    private String name;

    public Foo(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
