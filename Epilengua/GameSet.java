package Epilengua;

public class GameSet {
    public static Question[] questions = new Question[5];

    public void setQuestions(Question question) {
       for(int i = 0; i < questions.length; i++){
           if(questions[i] == null)
                questions[i] = question;
                break;
       }
    }

    public GameSet(){
        Question question1 = new Question("___ libro es interesante. (Le livre est intéressant)",
                new Reponse("Mi", false),
                new Reponse("Su", false),
                new Reponse("El", true),
                new Reponse("Tu", false));

        Question question2 = new Question("Voy a  al parque mañana.",
                new Reponse("Jugar", false),
                new Reponse("Comer", false),
                new Reponse("Correr", false),
                new Reponse("Visitar", true));

        Question question3 = new Question("No puedo encontrar mis .",
                new Reponse("Amigos", false),
                new Reponse("Llaves", true),
                new Reponse("Zapatos", false),
                new Reponse("Perro", false));

        Question question4 = new Question("Ella siempre  tarde a la escuela.",
                new Reponse("Come", false),
                new Reponse("Llega", true),
                new Reponse("Estudia", false),
                new Reponse("Baila", false));

        Question question5 = new Question(" café por la mañana.",
                new Reponse("Bebo", true),
                new Reponse("Como", false),
                new Reponse("Juego", false),
                new Reponse("Bailo", false));

        setQuestions(question1);
        setQuestions(question2);
        setQuestions(question3);
        setQuestions(question4);
        setQuestions(question5);
    }

}