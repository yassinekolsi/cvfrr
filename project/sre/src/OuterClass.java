public class OuterClass {
    public class Innerclass{
        int x;
        String y;
        public Innerclass(int x){
            this.x=x;
        }
        void print(){
            System.out.println("x="+x);
        }
    }
}
