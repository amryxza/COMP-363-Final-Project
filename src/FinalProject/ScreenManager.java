package FinalProject;

public class ScreenManager {
    UI ui;

    public ScreenManager(UI a){
        ui=a;
    }
    public void showTitleScreen(){
        clear();
        ui.titlePanel.setVisible(true);
        ui.startButtonPanel.setVisible(true);

    }
    public void showMainText(){
        clear();
        ui.mainTextPanel.setVisible(true);
        ui.nextButtonPanel.setVisible(true);
        ui.index++;

    }

    public void showDecision1(){
        clear();
        showMainText();
        ui.decisionPanel.setVisible(true);
        ui.nextButtonPanel.setVisible(false);

    }

    public void clear(){
        //title
        ui.titlePanel.setVisible(false);
        ui.startButtonPanel.setVisible(false);
        //main area
        ui.nextButtonPanel.setVisible(false);
        ui.mainTextPanel.setVisible(false);
        //choices
        ui.decisionPanel.setVisible(false);
    }

}
