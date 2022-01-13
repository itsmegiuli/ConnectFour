package connect4;

import javafx.scene.control.Label;

public class Reset {

    public static void reset() { // when "reset/play again" button click, everything needs to start again

        MakeMove.counterForSwitchingPlayer = 1; //number of turns are reset to 1
        MakeMove.counterCol0 = 0; //counterCOl 0 -6 need to be 0 again
        MakeMove.counterCol1 = 0;
        MakeMove.counterCol2 = 0;
        MakeMove.counterCol3 = 0;
        MakeMove.counterCol4 = 0;
        MakeMove.counterCol5 = 0;
        MakeMove.counterCol6 = 0;
        MakeMove.col0 = 5; //col0-6 need to start from 5 down again
        MakeMove.col1 = 5;
        MakeMove.col2 = 5;
        MakeMove.col3 = 5;
        MakeMove.col4 = 5;
        MakeMove.col5 = 5;
        MakeMove.col6 = 5;


        // we need a gameBoard exactly like at the beginning, with no X or O from the previous game
        Main.gameBoard = new char[][]{
                {'a', 'b', 'c', 'd', 'e', 'f', 'g'},
                {'h', 'i', 'j', 'k', 'l', 'm', 'n'},
                {'o', 'p', 'q', 'r', 's', 't', 'u'},
                {'v', 'w', 'x', 'y', 'z', 'A', 'B'},
                {'C', 'D', 'E', 'F', 'G', 'H', 'I'},
                {'J', 'K', 'L', 'M', 'N', 'P', 'Q'},
                {'R', 'S', 'T', 'U', 'V', 'W', 'Y'},
        };

    }


    //If a player wants to put a "chip" in a column that is already full, a message will be displayed informing the user.
    //so that the "move" doesn't mean the player lost a turn, counterForSwitchingPlayer needs to be reduced by 1.
    public static void fullCol(Label fullCol) {
        fullCol.setVisible(true); // text="That column is full! Try another one."
        MakeMove.counterForSwitchingPlayer--;
    }

    //the message will disappear as soon a you play a not-full column
    //fullColl is setVisible(false) by default
    public static void fullColReset(Label fullCol) {
        if (fullCol.isVisible()) {
            fullCol.setVisible((false));
        }
    }
}
