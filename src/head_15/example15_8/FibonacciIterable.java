package head_15.example15_8;

import java.util.Iterator;

/**
 * Created by VitAl on 19.10.2016.
 */
public class FibonacciIterable extends Fibonacci implements Iterable<Integer>{
    private int i = 0;

    public FibonacciIterable(int i) {
        this.i = i;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return i > 0;
            }
            @Override
            public Integer next() {
                i--;
                return FibonacciIterable.this.next();
            }
        };
    }

    public static void main(String[] args) {
        for (Integer fi: new FibonacciIterable(18)) {
            System.out.print(fi + " ");
        }
    }
}
