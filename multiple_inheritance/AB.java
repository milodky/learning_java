interface A {
  void a();
}

interface B {
  void b();
}

public class AB implements A, B {
  public void a() {
    System.out.println("a");
  }
  public void b() {
    System.out.println("b");
  }
  public static void main(String args[]) {
    AB ab = new AB();
    ab.a();
    ab.b();
  }
}
