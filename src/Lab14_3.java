void main () {
    B  b = new B();
    b.abc();
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
