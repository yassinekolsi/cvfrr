public class App {
    class Pokemon {
        public void chuchu() {
            System.out.println("Pokemon fait chuchu");
        }
    
        public static void pikapika() {
            System.out.println("Pokemon fait pikapika");
        }
    }
    
    class Pikachu extends Pokemon {
        public void chuchu(){
            System.out.println("pikachu fait chuchu");
        }
        public static void pikapika() {
            System.out.println("pikachu fait pikapika");
        }
    }
    
    public static void main(String[] args) throws Exception {
        Pokemon m=new Pokemon();
        System.out.println("hello");
    }
}
