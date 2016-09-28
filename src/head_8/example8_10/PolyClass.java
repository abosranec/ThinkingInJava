package head_8.example8_10;

/**
 * Created by VitAl on 02.03.2016.
 */
class SuperClass{
    public static long counter = 0;
    public long link = 0;
    public final long id = counter++;
    SuperClass(){
        System.out.println("Constructor SuperClass " + counter + ", link: " + link + ", id: " + id);
    }
    public void counterLink(){ link++; }
    public void dispose(){
        if(--link == 0){
            System.out.println("Delete SuperClass id " + id);
        }
    }
}
class DerivativeClass {
    public SuperClass sc;
    DerivativeClass(SuperClass sc){
        System.out.println("Constructor DerivativeClass");
        this.sc = sc;
        sc.counterLink();
    }
    public void dispose(){
        System.out.println("Delete DerivativeClass");
        sc.dispose();
    }
}

public class PolyClass {
    public static void main(String[] args) {
        SuperClass superC = new SuperClass();
        DerivativeClass[] sc = {
                new DerivativeClass(superC),
                new DerivativeClass(superC),
                new DerivativeClass(superC),
                new DerivativeClass(superC)};
        for (DerivativeClass dc: sc) {
            System.out.println("counter: " + dc.sc.counter + ", link: " + dc.sc.link + ", id: " + dc.sc.id);
        }
        for (DerivativeClass dc: sc) {
            dc.dispose();
        }

        SuperClass superC2 = new SuperClass();
        DerivativeClass[] sc2 = {
                new DerivativeClass(superC2),
                new DerivativeClass(superC2),
                new DerivativeClass(superC2),
                new DerivativeClass(superC2)};
        for (DerivativeClass dc: sc2) {
            System.out.println("counter: " + dc.sc.counter + ", link: " + dc.sc.link + ", id: " + dc.sc.id);
        }
        for (DerivativeClass dc: sc2) {
            dc.dispose();
        }
    }
}
