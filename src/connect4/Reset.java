package connect4;

import javafx.scene.control.Label;

public class Reset {
    /**
     * ## RESET/PLAY AGAIN: needs to be fixed. doesn´t work completely
     * @param fullCol
     * Button fx:id="reset" <<--- currently not visible
     */
    /*
    public void reset(ActionEvent reset) {
        // Circle circle = this.newChip;

        playGround.getChildren().clear();
        //playGround.getChildren().removeAll(newChip);
        this.gameBoard = new char[][]{
                {'a', 'b', 'c', 'd', 'e', 'f', 'g'},
                {'h', 'i', 'j', 'k', 'l', 'm', 'n'},
                {'o', 'p', 'q', 'r', 's', 't', 'u'},
                {'v', 'w', 'x', 'y', 'z', 'A', 'B'},
                {'C', 'D', 'E', 'F', 'G', 'H', 'I'},
                {'J', 'K', 'L', 'M', 'N', 'P', 'Q'},
                {'R', 'S', 'T', 'U', 'V', 'W', 'Y'},
        };
        System.out.println("reseted");

    }*/


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
