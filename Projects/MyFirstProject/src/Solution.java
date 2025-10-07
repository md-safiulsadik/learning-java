import java.util.*;
import java.util.stream.*;

public class Solution {

    public boolean hasDuplicate(int[] nums) {
//        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
//        return set.size() < nums.length;

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) return true;
        }
        return false;
    }

    public boolean isAnagram(String s, String t) {
        char[] sChar = s.toCharArray();
        Arrays.sort(sChar);
        String sorted_S = new String(sChar);

        char[] tChar = t.toCharArray();
        Arrays.sort(tChar);
        String sorted_T = new String(tChar);

        return sorted_T.equalsIgnoreCase(sorted_S);
    }


    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > target) {
                i++;
                continue;
            }

//            if (nums[i] + )
        }

        return nums;
    }


    public static int findClosestNumber() {
        int[] nums = {-4,-2,1,4,8};

        int closest = nums[0];

        for (int num : nums) {
            if (Math.abs(num) < Math.abs(closest) ||
                    Math.abs(num) == Math.abs(closest) && num > closest) {
                closest = num;
            }
        }

        return closest;
    }

    public static void main(String[] args) {
        findClosestNumber();
    }
}
