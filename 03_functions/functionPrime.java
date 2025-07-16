import java.util.Scanner;
public class functionPrime {

    // public static void isprime(int n){
    //     int count = 0;
    //     for(int i=1;i<=n;i++){
    //         if(n % i == 0){
    //             count++;
    //         }
            
    //     }
    //     if(count == 2){
    //         System.out.println("Prime no.");
    //     }
    //     else{
    //         System.out.println("Not a Prime no.");
    //     }
        

    // } 

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a number :-");
    //     int n = sc.nextInt();
        
       
    //      isprime(n);
        // }


        //Method 2

        public static boolean isprime(int n){
            boolean isPrime = true;
            for(int i = 2; i <= n-1 ; i++){
                if(n % i == 0){
                    isPrime = false; // Not a prime number
                    break;
                }
            }
            return isPrime; // Return true if prime, false otherwise
        }

        public static void primesInRange(int n) {
            for(int i = 2; i <= n; i++){
                if(isprime(i)){
                    System.out.print(i + " "); // Print prime numbers
                }
            }
           
        }
        
        public static void main(String[] args) {
            System.out.println(isprime(12));
            primesInRange(20);
            
        }


}