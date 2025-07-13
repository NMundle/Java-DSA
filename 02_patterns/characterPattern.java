public class characterPattern {

    public static void main(String[] args) {
        int n = 5;
        char ch = 'A'; // Starting character
        for( int line = 1; line <= n; line++){

        for(int chars = 1; chars <= line ; chars ++){
            System.out.print(ch + " ");
            ch++; // Increment to the next character
        }
            System.out.println();
        }
    }
}