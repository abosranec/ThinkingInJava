package head_14.example14_8;

interface HasBatteries {}
interface HasBatteries2 {}

class Waterproof {}

class Shoots extends Waterproof implements HasBatteries2{}

class Toy extends Shoots{}

class FancyToy extends Toy implements HasBatteries {
  int i = 10;
  float f = 20.2f;
  double d = 20.2;
  String str = "hello";
  FancyToy() { }
  void method1(){}
  void method2(String str, int i){}
  String method3(String str){ return str; }
  static int method4(){ return 5; }
}

public class ToyTest {
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("head_14.example14_8.FancyToy");
    } catch(ClassNotFoundException e) {
      System.out.println("Can't find FancyToy");
      System.exit(1);
    }
    while(c != null){
      System.out.format("Name SuperClass: %12s, Interfaces name: ", c.getSimpleName());
      for (Class cl : c.getInterfaces()) {
        System.out.print(cl.getSimpleName() + ", ");
      }
      System.out.println();
      c = c.getSuperclass();
    }
  }
}
