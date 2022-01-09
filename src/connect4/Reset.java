package connect4;

import javafx.scene.control.Label;

public class Reset {

    public static void fullCol(Label fullCol) {
        fullCol.setVisible(true);
        MakeMove.counterForSwitchingPlayer--;
    }

    public static void fullColReset(Label fullCol) {
        if (fullCol.isVisible()) {
            fullCol.setVisible((false));
        }
    }

    public static void reset() {

        MakeMove.counterForSwitchingPlayer = 1;
        MakeMove.counterCol0 = 0;
        MakeMove.counterCol1 = 0;
        MakeMove.counterCol2 = 0;
        MakeMove.counterCol3 = 0;
        MakeMove.counterCol4 = 0;
        MakeMove.counterCol5 = 0;
        MakeMove.counterCol6 = 0;
        MakeMove.col0 = 5;
        MakeMove.col1 = 5;
        MakeMove.col2 = 5;
        MakeMove.col3 = 5;
        MakeMove.col4 = 5;
        MakeMove.col5 = 5;
        MakeMove.col6 = 5;


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
}
