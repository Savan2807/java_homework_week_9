import java.util.ArrayList;

/**
 * Write a Java program to test if an array list is empty or not.
 */
public class P06_ArrayListEmptyTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Audi");
        list.add("Toyota");
        //Check if the ArrayList is empty
        if (list.isEmpty()) {
            System.out.println("The ArrayList is empty.");

        } else {
            System.out.println("The ArrayList is not empty.");

        }
    }
}
