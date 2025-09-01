public class subarray {
    public static void findMaxSubarray(int arr[]){
        int currsum =  0;
        int maxsum = Integer.MIN_VALUE; // Initialize to the smallest possible integer
        int ts = 0;
        int prefix[] = new int[arr.length]; // Prefix sum array (not used in this code but can be useful for optimization)

        prefix[0] = arr[0]; // Initialize the first element of the prefix sum array
        for(int i = 1; i < prefix.length;i++){
            // Calculate prefix sum
            prefix[i] = prefix[i-1]+ arr[i];
        }
        for(int i =0; i<arr.length;i++){
          int  start  = i;
        
        for(int j = i; j< arr.length; j++){
           int end = j;
            currsum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1]; // Calculate current subarray sum using prefix sums
        
//         for(int k = start; k<=end; k++){
//             // System.out.print(arr[k] + " "); // Print the subarray from start to end
//             currsum += arr[k]; // Calculate the sum of the subarray
            
//             ts++; // Increment total subarrays count
// }
//             System.out.println(currsum);
            if(currsum > maxsum){
                maxsum = currsum; // Update maxsum if current sum is greater
            }
}
            System.out.println(); // New line after printing each subarray

        }
        // System.out.println("Total subarrays: " + ts); // Print total number of subarrays found
        System.out.println("Maximum subarray sum: " + maxsum); // Print the maximum subarray sum
    }

    public static void kadanes(int numbers[]){
        int ms = Integer.MIN_VALUE; // Initialize maximum sum to the smallest possible integer
        int cs = 0; // Current sum initialized to 0
        for(int i =0 ; i< numbers.length; i++){
            cs = cs + numbers[i]; // Add current element to current sum
            if(cs < 0){
                cs = 0; // Reset current sum if it becomes negative
            }
            ms = Math.max(ms, cs); // Update maximum sum if current sum is greater
        }
        System.out.println("Maximum subarray sum using Kadane's algorithm: " + ms); // Print the maximum subarray sum found using Kadane's algorithm

    }

    public static void main(String[] args) {
    int arr[] = {-2,-3,4,-1,-2,1,5,-3}; // Example array
    kadanes(arr); // Call the function to find and print subarrays
        
    }
}