public class pairs {

    public static void pair(int numbers[]){
        int tp =0;
        
        for(int i=0; i < numbers.length; i++){

            int curr = numbers[i]; // Current element
            for(int j= i+1; j< numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") "); // Print the 
                tp++; // Increment the count of pairs

            }
            System.out.println(); // New line after printing pairs for current element

        }
        System.out.println("Total pairs: " + tp); // Print total number of pairs found

    }
    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10}; // Example array
        pair(numbers); // Call the function to print pairs
        
        // Note: The above code will throw an ArrayIndexOutOfBoundsException
        // because the loop conditions are incorrect. It should be:
        // for(int i=0; i < numbers.length; i++) and for(int j=i+1; j < numbers.length; j++)
        // This is a common mistake when iterating through arrays.
        
    }
}