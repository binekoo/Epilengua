package Epilengua;

import javax.swing.*;

public class FinalFrame extends TemplateFrames{

    private TemplateFrames finalFrame;

    JPanel mainPanel = new JPanel();

    public FinalFrame(){
        finalFrame = new TemplateFrames("Epilengua - Your score", mainPanel);

        //TODO : ajouter un JPanel avec la couleur secondaire pour le score
        //JPanel lastPanel = new JPanel();

    }
}
