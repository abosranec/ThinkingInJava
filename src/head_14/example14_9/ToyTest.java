package head_14.example14_9;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

interface HasBatteries {}

interface Waterproof {}

interface Shoots {}

class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {}
  Toy(int i) {}
}

class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots {
  int i = 10;
  float f = 20.2f;
  double d = 20.2;
  String str = "hello";
  public FancyToy() { } // class is not public
  public void method1(){}
  public void method2(String str, int i){}
  public String method3(String str){ return str; }
  public static int method4(){ return 5; }
  private void method5(){ }
}

public class ToyTest {
  static void printFields(Class c) {
    int i = 0;
    System.out.println("Fields for class \"" + c.getCanonicalName() + "\"");
    for (Field f : c.getDeclaredFields()) {
      System.out.format("Field %2d: %5s, class %10s\n", i++, f.getName(), f.getType().getSimpleName());
    }
  }
  static void printMethod(Class c) {
    int i = 0;
    System.out.println("Method for class \"" + c.getCanonicalName() + "\"");
    for (Method f : c.getMethods()) {
      //System.out.println(f.toString());
      System.out.format("Method %2d: name: %90s; return type: %7s; Parameters: ",
              i++, f.toString(), f.getReturnType().getSimpleName());
      for (Parameter p : f.getParameters()) {
        System.out.format("%5s (%s), ", p.getName(), p.getType().getSimpleName());
      }
      System.out.format("\n");
    }
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("head_14.example14_9.FancyToy");
    } catch(ClassNotFoundException e) {
      System.out.println("Can't find FancyToy");
      System.exit(1);
    }
    printFields(c);
    printMethod(c);
  }
}
