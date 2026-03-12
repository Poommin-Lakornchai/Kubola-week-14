void main () {
    B b1 = new B();
    C c1 = new C();
    MMM m = new MMM();
    m.ppp(c1);
    m.ppp(b1);
}
class A {
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
class MMM {
    public void ppp(B b) {
        System.out.println("yoohoo B");
    }
    public void ppp(C c) {
        System.out.println("yoohoo C");
    }
}
