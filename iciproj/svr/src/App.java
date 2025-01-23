import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Math obj1=new Math(5);
        Math obj2=new Math(0);
        Math obj3=new Math();
        obj3=obj1.add(obj2);
        System.out.println(obj3.isEqual(obj1));
    }
}
