import com.sun.tools.javac.Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

public class Handler implements ActionListener {
    Frame gameFrame;

    public Handler(Frame f){
        gameFrame=f;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String choice= e.getActionCommand();

        switch (gameFrame.position){
            case"Title":
                gameFrame.mainPlayArea();
            case"Main": gameFrame.mainPlayArea();

            case"Decision": switch (choice){
                case "dc1":
                    try {
                        gameFrame.Decision1(gameFrame.paths1);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }

                case "dc2":
                    try {
                        gameFrame.Decision2(gameFrame.paths1);
                    } catch (FileNotFoundException ex) {
                        ex.printStackTrace();
                    }
            }


        }



    }
}
