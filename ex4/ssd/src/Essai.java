import java.lang.Math;
import java.util.Arrays;
import java.util.Random;
public class Essai {
    int [] T;
    Essai(int n){
        T=new int[n];
    }
    public void remplir(){
        Random r=new Random();
        for(int i=0;i<T.length;i++){
            T[i]=r.nextInt(101);
        }
    }
    public void afficher(){
        for(int i:T){
            System.out.println(i);
        }
    }
    public int somme(){
        int s=0;
        for(int i:T){
            s+=i;
        }
        return s;
    }
    public int min(){
        Arrays.sort(T);
        return T[0];
    }
    public int max(){
        Arrays.sort(T);
        return T[T.length-1];
    }
    public int rechercher(int x){
        for(int i=0;i<T.length;i++){
            if(T[i]==x) return 1;
        }
        return 0;
    }

}
