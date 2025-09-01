// repeated elements in an array
// there is hashset method to check if an element is present in the set

import java.util.Set;
import java.util.HashSet;

public class practice1 {
    // public static boolean containDuplicate(int num[]){
    //     //create hashset to store integers
    //     Set<Integer> intSet = new HashSet<>();
         
    //     //Iterate over each element
    //     for( int i = 0 ; i< num.length; i++){
    //         //check the  number in hashset
    //         if(intSet.contains(num[i])){
    //             return true;
    //         }else{
    //             //Add number to the hashset
    //             intSet.add(num[i]);
    //         }
    //     }
    //     return false;
    // }



    //Next Que
    //to  find the index of an target element

    public static int findindexNo(int num[]){
        int target = 3;
        int n = num.length;
        for(int i = 0; i< n; i++){
            if(num[i] == target){
              return i;
            }
        }
        return -1;


    }
    //num[i] is the value of an index
    //i is the index


    //METHOD 2
    //O(log n )  runtime complexity code

    public class BinarySearchExample {

    // This algorithm has O(log n) complexity
    public static int binarySearch(int[] sortedNumbers, int target) {
        int left = 0;
        int right = sortedNumbers.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; // Find the middle index

            // Check if target is at the middle
            if (sortedNumbers[mid] == target) {
                return mid; // Found it!
            }

            // If target is greater, discard the left half
            if (sortedNumbers[mid] < target) {
                left = mid + 1;
            } 
            // If target is smaller, discard the right half
            else {
                right = mid - 1;
            }
        }

        // Target was not in the array
        return -1;
    }

    public static void main(String[] args) {
        // IMPORTANT: The array MUST be sorted
        int[] sortedNum = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;
        int index = binarySearch(sortedNum, target);
        System.out.println("Target " + target + " found at index: " + index); // Output: 5
    }
}


    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        System.out.println(findindexNo(num));
        
    }
}