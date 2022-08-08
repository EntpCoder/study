package day16.myclass;

/**
 * @author Yang Song
 * @date 2022/8/8 19:03
 */
public abstract class Student {
    public int id;
    public String name;
    private final int age = 11;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
