public class binToDec {

    public static void binToDec(int binNum){
        int decimal = 0;
       int pwr = 0;
       while(binNum > 0){
              int lastDigit = binNum % 10; // Get the last digit
              decimal += lastDigit * Math.pow(2, pwr); // Convert to decimal
              pwr++; // Increment power
              binNum /= 10; // Remove the last digit
       }
         System.out.println("Decimal value: " + decimal); // Print the decimal value
    }

    public static void main(String[] args) {
        binToDec(1010);
        
    }
}