package day09.inclass;

/**
 * @author Yang Song
 * @date 2022/7/28 20:05
 */
public class 匿名内部类写法 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "宋洋";
        s1.high = 160;
        s1.age = 22;
        Student s2 = new Student();
        s2.name = "李洋";
        s2.high = 120;
        s2.age = 23;
        Student big = (Student) MyUtil.compareTest(s1, s2, new MyCompare() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof Student && o2 instanceof Student){
                    Student s1 = (Student)o1;
                    Student s2= (Student)o2;
                    if(s1.high > s2.high){
                        return 1;
                    }else {
                        return -1;
                    }
                }
                return 0;
            }
        });
        System.out.println(big);
    }
}
