import java.util.Scanner;
public class continueex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        do{
             System.out.print("Enter numbers :");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue; // Skips the rest of the loop if the last digit is 0
            }
            System.out.println(n);
        }while(true);
    }
}