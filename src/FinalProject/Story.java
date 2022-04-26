package FinalProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Story {

    String path1, path2, opt1, opt2;
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


    }

    public void nextPressed() {
        if (index == (dialog.size() - 1)) {
            ui.decision1.setText(opt1);
            ui.decision2.setText(opt2);
            sm.showDecision1();

        }
        System.out.println(dialog.get(index));
        ui.mainTextArea.setText(dialog.get(index));
        index++;


    }

    public void pathing(int i) throws FileNotFoundException {
        dialog.clear();
        if (i == 1) {
            textIN(path1);
            index=0;
        }
        if (i == 2) {
            textIN(path2);
            index=0;
        }
    }

    public void textIN(String s) throws FileNotFoundException {
        scanner = new Scanner(new File(s));
        while (scanner.hasNextLine()) {
            String tmp = scanner.nextLine();
            if (tmp.equals("???")) {
                tmp = scanner.nextLine();
                opt1 = scanner.nextLine();
                opt2 = scanner.nextLine();

                path1 = scanner.nextLine();
                path2 = scanner.nextLine();
            }

            dialog.add(tmp);

        }
        System.out.println(dialog);
        reader = new Scanner(String.valueOf(dialog));

    }
}