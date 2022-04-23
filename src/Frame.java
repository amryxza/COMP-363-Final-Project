import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Frame {
    JFrame window;
    JPanel titlePanel, startButtonPanel, mainTextPanel, nextButtonPanel, decisionPanel;
    JButton startButton,nextButton,decision1,decision2;
    JTextArea mainTextArea;
    JLabel title, text;
    Container con;
    String position,paths1, path2;



    Font titleFont= new Font("Times New Roman",Font.BOLD,90);
    Font startButtonFont= new Font("Times New Roman",Font.BOLD, 30);
    Font normalFont= new Font("Arial",Font.PLAIN, 28);


    Handler handel= new Handler(this);
    String PATH="src/scBegining.txt";
    File f= new File(PATH);
    Scanner scanner= new Scanner(f);






    public Frame() throws FileNotFoundException {
        window= new JFrame();
        window.setSize(800,600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.BLACK);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();


        //make title

        titlePanel = new JPanel();
        titlePanel.setBounds(100,100,600,250);
        titlePanel.setBackground(Color.blue);
        con.add(titlePanel);

        title= new JLabel("SOME GAME");
        title.setForeground(Color.white);
        title.setFont(titleFont);
        titlePanel.add(title);

        startButtonPanel= new JPanel();
        startButtonPanel.setBounds(300,400,200,60);
        startButtonPanel.setBackground(Color.blue);
        con.add(startButtonPanel);
        position= "Title";
        startButton= new JButton("START");
        startButton.setForeground(Color.white);
        startButton.setBackground(Color.BLACK);
        startButton.setFocusPainted(false);
        startButton.addActionListener(handel);
        startButton.setFont(startButtonFont);
        startButtonPanel.add(startButton);


    }

    public void mainPlayArea() {
        titlePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        position="Main";

        mainTextPanel= new JPanel();
        mainTextPanel.setBounds(100,100,600,200);
        mainTextPanel.setBackground(Color.RED);
        con.add(mainTextPanel);

        mainTextArea= new JTextArea();
        mainTextArea.setFont(normalFont);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.WHITE);
        mainTextArea.setSize(600,250);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);




        String tmp=scanner.nextLine();
        if(tmp.equals("1")){
            tmp=scanner.nextLine();
            mainTextArea.setText(tmp);
            decsisionScreen();

        }
        else {
            mainTextArea.setText(tmp);

            nextButtonPanel = new JPanel();
            nextButtonPanel.setBounds(650, 425, 100, 50);
            nextButtonPanel.setBackground(Color.BLACK);
            con.add(nextButtonPanel);

            nextButton = new JButton("Next");
            nextButton.setForeground(Color.WHITE);
            nextButton.setBackground(Color.BLACK);
            nextButton.setFocusPainted(false);
            nextButton.addActionListener(handel);
            nextButton.setFont(normalFont);
            nextButtonPanel.add(nextButton);
        }



    }

    private void decsisionScreen() {
        position="Decision";

        decisionPanel= new JPanel();
        decisionPanel.setBounds(100,300,150,100);
        decisionPanel.setLayout(new GridLayout(2,1));
        decisionPanel.setBackground(Color.RED);
        decisionPanel.setVisible(true);
        con.add(decisionPanel);


        decision1= new JButton(scanner.nextLine());
        decision1.setFocusPainted(false);
        decision1.setBackground(Color.BLACK);
        decision1.setForeground(Color.WHITE);
        decision1.addActionListener(handel);
        decision1.setActionCommand("dc1");
        decisionPanel.add(decision1);

        decision2= new JButton(scanner.nextLine());
        decision2.setFocusPainted(false);
        decision2.setBackground(Color.BLACK);
        decision2.setForeground(Color.WHITE);
        decision2.addActionListener(handel);
        decision2.setActionCommand("dc2");
        decisionPanel.add(decision2);
        paths1=scanner.nextLine();
        path2=scanner.nextLine();




    }
    public void Decision1(String str) throws FileNotFoundException {

        PATH=paths1;
        scanner=new Scanner(new File(PATH));
        decisionPanel.setVisible(false);
        mainPlayArea();
    }
    public void Decision2(String str) throws FileNotFoundException {
        PATH=path2;
        scanner=new Scanner(new File(PATH));
        decisionPanel.setVisible(false);
        mainPlayArea();
    }

}
