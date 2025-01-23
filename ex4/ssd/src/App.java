public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Essai objet=new Essai(5);
        objet.remplir();
        objet.afficher();
        System.out.println("somme egale="+objet.somme());
        System.out.println("min="+objet.min());
        System.out.println("max="+objet.max());
        System.out.println("rechercher 4="+objet.rechercher(4));
    
    }
}
