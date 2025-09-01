//1:- Outer Loop defines how many lines present in the pattern.
//2:- Inner Loop defines how many number of times pattern repeated in the single line (i times) in the form of matrix(row,coloumn).


public class hollowRectangle {

    public static void hollowRectangle(int totRows, int totCols){
        for(int i = 1; i<= totRows; i++){
            // cell-(i,j)
            for(int j = 1 ; j<= totCols; j++){
                if(i  == 1 || i == totRows|| j==1 || j == totCols ){
                    // boundary cells
                    System.out.print("*"); // Print '*' for borders
                } else {
                    System.out.print(" "); // Print space for hollow part
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }

    public static void main(String[] args) {
        hollowRectangle(5, 10);
        //Total Rows = 5
        //Total Columns = 10
        //Output:
        // **********
        // *        *
        // *        *           
        // *        *
        // **********
        //This code creates a hollow rectangle pattern with specified rows and columns.
        //You can change the values of totRows and totCols to create different sizes of hollow rectangles.
        
    }
}