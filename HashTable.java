import java.util.*;

public class HashTable {


    public static void main(String[] args) {
        int[] nums = {22, 21, 34, 87, 98, 49, 10, 7, 15};
        int target = 43;

        int[] solution = mapFunction(nums, target);
    }

    public static int[] mapFunction(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for(int j = 0; j < nums.length; j++) {
            int complement = target - nums[j];

            //System.out.println("" + target + "-" + nums[j] + " = " + complement);

            if(map.containsKey(complement)) {
                /*
                System.out.println("I found a complement for the number at index " + j +". The number at index 2 is "
                        + nums[j] + ". The complement is " + complement);
                System.out.println("The number " + complement + " is located at index " + map.get(complement));
                */
                int[] solution = {j, map.get(complement)};
                //System.out.println(Arrays.toString(solution));
                return solution;
            }

        }
        //System.out.println(map);
        return null;
    }
}
