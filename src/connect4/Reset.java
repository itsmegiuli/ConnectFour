package connect4;

import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class Reset {
    /**
     * ## RESET/PLAY AGAIN: needs to be fixed. doesn´t work completely
     * Button fx:id="reset" <<--- currently not visible
     */




    public static void fullCol(Label fullCol) {
        fullCol.setVisible(true);
        MakeMove.counterForSwitchingPlayer--;
    }

    public static void fullColReset(Label fullCol) {
        if (fullCol.isVisible()) {
            fullCol.setVisible((false));
        }
    }
}
