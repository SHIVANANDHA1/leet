import java.util.*;

public class rank { // Renamed the class to Solution
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return new int[0];
        }

        // Create a sorted version of the array without duplicates
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);

        // Remove duplicates by using a map to store the rank
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int num : sortedArr) {
            if (!rankMap.containsKey(num)) {
                rankMap.put(num, rank++);
            }
        }

        // Replace each element in the original array with its rank
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = rankMap.get(arr[i]);
        }

        return result;
    }
}
