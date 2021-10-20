package lesson;

import java.util.Arrays;

public class MethodArgument {

    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++)
                if (nums[i] + nums[j] == target)
                    return new int[]{i+1, j+1};
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int[] arr = {10,20,370,90};
        int t = 100;
        int[] res = twoSum(arr, t);
        System.out.println(Arrays.toString(res));
    }
}
