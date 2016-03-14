package head_4.example4_23;

/**
 * Created by Pasha on 11.02.2016.
 */
public class FibonachiClass {
    public static void main(String[] args) {
        fibonachi(Integer.parseInt(args[0]));
    }
    public static void fibonachi(int num){
        System.out.println("Number of elements: " + num);
        int n = 1, l = 0;
        if (num > 0) {
            System.out.print(n + " ");
            if (num == 1)
                return;
        }
        else
            return;
        for (int i = 0; i < num - 1; i++) {
            System.out.print((n += l) + " ");
            l = n - l;
        }
    }
}
