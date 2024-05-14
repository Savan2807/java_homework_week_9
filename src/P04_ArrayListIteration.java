import java.util.ArrayList;

/**
 * Write a Java program to iterate through all elements in an array list using
 * Iterater.
 */
public class P04_ArrayListIteration {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        //Add some numbers to the ArrayList
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        //Iterate through the ArrayList using foreach loop
        System.out.println("Iterate through the ArrayList using foreach loop:");
        for (int number : numberList) {
            System.out.println(number);
        }
    }
}
