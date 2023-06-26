import java.lang.Math;
import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Vector<Integer> complement = new Vector<>();
        for (int i = 0; i < nums.length; i++) {
            complement.add(nums[i]);
        }
        HashSet<Integer> hashSet = new HashSet<>();

        //Vector<Integer> complement = new Vector<Integer>(Arrays.asList(nums));

        Iterator<Integer> iterator = complement.iterator();
        while(iterator.hasNext()){
            int value = iterator.next();
            int diff = Math.abs(value - target);
            hashSet.add(value);
            int index =complement.indexOf(value);
            complement.remove(index);       

            if(complement.contains(diff)){
                
                // return [complement.get(value), complement.get(diff)];
                System.out.println(value+" Index: "+complement.indexOf(value));
                System.out.println(diff+" Index: "+complement.indexOf(diff));

                return new int[] {complement.indexOf(value), complement.indexOf(diff)};
            }
        }
        return null;
    }
    public static void main(String[] args){
        Solution sol = new Solution();
        int[] nums = {3,2,4};
        int[] finalArray = sol.twoSum(nums, 6);
        System.out.println(finalArray[0] +" "+ finalArray[1]);
    }
}
