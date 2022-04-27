package FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Story {

    String path1, path2, opt1, opt2, flag, line, path3, opt3;
    Game game;
    UI ui;
    ScreenManager sm;
    Scanner scanner;
    ArrayList<String> dialog;
    int index = 0;


    Scanner reader;

    Player player = new Player();

    public Story(Game g, UI u, ScreenManager screenManager) throws FileNotFoundException {
        game = g;
        ui = u;
        sm = screenManager;
        dialog = new ArrayList<>();
        textIN("src/scBegining.txt");


    }

    public void setUp() {
        player.Name = "k";
        player.AcademicFocus = 0;
        player.Impulsiveness = 0;
        player.Will = -10;
        player.Kindness = 0;
        player.empathy = 0;
        ui.mainTextArea.setText("What is this?");


    }

    public void nextPressed() {
        line=dialog.get(index);
        if (index == (dialog.size() - 1)) {
            if(flag.equals("XXX")){

                    cleanDialog();
                try {
                    textIN(path1);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }

            }
            if(flag.equals("???") || flag.equals("@@@")) {
                ui.decision1.setText(opt1);
                ui.decision2.setText(opt2);
                sm.showDecision1();
            }
            if (flag.equals(dialog.get(index))){

                    sm.DemoEnd();

            }
            if(flag.equals("###")){
                ui.d1.setText(opt1);
                ui.d2.setText(opt2);
                ui.d3.setText(opt3);
                sm.showDecision3();
            }

        }

        ui.mainTextArea.setText(line);
        index++;


    }

    public void pathing(int i) throws FileNotFoundException {

        if (i == 1) {
            cleanDialog();
            textIN(path1);
        }
        else if (i == 2) {
            cleanDialog();
            textIN(path2);

        }
        else if (i == 3) {
            cleanDialog();
            textIN(path3);

        }

    }

    public void textIN(String s) throws FileNotFoundException {
        scanner = new Scanner(new File(s));
        while (scanner.hasNextLine()) {
            String tmp = scanner.nextLine();
            if (tmp.equals("???")) {
                flag = tmp;

                tmp = scanner.nextLine();
                opt1 = scanner.nextLine();
                opt2 = scanner.nextLine();

                path1 = scanner.nextLine();
                path2 = scanner.nextLine();


            }
            else if (tmp.equals("###")) {
                flag = tmp;
                tmp = scanner.nextLine();
                opt1 = scanner.nextLine();
                opt2 = scanner.nextLine();
                opt3 = scanner.nextLine();

                path1 = scanner.nextLine();
                path2 = scanner.nextLine();
                path3 = scanner.nextLine();


            }
            else if(tmp.equals("XXX")){
                flag=tmp;
                path1 = scanner.nextLine();
                tmp=":(";

            }
            else if(tmp.equals("***")){
                flag = tmp;

            }
            else if(tmp.equals("@@@")){
                flag = tmp;
                tmp = scanner.nextLine();
                opt1 = scanner.nextLine();
                opt2 = scanner.nextLine();
                path1 = scanner.nextLine();
                path2 = path1;

            }


            dialog.add(tmp);

        }

        reader = new Scanner(String.valueOf(dialog));

    }
    public void cleanDialog(){
        dialog.clear();
        index=0;


    }
}