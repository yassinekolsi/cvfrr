import java.util.Scanner;
import java.io.*;
public class ChaineEtPalindrome {
    String chaine;
    public ChaineEtPalindrome(){
        Scanner x=new Scanner(System.in);
        chaine=x.next();
    }
    public void afficher(){
        System.out.println(chaine);
    }
    public String inverse(){
        String nstr="";
        char ch;
        for(int i=0;i<chaine.length();i++){
            ch=chaine.charAt(i);
            nstr=ch+nstr;
        }
        return nstr;

    }
    public boolean estpalindrome(){
        if (chaine.equals(inverse()) )return true;
        else return false;
    }
}
