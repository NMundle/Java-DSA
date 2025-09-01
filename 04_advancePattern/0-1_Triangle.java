//this pattern is solve with the help of matrix
//we are using the i and j loop to print the pattern
//we have to print 0 and 1 in the pattern
// so that the Logic sholud be like this
//if i+j is even then print 1 else print 0
public class Triangle {

    public static void Triangle(int n) {
       
        for(int i =1 ; i<= n;  i++){
            for(int j=1; j<= i; j++){
                if((i + j)%2 == 0 ){
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Triangle(6);
        
    }
}