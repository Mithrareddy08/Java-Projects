package week4;
import java.util.*;
public class HashMapSum {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target1 = 13;
        int [] input = {10,20,30,40,50,60};
        int target2 = 100;
        System.out.println(Arrays.toString(new HashMapSum().twoSum(nums, target1)));
        System.out.println(Arrays.toString(new HashMapSum().twoSum(input, target2)));
    }
    public int[] twoSum(int[] nums, int target1)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++)
        {
            int r = target1 - nums[i];
            if(map.containsKey(r)) return new int[] {i, map.get(r)};
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}