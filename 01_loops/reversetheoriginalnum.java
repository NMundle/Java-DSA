public class reversetheoriginalnum {

    public static void main(String[] args) {
        int rev = 0;
        int n = 223356;
        while(n > 0){
            int lastDigit = n % 10;//formula to get last digit
            rev = rev * 10 + lastDigit; //formula to add last digit to rev
            n = n  / 10; //formula to remove last digit
        }
        System.out.println("Reversed Number: " + rev);
    }
}