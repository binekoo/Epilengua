package Epilengua;

public class Epilengua{
    //Classe principale du jeu :

    public static void main(String[] args) {
        HomeGame game = new HomeGame();
        for (int i = 0; i < GameSet.questions.length; i++){
            System.out.print(GameSet.questions[i]);
        }
    }
}
