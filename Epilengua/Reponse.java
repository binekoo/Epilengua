package Epilengua;

public class Reponse {
    private boolean correcte;
    private String texte;

    public void setTexte(String texte) {
        this.texte = texte;
    }

    public String getTexte() {
        return texte;
    }

    public Reponse(String texte, boolean correcte) {
        this.texte = texte;
        this.correcte = correcte;
    }

}
