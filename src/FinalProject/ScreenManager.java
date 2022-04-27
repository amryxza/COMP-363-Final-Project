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


    }

    public void showDecision1(){
        clear();
        showMainText();
        ui.decisionPanel.setVisible(true);
        ui.nextButtonPanel.setVisible(false);

    }
    public void DemoEnd(){
        clear();
        ui.demoEndPannel.setVisible(true);
        ui.menuReturnPanel.setVisible(true);

    }
    public void showDecision3(){
        clear();
        ui.mainTextPanel.setVisible(true);
        ui.decision3Panel.setVisible(true);
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
        // end
        ui.demoEndPannel.setVisible(false);
        //three decisions
        ui.decision3Panel.setVisible(false);
        //restart button
        ui.menuReturnPanel.setVisible(false);

    }



}
