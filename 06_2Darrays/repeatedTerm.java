public class repeatedTerm {
    public static void noOfSeven(int matrix[][]){
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] == 7){
                    count++;
                }
            }
        }
        System.out.println("Number of times 7 is repeated: " + count);

    }

public static void main(String[] args) {
    int matrix[][] = {
        {4,7,8},{8,8,7}
    };
    noOfSeven(matrix);
    
}
}