public class largestNumber {
    // Function to find the largest number in an array
    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible 
        int smallest = Integer.MAX_VALUE; // Initialize to the largest possible value
        for(int i = 0; i < num.length; i++){
            if(largest < num[i]){
                largest = num[i]; // Update largest if current number is greater

            }
            if(smallest > num[i]){
                smallest = num[i]; // Update smallest if current number is smaller
            }
            
        }
        System.out.println("Smallest number is: " + smallest); // Print the smallest number
        return largest; // Return the largest number found
    }

    public static void main(String[] args) {
        int num [] = {3,5,6,7,8};
        int largest = getLargest(num); // Call the function to find the largest number
        System.out.println("Largest number is: " + largest); // Print the result
        
    }
}