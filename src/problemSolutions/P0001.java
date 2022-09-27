package problemSolutions;

import java.util.HashMap;

public class P0001 {
//	public static int[] twoSum(int[] nums, int target) {
//		int[] result = new int[2];
//		int total = 0;
//		for (int i = 0; i < nums.length; i++) {
//			for (int j = 0; j < nums.length; j++) {
//				total = nums[i]+nums[j];
//				if(total == target && i !=j) {
//					result[0] = i;
//					result[1] = j;
//					break;
//				}
//			}	
//		}
//		return result;
//	}
	
	//Faster using hasmaps, code stolen from https://www.code-recipe.com/post/two-sum
	public static int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}
