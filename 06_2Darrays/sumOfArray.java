public class sumOfArray {
    public static void sumOfSecondRow(int matrix[][]){
        int sum = 0;
        if(matrix.length > 1) {
            for(int j = 0; j < matrix[1].length; j++){
                sum += matrix[1][j];
            }
            System.out.println("Sum of second row: " + sum);
        } else {
            System.out.println("Matrix does not have a second row.");
        }
    }


    public static void main(String[] args) {
        int matrix[][] = {
            {1,4,9},
            {11,4,3},
            {2,2,3}
        };
        sumOfSecondRow(matrix);
        
    }
}