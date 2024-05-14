import java.util.HashSet;

/**
 * Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
 * Show which numbers between 1 and 10 are in the set. (Hint: use for loop and if
 * else)
 */
public class P07_HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> numberSet = new HashSet<>();

        //Store the number 4,7 and 8 in the set
        numberSet.add(4);
        numberSet.add(7);
        numberSet.add(8);
        System.out.println("Number between 1 to 10 present in the set:");
        for (int i = 1; i <= 10; i++) {
            if (numberSet.contains(i)){
                System.out.println(i + " is present");
            }else {
                System.out.println(i + " is not present");
            }
        }
    }
}
