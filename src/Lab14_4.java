void main () {
    B b = new B();
    C c = new C();
    b.abc();
    c.abc();
    c.abc(5);
}
class A {
    int x;
    String y;
    public A() {
        System.out.println("con A1");
    }
    public A(int x1) {
        System.out.println("con A2");
    }
    public void abc() {
        System.out.println("abc at A");
    }
}
class B extends A {
    public B() {
        System.out.println("con B");
    }
    public void abc() {
        System.out.println("abc at B");
    }
}
class C extends A {
    public C() {
        System.out.println("con C");
    }
    public void abc(int y) {
        System.out.println("abc at C " + y);
    }
}
