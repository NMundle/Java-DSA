import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class practice3 {

    // 1. Changed return type to List<List<Integer>>
    public static List<List<Integer>> triplet(int[] num) {
        // 2. Corrected comparison (==) and check for length
        if (num == null || num.length < 3) {
            return new ArrayList<>();
        }

        // 3. CRUCIAL: Sort the array first
        Arrays.sort(num);
        
        // Use a Set to automatically handle duplicate triplets
        Set<List<Integer>> result = new HashSet<>();

        // Loop for the first element 'i'
        for (int i = 0; i < num.length - 2; i++) {
            // Set up pointers for the rest of the array
            int left = i + 1;
            int right = num.length - 1;

            // 4. Moved the 'while' loop INSIDE the 'for' loop
            while (left < right) {
                // 5. Fixed variable names (num instead of arr, right instead of rigth)
                int sum = num[i] + num[left] + num[right];
                
                if (sum == 0) {
                    result.add(Arrays.asList(num[i], num[left], num[right]));
                    // Move both pointers inward after finding a valid triplet
                    left++;
                    right--;
                } else if (sum < 0) {
                    // Sum is too small, need a larger number
                    left++;
                } else { // sum > 0
                    // Sum is too large, need a smaller number
                    right--;
                }
            }
        }
        // Convert the Set to a List for the final return
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {
        int num[] = {-1, 0, 1, 2, -1, -4};
        System.out.println(triplet(num)); // Call the function and print the result
    }
}