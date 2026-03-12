void main () {
    A a1 = new C();
    A a2 = new B();
    A a3 = new A();
    MMM m = new MMM();
    m.ppp(a2);
    m.ppp(a1);
    m.ppp(a3);
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
    public void ppp(A a) {
        if (a instanceof B)
            System.out.println("yoohoo B");
        else if (a instanceof C)
            System.out.println("yoohoo C");
        else if (a instanceof A)
            System.out.println("yoohoo A");
    }
}