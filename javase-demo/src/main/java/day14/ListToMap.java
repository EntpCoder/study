package day14;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Yang Song
 * @date 2022/8/4 9:37
 */
public class ListToMap {
    public static void main(String[] args) {
        Foo f1=  new Foo("测试1","test a") ;
        Foo f2= new Foo("测试2","test b")  ;
        Foo f3= new Foo("测试1","test c");
        Foo f4= new Foo("测试3","test d");
        Foo f5= new Foo("测试3","test e") ;
        Foo f6= new Foo("测试4","test f");
        List<Foo> list =  new ArrayList<>();
        list.add(f1);
        list.add(f2);
        list.add(f3);
        list.add(f4);
        list.add(f5);
        list.add(f6);
        Map<String,List<Foo>> map = new HashMap<>(16);
        for (Foo f :
                list) {
            String key = f.getCode();
            if(map.containsKey(key)){
                map.get(key).add(f);
            }else {
                List<Foo> l = new ArrayList<>();
                l.add(f);
                map.put(key,l);
            }
        }
        map.entrySet().forEach(System.out::println);
    }
}
