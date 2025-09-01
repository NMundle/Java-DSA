public class binaryNumber {
    public static int binaryNumber(int number[], int key){
        int  start = 0; // Initialize start index
        int end = number.length - 1; // Initialize end index
    
        while (start <= end) {
            int mid = (start + end)/2; // Calculate mid index
            if(number[mid] == key){
                return mid;
            }
            if(number[mid] < key){
                start =  mid + 1;
            }else {
                end = mid - 1; // Adjust end index
            }
            
        }
        return -1; // Return -1 if key is not found

    
    }

    public static void main(String[] args) {
        int number[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int key = 6; // Element to search for
        int result = binaryNumber(number, key); // Call the function to perform binary search

        if (result != -1) {
            System.out.println("Element found at index: " + result); // Print the index if found
        } else {
            System.out.println("Element not found in the array."); // Print if not found
        }
        
    }
}