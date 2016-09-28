package head_8.example8_17;

/**
 * Created by VitAl on 02.03.2016.
 */
enum Alert{
    ALERT_STATUS, CRASH, BABAH, WARNING
}
class AlertStatus{
    public void method1(){
        System.out.println("method1 AlertStatus");
    }
}
class Crash extends AlertStatus{
    @Override
    public void method1(){
        System.out.println("method1 Crash");
    }
}
class Babax extends Crash{
    @Override
    public void method1(){
        System.out.println("method1 Babax");
    }
}
class Warning extends AlertStatus{
    @Override
    public void method1(){
        System.out.println("method1 Warning");
    }
}

public class PatternStatus {
    private Alert enumAlert;
    public AlertStatus alert = new AlertStatus();
    public AlertStatus change(Alert status){
        switch (status){
            case ALERT_STATUS:
                return new AlertStatus();
            case CRASH:
                return new Crash();
            case BABAH:
                return new Babax();
            case WARNING:
                return new Warning();
        }
        return null;
    }
    public static void main(String[] args) {
        PatternStatus ps = new PatternStatus();
        ps.alert.method1();
        ps.alert = ps.change(Alert.BABAH);
        ps.alert.method1();
        ps.alert = ps.change(Alert.CRASH);
        ps.alert.method1();
        ps.alert = ps.change(Alert.WARNING);
        ps.alert.method1();
        ps.alert = ps.change(Alert.ALERT_STATUS);
        ps.alert.method1();
    }
}
