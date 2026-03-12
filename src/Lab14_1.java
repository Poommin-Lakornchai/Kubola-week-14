void main () {
    A a = new A();
    a.abc();
    a.abc(9,3);
}
class A {
    public void abc() {
        System.out.println("abc at A");
    }
    public void abc(int x) {
        System.out.println("abc at A " + x);
    }
    public void abc(int x, int y) {
        System.out.println("abc at A " + x + " " + y);
    }
}
