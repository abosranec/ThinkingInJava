package head_19.example19_2;//: enumerated/OverrideConstantSpecific.java

public enum OverrideConstantSpecific {
  NUT, BOLT,
  WASHER {
    void f() { System.out.println("Overridden method"); }
  };
  void f() { System.out.println("default behavior"); }
  public static void main(String[] args) {
    for(OverrideConstantSpecific ocs : values()) {
      System.out.print(ocs + ": ");
      ocs.f();
    }
  }
}
