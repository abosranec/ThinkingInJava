package head_5.example5_21;

/**
 * Created by Pasha on 20.02.2016.
 */
enum EnumType {
    ONE, TWO, THREE, FOUR, FIVE, SIX
}
public class EnamClass {
    public static void main(String[] args) {
        EnumType ec = EnumType.FIVE;
        System.out.println(ec + ", number: " + ec.ordinal());
        for (EnumType s: EnumType.values()) {
            System.out.println(s + ", number: " + s.ordinal());
        }
        methodForSwitch(EnumType.ONE);
        methodForSwitch(EnumType.TWO);
        methodForSwitch(EnumType.THREE);
        methodForSwitch(EnumType.FOUR);
        methodForSwitch(EnumType.FIVE);
        methodForSwitch(EnumType.SIX);
    }
    public static void methodForSwitch (EnumType et){
        switch (et){
            case ONE:
            case TWO:
                System.out.println("One or Two: " + et.ordinal());
                break;
            case THREE:
            case FOUR:
                System.out.println("Three or four: " + et.ordinal());
                break;
            case FIVE:
            case SIX:
            default:
                System.out.println("Five or six: " + et.ordinal());
                break;
        }
    }
}
