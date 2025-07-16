//Function Overloading is a feature that allows you to define multiple methods with the same name but different parameter lists.
//This is useful for performing similar operations on different types or numbers of inputs.
//It depends on the method signature (name and parameter types) to differentiate between methods.

//Function Overloading by changing the number of parameters
public class functionOverloading {
    // public static int add(int a, int b) {
    //     return a + b; // Add two integers
    // }

   

    // public static int add(int a, int b, int c) {
    //     return a + b + c; // Add three integers
    // }

    // public static void main(String[] args) {
    //     System.out.println("Sum of 5 and 10: " + add(5, 10)); // Calls the first method
       
    //     System.out.println("Sum of 1, 2 and 3: " + add(1, 2, 3)); // Calls the third method
    // }


//Function Overloading by changing the type of parameters

    public static float add(float a, float b) {
        return a + b; // Add two doubles
    }

    public static int add(int a, int b) {
        return a + b; // Add two integers
    }

    public static void main(String[] args) {
        System.out.println("Sum of 5.5 and 10.2: " + add(5.5f, 10.2f)); // Calls the first method
       
        System.out.println("Sum of 5 and 10: " + add(5, 10)); // Calls the second method
    }
}