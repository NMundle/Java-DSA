//The pattern is a butterfly pattern
// It should be printed in a way that the first half of the pattern is mirrored in the second half(upside down).
// The pattern consists of stars and spaces, where the number of stars increases and then decreases symmetrically.
//the logic is we have to print stars then spaces and then stars again
// the number of stars and spaces are calculated based on the row number

public class butterfly {
    public static void butterfly(int n) {
        // Upper part of the butterfly
         for(int i = 1; i<=n; i++){
            //stars - i
            for(int j=1 ;j<= i; j++){
                System.out.print("* ");
            }
            //spaces - 2*(n-i)
            for(int j=1 ;j<= 2*(n-i); j++){
                System.out.print("  "); 

         }
            //stars - i
            for(int j=1 ;j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for(int i = n; i>=1; i--){
            //stars -i
           
             for(int j=1 ;j<= i; j++){
                System.out.print("* ");
            }
            //spaces - 2*(n-i)
            for(int j=1 ;j<= 2*(n-i); j++){
                System.out.print("  "); 

         }
            //stars - i
            for(int j=1 ;j<= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

          
        
    }

    public static void main(String[] args) {
        butterfly(5);
    }
}
