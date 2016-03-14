package head_4.example4_22;

import java.util.Random;

/**
 * Created by Pasha on 10.02.2016.
 */
public class LearnSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++) {
            Random rm = new Random();
            int pi = rm.nextInt(20);
            switch (pi) {
                case 1:
                    System.out.println(1);
                    //break;
                case 2:
                    System.out.println(2);
                    //break;
                case 3:
                    System.out.println(3);
                    //break;
                case 4:
                    System.out.println(4);
                    //break;
                case 5:
                    System.out.println(5);
                    //break;
                default:
                    System.out.println("other..., " + pi);
            }
        }
    }
}
