public class Inverted_HalfPyramid {

    public static void Inverted_HalfPyramid(int n){
        for(int i = 1; i<= n ; i++){
            for( int j = 1; j <= n-i+1 ; j++){
                
            System.out.print(j+ " ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Inverted_HalfPyramid(5);
        
    }
}
//Logic n-i+1
                //The  numbers decrease with each line.
                //thats why  we use n-i
                //but i will not give the exact value that's why we add 1
                //So, the first line will print n numbers, the second line will print n-1 numbers, and so on.
                //For example, if n = 5, the output will be:
                // 1 2 3 4 5
                // 1 2 3 4          
                // 1 2 3
                // 1 2
                // 1
                //This creates an inverted half pyramid pattern of numbers.