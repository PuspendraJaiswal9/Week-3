package hashmapsandhashfunctions.maps;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static int[] findIndicesPair(int arr[] , int target){

        Map<Integer , Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            map.put(arr[i] , i);
        }

        for(int i=0;i<arr.length;i++){
            int rem = target - arr[i];

            if (map.containsKey(rem))
            {
                int index = map.get(rem);
                if (index == i)continue;
                return new int []{i , index};
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {

        int arr[] = {2,4,8,16,32};
        int target = 10;

        int ans[] = findIndicesPair(arr,target);

        System.out.println(ans[0] + " " + ans[1]);
    }
}
