//Logic spaces + hollow rectangle

public class hollowRhombus {
    public static void hollowRhombus(int totRows, int totCols) {
        // outer loop for each row
        for(int i = 1; i<=totRows; i++){
            for(int j = 1; j<= totRows-i; j++){
                System.out.print(" "); // Print spaces
            }
            for(int j=1 ; j<=totCols; j++){
                if(j == 1 || j == totCols || i == 1 || i == totRows){
                    System.out.print("* "); // Print stars for borders
                } else {
                    System.out.print("  "); // Print spaces for hollow part

                }

            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        hollowRhombus(7, 6); // Call the method to print the hollow rhombus pattern
        
    }
}