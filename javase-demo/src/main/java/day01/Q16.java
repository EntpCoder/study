package day01;


import java.util.Arrays;

public class Q16 {
    public static void main(String[] args) {
        int[] arr = {10,43};
        Arrays.stream(arr)
                .filter(value -> Arrays.stream(arr).filter(v -> v == value).count() > 1)
                .distinct()
                .forEach(System.out::println);
    }
}
