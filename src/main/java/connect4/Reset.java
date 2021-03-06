package connect4;

import javafx.scene.control.Label;

public class Reset {

    protected static void reset() { // when the "reset/play again" - button is clicked, the game restarts

        MakeMove.counterForSwitchingPlayer = 0; //number of turns is 0 so red starts this time
        MakeMove.counterCol0 = 0; //counterCOl 0-6 needs to be 0 again
        MakeMove.counterCol1 = 0;
        MakeMove.counterCol2 = 0;
        MakeMove.counterCol3 = 0;
        MakeMove.counterCol4 = 0;
        MakeMove.counterCol5 = 0;
        MakeMove.counterCol6 = 0;
        MakeMove.col0 = 6; //col0-6 needs to go downwards from 6 again
        MakeMove.col1 = 6;
        MakeMove.col2 = 6;
        MakeMove.col3 = 6;
        MakeMove.col4 = 6;
        MakeMove.col5 = 6;
        MakeMove.col6 = 6;

        // we need the same gameBoard as the one from the beginning, X´s and O´s need to be removed again from the previous game
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

    //If a player wants to place a "chip" in a column that is already full, a message will appear to inform the player.
    //so that the "move" doesn't mean the player lost a turn: counterForSwitchingPlayer needs to be reduced by 1.
    protected static void fullCol(Label fullCol) {
        fullCol.setVisible(true);
        MakeMove.counterForSwitchingPlayer--;
    }

    //the message will disappear as soon as the player chooses a "not-full" column
    //fullCol is setVisible(false) by default
    protected static void fullColReset(Label fullCol) {
        if (fullCol.isVisible()) {
            fullCol.setVisible((false));
        }
    }

    //the message of "It´s a Draw" will disappear
    protected static void drawReset(Label draw) {  //resets the game after a draw
        if (draw.isVisible()) {
            draw.setVisible((false));
        }
    }
}