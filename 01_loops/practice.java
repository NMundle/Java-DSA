// This program calculates the sum of even and odd numbers from 1 to n


import java.util.Scanner;
// public class practice {

//     public static void main(String[] args) {
//         int n;
//         int odd,even;
//         odd = 0;
//         even = 0;
//         System.out.print("Enter a number: ");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         for(int i = 1; i <=n ; i++){
//             if(i % 2 == 0) {
//                 even += i; // Sum of even numbers
//             } else {
//                 odd += i; // Sum of odd numbers
//             }
//         }
//         // System.out.println("Sum of even numbers: " + even);
//         // System.out.println("Sum of odd numbers: " + odd);
//     }
// }

//Factorial of a number
import java.util.Scanner;
public class innerpractice {
   public static void main(String args[]){
    int n;
    int fact = 1;
    System.out.println("Enter the number :");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i = 1; i <= n; i++){
        fact *= i; // Calculate factorial
    }
    System.out.println("Factorial of " + n + " is: " + fact);

   }
}
