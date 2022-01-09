package connect4;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.shape.Shape;


public class Controller extends Shape {


    public GridPane playGround;
    public Button reset;
    public RowConstraints rowForReset0, rowForReset1, rowForReset2, rowForReset3, rowForReset4, rowForReset5;
    public Label yourTurnText;
    public Label whoWonText;
    public Label fullCol;
    public ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;


    public void col0(ActionEvent col0Event) { //method on click of Buttons (1-7)
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol0(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col1(ActionEvent col1Event) {
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol1(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col2(ActionEvent col2Event) {
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol2(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col3(ActionEvent col3Event) {
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol3(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col4(ActionEvent col4Event) {
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol4(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col5(ActionEvent col5Event) {
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol5(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col6(ActionEvent col6Event) {
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol6(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
            } else {
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void resetButton(ActionEvent reset) {

        playGround.getChildren().clear();
        playGround.getChildren().add(row0Button);
        playGround.getChildren().add(row1Button);
        playGround.getChildren().add(row2Button);
        playGround.getChildren().add(row3Button);
        playGround.getChildren().add(row4Button);
        playGround.getChildren().add(row5Button);
        playGround.getChildren().add(row6Button);
        whoWonText.setText("");
        yourTurnText.setText("Yellow, start again!");

        Reset.reset();

    }
}