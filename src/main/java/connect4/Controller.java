package connect4;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class Controller implements Shape {


    public GridPane playGround;
    public RowConstraints rowForReset0, rowForReset1, rowForReset2, rowForReset3, rowForReset4, rowForReset5;
    public Label yourTurnText;
    public Label whoWonText;
    public Label fullCol;
    public ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;
    public Button reset;


    public void col0(javafx.event.ActionEvent col0Event) {    //method on click of Buttons (1-7)
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {        // if nobody wins, you keep playing the game
            MakeMove.makeMoveCol0(this);
        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {        // method being called when somebody wins the game
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {  //second turn = Red Player wins
                whoWonText.setText("Red, you won!");
            } else {                                           //first turn = Yellow Player wins
                whoWonText.setText("Yellow, you won!");
            }
        }
    }

    public void col1(javafx.event.ActionEvent col1Event) {     // method: see col0 (col2, col3, etc.)
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

    public void col2(javafx.event.ActionEvent col2Event) {
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

    public void col3(javafx.event.ActionEvent  col3Event) {
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

    public void col4(javafx.event.ActionEvent  col4Event) {
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

    public void col5(javafx.event.ActionEvent  col5Event) {
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

    public void col6(javafx.event.ActionEvent col6Event) {
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

    public void resetButton(javafx.event.ActionEvent reset) {

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

    @Override
    public Rectangle getBounds() {
        return null;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }

    @Override
    public boolean contains(double x, double y) {
        return false;
    }

    @Override
    public boolean contains(Point2D p) {
        return false;
    }

    @Override
    public boolean intersects(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean intersects(Rectangle2D r) {
        return false;
    }

    @Override
    public boolean contains(double x, double y, double w, double h) {
        return false;
    }

    @Override
    public boolean contains(Rectangle2D r) {
        return false;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at) {
        return null;
    }

    @Override
    public PathIterator getPathIterator(AffineTransform at, double flatness) {
        return null;
    }



}