import java.util.HashMap;

/**
 * Create a HashMap object called people that will store String keys and Integer
 * values: And use for each loop to iterate the value from Map.
 */
public class P08_HashMapIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> people = new HashMap<>();
        //Add some key-value paris to the HashMap
        people.put("Joan", 15);
        people.put("David", 16);
        people.put("Stephan", 17);
        //Iterate over the value using foreach loop
        System.out.println("Values in the HashMap");
        for (int age : people.values()) {
            System.out.println(age);
        }
    }
}
