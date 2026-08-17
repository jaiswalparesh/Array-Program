/*
Given an array of integers, we need to sort the unique elements in ascending order 
and the duplicate elements in descending order. For example,
if the input array is [2, 1, 9, 1, 2, 5, 1, 6, 1],
the output should be [5, 6, 9, 2, 2, 1, 1, 1, 1] in java
*/
import java.util.*;

public class SortArrayByUniqueAndDuplicate {
    public static void main(String args[]) {
        int arr[] = {2, 1, 9, 1, 2, 5, 1, 6, 1};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) +1);
            } else {
                map.put(arr[i], 1);
            }
        }
        List<Integer> uniqueList = new ArrayList<>();
        List<Integer> duplicateList = new ArrayList<>();
        map.entrySet().stream().filter(m -> m.getValue() == 1).forEach(entry -> {
            uniqueList.add(entry.getKey());
        });

        map.entrySet().stream().filter(m -> m.getValue() > 1).forEach(entry -> {
            int count = entry.getValue();
            while(count > 0) {
                duplicateList.add(entry.getKey());
                count--;
            }
        });
        Collections.sort(uniqueList);
        Collections.sort(duplicateList, Collections.reverseOrder());
        uniqueList.addAll(duplicateList);
        Integer[] array = uniqueList.toArray(Integer[] :: new);
        System.out.println(Arrays.toString(array));
    }
}
