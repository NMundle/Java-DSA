public class linearSearch {

    // Returns the index of key in arr[], or -1 if not found
    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {  // compare String contents, not references
                return i;
            }
        }
        return -1;  // key not found
    }

    public static void main(String[] args) {
        String[] menu = { "Pizza", "Burger", "Pasta", "Salad", "Sushi" };
        String key = "Pasta";

        int index = linearSearch(menu, key);  // correct method call and return type

        if (index != -1) {
            System.out.println("Item found at index: " + index);
        } else {
            System.out.println("Item not found in the menu.");
        }
    }
}
