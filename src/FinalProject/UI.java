package FinalProject;

import javax.swing.*;
import java.awt.*;






public class UI {
    JFrame window;
    JPanel titlePanel, startButtonPanel, mainTextPanel, nextButtonPanel,decisionPanel;
    JButton startButton,nextButton,decision1,decision2;
    JLabel title;
    JTextArea mainTextArea;
    Font titleFont= new Font("Times New Roman",Font.BOLD,90);
    Font startButtonFont= new Font("Times New Roman",Font.BOLD, 30);
    Font normalFont= new Font("Arial",Font.PLAIN, 28);
    int index=0;





    public void createUI(Game.ChoiceHandler choiceHandler ){
        //window for the game
        window= new JFrame();
        window.setSize(800,600);
        window.setTitle("SomeGame v.2");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);


        //make title

        titlePanel = new JPanel();
        titlePanel.setBounds(50,100,650,250);
        titlePanel.setBackground(Color.black);
        window.add(titlePanel);

        title= new JLabel("SOMEGAMEv2");
        title.setForeground(Color.white);
        title.setFont(titleFont);
        titlePanel.add(title);

        startButtonPanel= new JPanel();
        startButtonPanel.setBounds(300,400,200,60);
        startButtonPanel.setBackground(Color.black);
        window.add(startButtonPanel);
        startButton= new JButton("START");
        startButton.setForeground(Color.white);
        startButton.setBackground(Color.BLACK);
        startButton.setFocusPainted(false);
        startButton.addActionListener(choiceHandler);
        startButton.setActionCommand("start");
        startButton.setFont(startButtonFont);
        startButtonPanel.add(startButton);


        //Main text area
        mainTextPanel= new JPanel();
        mainTextPanel.setBounds(100,100,600,200);
        mainTextPanel.setBackground(Color.RED);
        window.add(mainTextPanel);

        mainTextArea= new JTextArea();
        mainTextArea.setFont(normalFont);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setSize(600,250);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);





        nextButtonPanel = new JPanel();
        nextButtonPanel.setBounds(650, 425, 100, 50);
        nextButtonPanel.setBackground(Color.BLACK);

        nextButton = new JButton("Next");
        nextButton.setForeground(Color.WHITE);
        nextButton.setBackground(Color.BLACK);
        nextButton.setFocusPainted(false);
        nextButton.addActionListener(choiceHandler);
        nextButton.setActionCommand("next");
        nextButton.setFont(normalFont);
        nextButtonPanel.add(nextButton);
        window.add(nextButtonPanel);



        decisionPanel= new JPanel();
        decisionPanel.setBounds(100,300,150,100);
        decisionPanel.setLayout(new GridLayout(2,1));
        decisionPanel.setBackground(Color.RED);
        window.add(decisionPanel);


        decision1= new JButton();
        decision1.setFocusPainted(false);
        decision1.setBackground(Color.BLACK);
        decision1.setForeground(Color.WHITE);
        decision1.addActionListener(choiceHandler);
        decision1.setActionCommand("opt1");
        decisionPanel.add(decision1);

        decision2= new JButton();
        decision2.setFocusPainted(false);
        decision2.setBackground(Color.BLACK);
        decision2.setForeground(Color.WHITE);
        decision2.addActionListener(choiceHandler);
        decision2.setActionCommand("opt2");
        decisionPanel.add(decision2);

        window.setVisible(true);


    }

}
