void main () {
    B b = new B();
    C c = new C();
    A a1 = new A();
    A a2 = new B();
    A a3 = new C();
    b.abc();
    c.abc();
    c.abc(5);
    a1.abc();
    a2.abc();
    a3.abc();
}
class A {
    int x;
    String y;
    public void abc() {
        System.out.println("abc at A");
    }
}
class B extends A {
    public void abc() {
        System.out.println("abc at B");
    }
}
class C extends A {
    public void abc(int y) {
        System.out.println("abc at C " + y);
    }
}
