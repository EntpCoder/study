package day19.homework;

import java.util.Arrays;

/**
 * @author Yang Song
 * @date 2022/8/11 19:15
 */
public class MoveTheArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6};
        rotateTheArray(arr,12);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotateTheArray(int[] arr,int distance){
        distance = distance % arr.length;
        if (distance == 0){
            return;
        }
        reverse(arr,0, arr.length-1);
        reverse(arr,0,distance-1);
        reverse(arr,distance,arr.length-1);
    }
    public static void reverse(int[] arr,int left,int right){
        while (left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
