//1:- (Outer Loop) No. of lines or rows to print
// 2:- (Inner Loop) No. of stars to print in each row
// 3:- (Inner Loop) No. of spaces to print in each row

// Logic
//1:-stars is equal to row no. or line no.
//2:- Spaces is equal to n-i
//3:- first we have to print spaces and then stars

 public class HalfPyramid {
 
    public static void InvRotHalfPyramid( int n){
        //Outer
        for(int i = 1; i<=n; i++){
            //spaces
            for(int j = 1; j<= n-i ; j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1 ; j<= i ;j++){
                System.out.print("*");
            }
            //new line
            System.out.println();


        }


    }
    public static void main(String args[]){
        InvRotHalfPyramid(10);

    }

    
    
}
