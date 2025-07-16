import java.util.Scanner;
public class factorial {

    public static int fact(int n){
        int fact = 1;
        for(int i = 1; i<=n; i++){
            fact = fact*i; // Calculate factorial
             // Return the factorial
        }
        return fact;
    }

    //Binomial Coefficient
    public static int bicoef(int n, int r) {
        int fact_n = fact(n);
        int fact_r = fact(r);
        int fact_nmr = fact(n-r);
        int bicoef = fact_n/(fact_r * fact_nmr); // Calculate binomial coefficient
        return bicoef;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a n to calculate factorial: ");
       int n = sc.nextInt();
       System.out.println("Enter a r to calculate binomial coefficient: ");
       int r = sc.nextInt();
       int result = bicoef(n,r);
        System.out.println("Factorial of " + n + " is: " + result);
        
    }
}