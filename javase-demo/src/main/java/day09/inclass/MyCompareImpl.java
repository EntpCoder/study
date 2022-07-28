package day09.inclass;

/**
 * @author Yang Song
 * @date 2022/7/28 20:32
 */
public class MyCompareImpl implements MyCompare{

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
}
