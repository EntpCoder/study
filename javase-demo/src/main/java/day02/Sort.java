package day02;

public class Sort {
    public static void quickSort(int[] arr){
        quickSort(arr,0,arr.length-1);
    }
    public static void quickSort(int[] arr,int left,int right){
        if (left < right) {
            int basic = arr[left];
            int l = left;
            int r = right;
            while (l < r) {
                while (l < r && arr[r] > basic) r--;
                while (l < r && arr[l] <= basic) l++;
                if (l < r) swap(arr, l, r);
            }
            arr[left] = arr[l];
            arr[l] = basic;
            quickSort(arr, left, l - 1);
            quickSort(arr, l + 1, right);
        }
    }
    private static void swap(int[] arr,int index1,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
