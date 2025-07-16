import java.util.Scanner;
public class productOfab {

    public static int product(int a,int b){
        int product = a * b; // Calculate product
        // Return the product
         return product;
       
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
       int a = sc.nextInt();
       System.out.print("Enter second number (b): ");
         int b = sc.nextInt();
       int multiply =  product(a, b);
        System.out.println("Product of " + a + " and " + b + " is: " + multiply);

    }
}