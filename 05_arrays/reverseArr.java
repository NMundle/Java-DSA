public class reverseArr {


public static void reverse(int arr[]){
    int first = 0;
    int last = arr.length -1 ;

    while(first < last){
        // Swap the elements at first and last indices
       int temp = arr[first];
       arr[first] = arr[last];
       arr[last] = temp;
       first++;
    last--;
    }
    
    
}

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        reverse(arr); // Call the function to reverse the array
        
        // Print the reversed array
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line after printing the array
        
    }
}