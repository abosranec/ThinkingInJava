package head_4.example4_18;

/**@author Pasha */
/** Class for find prime number
 */
public class PrimeNumber {
    public static void main(String[] args) {
        int dCounter = 0;
        outer: for (int i = 1; i < 10000; i++) {
            for (int j = 1; j < i; j++) {
                if ((i % j == 0) && (j != 1))
                    continue outer;
            }
            System.out.println(i);
            dCounter++;
        }
        System.out.println("All prime number: " + dCounter);
    }
}