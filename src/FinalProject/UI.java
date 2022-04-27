package FinalProject;

import javax.swing.*;
import java.awt.*;






public class UI {
    JFrame window;
    JPanel titlePanel, startButtonPanel, mainTextPanel, nextButtonPanel,decisionPanel, demoEndPannel, decision3Panel, menuReturnPanel ;
    JButton startButton,nextButton,decision1,decision2,d1,d2, d3, menuReturn;
    JLabel title,demoEnd;
    JTextArea mainTextArea;
    Font titleFont= new Font("Times New Roman",Font.BOLD,90);
    Font startButtonFont= new Font("Times New Roman",Font.BOLD, 30);
    Font normalFont= new Font("Arial",Font.PLAIN, 28);





    public void createUI(Game.ChoiceHandler choiceHandler ){
        //window for the game
        window= new JFrame();
        window.setSize(800,600);
        window.setTitle("SomeGame v.3");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);


        //make title

        titlePanel = new JPanel();
        titlePanel.setBounds(50,100,650,250);
        titlePanel.setBackground(Color.black);
        window.add(titlePanel);

        title= new JLabel("SOMEGAMEv3");
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
        mainTextPanel.setBackground(Color.BLACK);
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
        decisionPanel.setBounds(100,300,300,150);
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

        demoEndPannel = new JPanel();
        demoEndPannel.setBounds(100,100,600,250);
        demoEndPannel.setBackground(Color.blue);
        window.add(demoEndPannel);

        demoEnd = new JLabel("ROUTE END");
        demoEnd.setForeground(Color.white);
        demoEnd.setFont(titleFont);
        demoEndPannel.add(demoEnd);

        decision3Panel = new JPanel();
        decision3Panel.setBackground(Color.yellow);
        decision3Panel.setBounds(100,300,400,200);
        decision3Panel.setLayout(new GridLayout(3,1));

        d1= new JButton();
        d1.setFocusPainted(false);
        d1.setBackground(Color.BLACK);
        d1.setForeground(Color.WHITE);
        d1.addActionListener(choiceHandler);
        d1.setActionCommand("opt1");

        d2= new JButton();
        d2.setFocusPainted(false);
        d2.setBackground(Color.BLACK);
        d2.setForeground(Color.WHITE);
        d2.addActionListener(choiceHandler);
        d2.setActionCommand("opt2");

        d3 = new JButton();
        d3.setFocusPainted(false);
        d3.setForeground(Color.white);
        d3.setBackground(Color.black);
        d3.addActionListener(choiceHandler);
        d3.setActionCommand("opt3");

        decision3Panel.add(d1);
        decision3Panel.add(d2);
        decision3Panel.add(d3);

        window.add(decision3Panel);

        menuReturnPanel= new JPanel();
        menuReturnPanel.setBounds(300,400,200,60);
        menuReturnPanel.setVisible(false);
        menuReturnPanel.setBackground(Color.black);
        window.add(menuReturnPanel);
        menuReturn= new JButton("Return");
        menuReturn.setForeground(Color.white);
        menuReturn.setBackground(Color.BLACK);
        menuReturn.setFocusPainted(false);
        menuReturn.addActionListener(choiceHandler);
        menuReturn.setActionCommand("return");
        menuReturn.setFont(startButtonFont);
        menuReturnPanel.add(menuReturn);




        window.setVisible(true);


    }

}
