package day14.homework;

/**
 * @author Yang Song
 * @date 2022/8/4 18:10
 */
public class TestCache {
    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        int i1 = cache.get(1);
        cache.put(2, 102);
        cache.put(3, 3);
        int i2 = cache.get(1);
        int i3 = cache.get(2);
        int i4 = cache.get(3);
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
    }
}
