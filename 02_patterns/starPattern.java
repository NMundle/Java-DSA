// Basic Logic Info for Pattern
/* In pattern problem its mandatory to use the nested loop.
   1:- Outer Loop defines how many lines present in the pattern.
   2:- Inner Loop defines how many number of times pattern repeated in the single line (i times).
   3:- What to print ? ex:-num,* etc

 */
// public class starPatterns{
// public static void main(String args[]){
//     for(int line = 1;line <= 10 ; line ++){
//         for(int star = 1; star <= line; star ++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }
    
// }
// }

//Inverted Star Pattern
public class invertedStarPatterns{
public static void main(String args[]){
    int n = 10;
    for(int line = 1; line <=n ; line ++){
        for(int star = 1; star<=n-line+1; star++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}