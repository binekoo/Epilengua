package Epilengua;

import javax.swing.*;

public class FinalFrame extends TemplateFrames{

    private TemplateFrames finalFrame;

    JPanel mainPanel = new JPanel();

    public FinalFrame(){
        finalFrame = new TemplateFrames("Epilengua - Your score", mainPanel);
        //JPanel lastPanel = new JPanel();

    }
}
