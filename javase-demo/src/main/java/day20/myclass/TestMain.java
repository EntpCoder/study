package day20.myclass;

/**
 * @author Yang Song
 * @date 2022/8/12 19:17
 */
public class TestMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setHeight(10);
        Student s2 = new Student();
        s2.setHeight(20);
        int com = com(s1, s2, (o1, o2) -> o1.getHeight() - o2.getHeight());
        System.out.println(com);
    }
    public static int com(Student s1,Student s2,Comper c){
        return c.compare(s1,s2);
    }
}
