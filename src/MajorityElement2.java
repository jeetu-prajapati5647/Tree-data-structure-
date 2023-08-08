import java.util.*;
public class MajorityElement2 {
        public List<Integer> majorityElement(int[] nums) {
            HashMap<Integer,Integer> map = new HashMap<>();
            HashSet<Integer> set = new HashSet<>();
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<nums.length;i++){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            for(int i=0;i<nums.length;i++){
                if(map.get(nums[i])>nums.length/3){
                    set.add(nums[i]);
                }
            }
            for(Integer val : set){
                list.add(val);
            }
            return list;

    }
}
