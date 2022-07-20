package day02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,2,-1,-1,-4};
        threeSum(arr);
        System.out.println(threeSum(arr));
    }
    public static void onlyOne(int[] arr){
        for (int k : arr) {
            int count = 0;
            for (int i : arr) {
                if (k == i) count++;
            }
            if (count == 1) System.out.println(k);
        }
    }
    // 1.排序
    // 2.固定 nums[i] 维护left 和right left为i+1 right为length-1
    // 3.当i == i-1 时跳过(去重),当i > 0时结束循环 因为当最小的比0大时 三数之和不可能为0
    // 4.nums[first] + nums[l] + nums[r] > 0  r--
    // 5.nums[first] + nums[l] + nums[r] < 0  l++
    // 6.nums[first] + nums[l] + nums[r] == 0  add  添加时去重左右指针出现过的值 (r == r-1  l == l+1)
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null ||nums.length < 3) return result;
        Arrays.sort(nums);
        for (int i = 0;i < nums.length && nums[i] <= 0;i++){
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int l = i+1;
            int r = nums.length-1;
            while (l < r){
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0){
                    result.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while (l < r && nums[r] == nums[r-1]) r--;
                    while (l < r && nums[l] == nums[l+1]) l++;
                    l++;
                    r--;
                }else if(sum > 0){
                    r--;
                }else {
                    l++;
                }
            }
        }
        return result;
    }
}
