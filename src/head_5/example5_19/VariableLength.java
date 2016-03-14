package head_5.example5_19;

/**
 * Created by Pasha on 19.02.2016.
 */
public class VariableLength {
    public static void main(String... args) {
        for (String str: args) {
            System.out.print(str + " ");
        }
        System.out.println();

        variableMethod(new String[]{"aa", "bb", "cc"});
        variableMethod("aa", "bb", "cc");
    }
    static void variableMethod(String... strings){
        for (String str: strings) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
