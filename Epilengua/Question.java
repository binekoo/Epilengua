package Epilengua;

public class Question {
    private String question;

    private Reponse[] reponses = new Reponse[4];

    private String correcton;

    public Question(String question, Reponse reponse1, Reponse reponse2, Reponse reponse3, Reponse reponse4) {
        this.question = question;

        //Création des réponses :
        this.reponses[0] = reponse1;
        this.reponses[1] = reponse2;
        this.reponses[2] = reponse3;
        this.reponses[3] = reponse4;
    }

    public void setReponse(){

    }

    public String getQuestion() {
        return question;
    }

    public Question(String question){
        this.question = question;
    }
}
