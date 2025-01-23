public class Math {
    int val;
    public Math(int n){
        this.val=n;
    }
    public Math(){}
    Math add(Math obj1){
        Math obj2=new Math();
        obj2.val=obj1.val+this.val;
        return obj2;
    }
    boolean isEqual(Math obj1){
        return this.val==obj1.val;
    }
}
