public class main {
    public static void main(String[] args){
        Couleur couleur = Couleur.JAUNE;
        System.out.println(couleur.toString(Style.ITALIQUE, Style.GRAS, Style.EXPOSANT));
        //System.out.println(couleur.getCodeHTML());
        //Couleur.affiche();

        System.out.println();

        Style style1 = Style.GRAS;
        System.out.println(style1.appliqueA("Chancy est beau"));
        System.out.println(style1);



    }
}
