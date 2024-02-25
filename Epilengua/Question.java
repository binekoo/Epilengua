package Epilengua;

public class Question {
    private String question;

    private Reponse[] reponses = new Reponse[4];

    private String explication;

    //Todo : ajouter attribut "explication" puis les ajouter aux JOptionPanes

    public Question(String question, Reponse reponse1, Reponse reponse2, Reponse reponse3, Reponse reponse4, String explication) {
        this.question = question;

        //Création des réponses :
        this.reponses[0] = reponse1;
        this.reponses[1] = reponse2;
        this.reponses[2] = reponse3;
        this.reponses[3] = reponse4;

        this.explication = explication;
    }

    public Reponse getReponse(int index) {
        return reponses[index];
    }

    public void setReponse(){

    }

    public String getExplication() {
        return explication;
    }

    public String getQuestion() {
        return question;
    }

    public Question(String question){
        this.question = question;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append(question).append("\n");

        char option = 'a';
        for (Reponse reponse : reponses) {
            result.append(option).append(") ").append(reponse.getTexte()).append("\n");
            option++;
        }

        return result.toString();
    }
}
