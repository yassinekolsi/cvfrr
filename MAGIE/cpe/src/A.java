public class A {
    void m(A a) {
        System.out.println("Je suis un m de a de A");
    }

    void m(B b) {
        System.out.println("Je suis un m de b de A");
    }
}

public class B extends A {
    void m(A a) {
        System.out.println("Je suis un m de a de B");
    }

    void m(B b) {
        System.out.println("Je suis un m de b de B");
    }
}

public class App {
    public static void main(String[] args) {
        A ab = new B();
        ab.m(ab);
    }
}