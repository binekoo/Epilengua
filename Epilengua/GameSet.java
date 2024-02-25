package Epilengua;

public class GameSet {
    public static Question[] questions = new Question[5];

    public void setQuestions(Question question) {
       for(int i = 0; i < questions.length; i++){
           if(questions[i] == null) {
               questions[i] = question;
               break;
           }
       }
    }

    public static Reponse getReponse(int indexQuestion, int indexReponse){
        return questions[indexQuestion].getReponse(indexReponse);
    }


    public GameSet(){
        Question question1 = new Question("___ gato es muy lindo. (Le chat est très mignon)",
                new Reponse("Mi", false),
                new Reponse("Su", false),
                new Reponse("El", true),
                new Reponse("Nuestro", false),
                "<html>En espagnol, \"gato\" est masculin, donc on utilise l'article masculin \"el\".<br>Donc la phrase correcte est \"El gato es muy lindo\" qui signifie \"Le chat est très mignon\".</html>"
        );

        Question question2 = new Question("____ libros son interesantes. (Les livres sont intéressants)",
                new Reponse("Mi", false),
                new Reponse("Tus", false),
                new Reponse("Sus", false),
                new Reponse("Mis", true),
                "<html>\"Libros\" est masculin pluriel, donc on utilise \"mis\" qui est l'adjectif possessif pour \"mes\" livres.<br>Donc la phrase complète est \"Mis libros son interesantes\" qui signifie \"Mes livres sont intéressants\".</html>"
        );

        Question question3 = new Question("Mi hermana ____ bailar salsa. (Ma soeur aime danser la salsa)",
                new Reponse("Gusta", false),
                new Reponse("Quiero", false),
                new Reponse("Baila", true),
                new Reponse("Come", false),
                "<html>\"Baila\" signifie \"danse\" en espagnol.<br>Donc la phrase complète est \"Mi hermana baila salsa\" qui signifie \"Ma soeur danse la salsa\".</html>"
                );

        Question question4 = new Question("____ deportes son emocionantes. (Les sports sont excitants)",
                new Reponse("Mis", false),
                new Reponse("Nuestros", false),
                new Reponse("Sus", true),
                new Reponse("Tu", false),
                "<html>\"Deportes\" est masculin pluriel, donc on utilise \"sus\" qui est l'adjectif possessif pour \"leurs\" sports.<br>Donc la phrase complète est \"Sus deportes son emocionantes\" qui signifie \"Leurs sports sont excitants\".</html>"
                );

        Question question5 = new Question("Ellos ____ en la playa. (Ils marchent sur la plage)",
                new Reponse("Bailan", false),
                new Reponse("Comen", false),
                new Reponse("Corren", false),
                new Reponse("Caminan", true),
                "<html>\"Caminan\" signifie \"marchent\" en espagnol.<br>Donc la phrase complète est \"Ellos caminan en la playa\" qui signifie \"Ils marchent sur la plage\".</html>"
                );

        setQuestions(question1);
        setQuestions(question2);
        setQuestions(question3);
        setQuestions(question4);
        setQuestions(question5);
    }

}