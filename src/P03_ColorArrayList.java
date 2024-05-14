import java.util.ArrayList;

/**
 * Write a Java program to create a new array list, add some colours (string) and
 * printout the collection using for each loop.
 */

public class P03_ColorArrayList {

    public static void main(String[] args) {
        // Create a new ArrayList to store colors
        ArrayList<String> colorsList = new ArrayList<>();

        // Add some colors to the ArrayList
        colorsList.add("Blue");
        colorsList.add("Green");
        colorsList.add("Red");
        colorsList.add("Yellow");

        // Print out the collection using foreach loop
        System.out.println("Colors in the ArrayList:");
        for (String color : colorsList) {
            System.out.println(color);
        }
    }
}
