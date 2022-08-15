package day20.lambda;

import java.util.Optional;

/**
 * @author Yang Song
 * @date 2022/8/12 14:10
 */
public class TestNpe {
    public static void main(String[] args) {
        Zoo z = new Zoo();
        Dog d = null;
        z.setDog(d);
        Optional.ofNullable(z).map(Zoo::getDog).map(Dog::getAge).ifPresent(System.out::println);
    }
}
