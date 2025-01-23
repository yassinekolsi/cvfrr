class A {
    protected int a = 1;

    public A() {
        System.out.println("A");
    }

    public void a() {
        System.out.println(a);
    }}

    interface C {
        public final int a = 3;

        public void a();
    }


public class B extends A implements C {
    private int a = 2;

    public B() {
        System.out.println("B");
    }

    public void a() {
        System.out.println(a);
    }
    public void printAFromC() {
        C c = (C) this; // Cast 'this' (which is a B object) to interface C
        System.out.println("A from C: " + c.a); // Accessing the 'a' from interface C
    }

    public static void main(String[] t) {
        A o1 = new A();
        A o2 = new B();
        B o3 = new B();
        A o4=(B)o3;
     // This line will result in a compilation error

        System.out.println(o1.a);
        System.out.println(o2.a);
        System.out.println(o3.a);
        System.out.println(o4.a);

        o1.a();
        o2.a();
        o3.a();
        o4.a();
        C objC = (C) o2; // Cast o2 (which is of type A but actually an instance of B) to interface C
System.out.println(objC.a); 
o3.printAFromC();
    }
}