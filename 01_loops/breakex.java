import java.util.Scanner;
public class breakex {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    do{
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        if(n%10==0){
            break; // Breaks the loop if the last digit is 0
        }
        System.out.println(n);
    }while(true);
    }
}