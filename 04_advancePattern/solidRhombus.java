// it solves in matrix form
// we are using the i and j loop to print the pattern
//combination of stars and spaces
//COMMON LOGIC:- If the number of spaces or stars  are decreasing the there should be n-i+x(x=0,1)
//first we have to print spaces then stars 

public class solidRhombus {
    public static void solidRhombus(int n) {
        // Outer loop for each row
        for(int i =1; i<=n ; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "); // Print spaces
            }
            for(int j=1; j<=n; j++){
                System.out.print("* "); // Print stars
        }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        solidRhombus(5); // Call the method to print the solid rhombus pattern
        
    }
}