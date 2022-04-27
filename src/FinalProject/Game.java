package FinalProject;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;


public class Game {

    ChoiceHandler handler = new ChoiceHandler();
    UI ui = new UI();
    ScreenManager screenManager = new ScreenManager(ui);
    Story story = new Story(this,ui,screenManager);

    public static void main(String[] args) throws FileNotFoundException {
        new Game();
    }

    public Game() throws FileNotFoundException {
        ui.createUI(handler);
        screenManager.showTitleScreen();
        story.setUp();
    }


    public class ChoiceHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String yourChoice = e.getActionCommand();

            switch (yourChoice) {
                case "start":
                    screenManager.showMainText();break;
                case "next":
                    screenManager.showMainText();story.nextPressed();break;
                case "opt1":
                    screenManager.showMainText();
                    try {
                        story.pathing(1);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    break;

                case "opt2":
                    screenManager.showMainText();
                    try {
                        story.pathing(2);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    break;
                case "opt3":
                    screenManager.showMainText();
                    try {
                        story.pathing(3);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
                    break;

            }
            }
    }


}


