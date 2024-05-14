import java.util.ArrayList;

/**
 * Write a Java program to retrieve an element (at a specified index) from a given
 * array list
 */

public class P05_RetrieveElementAtIndex {
    public static void main(String[] args) {
        //Create an ArrayList of stings
        ArrayList<String> fruits = new ArrayList<>();

        //Add some fruits to the ArraysList
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grapes");

        //Specify the index to retrieve the element from
        int index = 1;
        //Check if the index is valid
        if (index >= 0 && index < fruits.size()) {
            //Retrieve the element at the specified index
            String element = fruits.get(index);
            System.out.println("Element at index " + index + ": " + element);
        }else {
            System.out.println("Invalid index specified.");
        }
    }
}
