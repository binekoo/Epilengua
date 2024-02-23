package Epilengua;

import javax.swing.*;
import java.awt.*;

public class TemplateFrames extends JFrame {

    private int width = 900;

    private int height = 600;

    private String mainColor = "#F3D7CA";
    private String secondaryColor = "#E6A4B4";


    //Acesseurs :
    public String getSecondaryColor() {
        return secondaryColor;
    }

    public String getMainColor() {
        return mainColor;
    }

    public TemplateFrames(){

    }

    public TemplateFrames(String title, JPanel mainPanel){
        setTitle(title);
        setSize(width, height);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        mainPanel.setBackground(Color.decode(mainColor));
        getContentPane().add(mainPanel);

        setVisible(true);
    }

}
