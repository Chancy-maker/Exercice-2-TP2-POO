

/**
 * Enumeration qui definit les 5 couleurs BLANC, NOIR, ROUGE, JAUNE et BLEU.
 * La description textuelle d'une couleur correspond a le valeur de l'enumeration en lettres minuscules,
 * par exemple "rouge" pour la valeur ROUGE. A chaque valeur est associe le code couleur HTML correspondant,
 * par exemple "#FFFFFF" pour la valeur BLANC.
 * @author L. Torres
 *
 */
public enum Couleur {
    BLANC("#FFFFFF"), NOIR("#191919"), ROUGE("#FF0000"), JAUNE("#FFD940"), BLEU("#495CFF");

    /**
     * Code couleur HTML de la couleur.
     */
    private final String codeHTML;

    /**
     * Creation de la couleur en precisant son code de couleur HTML.
     * @param c code HTML de la couleur.
     */
    private Couleur(String c) {
        codeHTML = c;
    }

    /**
     * Renvoie le code couleur HTML de la couleur courante.
     * @return le code couleur HTML de la couleur courante.
     */
    public String getCodeHTML() {
        return codeHTML;
    }

    /**
     * Renvoie une chaine de caracteres formme du nom de la couleur en
     * lettres minuscules.
     * @return la chaine de caracteres formme du nom de la couleur en
     * lettres minuscules.
     */
    @Override public String toString() {
        return super.toString().toLowerCase();
    }



    /**
     * Affiche les 5 couleurs avec leur nom, leur numero d'ordre et leur code couleur HTML.
     * L'affichage se fait avec une ligne par couleur.
     */
    public static void affiche() {
        for (Couleur c : Couleur.values()) {
            System.out.printf("%5s %d %s\n", c, c.ordinal(), c.codeHTML);
        }
    }

    /**
     * Ce toString est une deuxième méthode ce n'est pas la même méthode que toString avec le overide carrr elle,
     * elle hérite directement de l'obet Objet o.
     * @param styles
     * @return
     */
    public String toString(Style ... styles) { // Créer des méthode avec des argument indéterminé mais de même type
        String couleur = super.toString().toLowerCase();
        for (int i = 0; i < styles.length; i++) {
            //couleur = styles[i].getBalise_ouvrante() + couleur + styles[i].getBalise_fermante();
            couleur = styles[i].appliqueA(couleur);
        }
        return couleur;
    }
}

