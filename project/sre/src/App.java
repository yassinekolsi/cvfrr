import java.util.Scanner;
public class App {
    static int x;

    public static void main(String[] args) throws Exception {
        
        Student s1=new Student("ali","1234");
        Student s2=new Student("hama","3456");
        OuterClass obj= new OuterClass();
        OuterClass.Innerclass obj1= obj.new Innerclass(24);
        obj1.print();

    }
}
