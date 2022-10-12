public enum Style {
    ITALIQUE("<i>", "</i>"),
    GRAS("<b>", "</b>"),
    EXPOSANT("<sup>", "</sup>");

    private String balise_ouvrante;
    private  String balise_fermante;

    private Style(String balise_ouvrante, String balise_fermante){
        this.balise_ouvrante = balise_ouvrante;
        this.balise_fermante = balise_fermante;
    }

    public String getBalise_ouvrante(){
        return balise_ouvrante;
    }

    public  String getBalise_fermante(){
        return balise_fermante;
    }

    public String appliqueA(String s){
        return balise_ouvrante + s + balise_fermante;
    }

    public String toString(){
        return super.toString().toLowerCase();
    }




}
