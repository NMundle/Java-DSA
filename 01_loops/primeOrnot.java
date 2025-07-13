import java.util.Scanner;
public class primeOrnot {
public static void main(String[] args) {
    int n ;
    int count = 0;
    System.out.print("Enter a number: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(int i = 1; i<=n; i++){
        if(n%i==0){
            count++;
        }

    }    
    if(count==2){
        System.out.println("Prime No.");
    }
    else{
        System.out.println("Not a Prime No.");
    }
}
}