package day14;

import java.util.*;

/**
 * @author Yang Song
 * @date 2022/8/4 8:43
 */
public class TestMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("666");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
        Map<String,Integer> map = new HashMap<>(5);
        map.put("中国",123);
        map.put("美国",58);
        map.put("日本",12);
        map.put("新西兰",3);
        System.out.println("键值对个数:"+map.size());
        System.out.println("新西兰对应的金牌数:"+map.get("新西兰"));
        System.out.println("是否有中国:"+map.containsKey("中国"));
        Set<String> country = map.keySet();
        System.out.println("所有国家(key)=====");
        for (String c:
             country) {
            System.out.println(c);
        }
        System.out.println("所有金牌数(value)=====");
        Collection<Integer> values = map.values();
        values.forEach(System.out::println);
        System.out.println("获取所有键值对=====");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry);
        }
        System.out.println("删除日本=====");
        map.remove("日本");
        map.entrySet().forEach(System.out::println);
    }
}
