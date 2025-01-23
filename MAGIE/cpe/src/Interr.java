public interface Interr {
int i=5;
private void hi(){
    System.out.println("bjr");
}
    void implementer();
    default void methodepardef(){
        System.out.println("hiiii");
        hi();
    }
    static void methodestatique(){
        System.out.println("hi");
    }
}
