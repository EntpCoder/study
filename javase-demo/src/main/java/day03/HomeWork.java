package day03;

public class HomeWork {
    public static void main(String[] args) {
        System.out.println(getNum(1370));
        System.out.println(getUglyNumbers(20));
    }
    /**
     * 牛牛选择了一个正整数X,然后把它写在黑板上。然后每一天他会擦掉当前数字的最后一位,直到他擦掉所有数位。
     * 在整个过程中,牛牛会把所有在黑板上出现过的数字记录下来,然后求出他们的总和sum.
     *  例如X = 509, 在黑板上出现过的数字依次是509, 50, 5, 他们的和就是564.
     * 牛牛现在给出一个sum,牛牛想让你求出一个正整数X经过上述过程的结果是sum.
     */
    public static int getNum(int sum){
        for (int i = sum;i > 0;i--) {
            int temp = i;
            int tempSum = 0;
            while (temp > 0) {
                tempSum += temp;
                temp /= 10;
            }
            if (tempSum == sum)
                return i;
        }
        return -1;
    }
    public static int getUglyNumbers(int n) {
        int[] arr = new int[n];
        arr[0] = 1;
        int index2 = 0, index3 = 0, index5 = 0;
        for (int i = 1; i < n; i++) {
            int min = Math.min(Math.min( arr[index2] * 2 , arr[index3] * 3),
                    arr[index5] * 5);
            arr[i] = min;
            if(min == arr[index2] * 2) index2++;
            if(min == arr[index3] * 3) index3++;
            if(min == arr[index5] * 5) index5++;
        }
        return arr[n - 1];
    }
}