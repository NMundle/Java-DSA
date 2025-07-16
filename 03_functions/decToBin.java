public class decToBin {
    public static void decToBin(int decimalNum) {
        int myNum = decimalNum; // Store original number
        int pwr = 0;
        int binaryNum = 0;
        while (decimalNum > 0) {

            int rem = decimalNum % 2; // Get remainder
            binaryNum += rem * Math.pow(10, pwr); // Convert to binary
            pwr++; // Increment power
            decimalNum /= 2; // Remove last digit
        }
        System.out.println("Binary value of " + myNum + " is: " + binaryNum); // Print binary value
    }

    public static void main(String[] args) {
        decToBin(10); // Convert decimal 10 to binary
        
        
    }
}