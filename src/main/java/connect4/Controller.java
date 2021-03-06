package connect4;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
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
    public Label fullCol;
    public Label draw;
    public ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;
    public Button resetText;
    public ImageView redBeanie;
    public ImageView yellowBeanie;
    public ImageView arrow;
    public Label instructions;


    public void col0(javafx.event.ActionEvent col0Event) {    //method on click of Buttons (1-7)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {        // if nobody wins, you keep playing the game
            MakeMove.makeMoveCol0(this);


        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {        // method being called when somebody wins the game
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {  //second turn = Red Player wins
                Transitions.redWins(this);
            } else {                                           //first turn = Yellow Player wins
                Transitions.yellowWins(this);
            }
        }
    }

    public void col1(javafx.event.ActionEvent col1Event) {     // method: see col0 (col2, col3, etc.)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol1(this);
        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                Transitions.redWins(this);
            } else {
                Transitions.yellowWins(this);
            }
        }
    }

    public void col2(javafx.event.ActionEvent col2Event) {     // method: see col0 (& other columns)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol2(this);
        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                Transitions.redWins(this);
            } else {
                Transitions.yellowWins(this);
            }
        }
    }

    public void col3(javafx.event.ActionEvent col3Event) {    // method: see col0 (& other columns)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol3(this);
        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                Transitions.redWins(this);
            } else {
                Transitions.yellowWins(this);
            }
        }
    }

    public void col4(javafx.event.ActionEvent col4Event) {   // method: see col0 (& other columns)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol4(this);
        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                Transitions.redWins(this);
            } else {
                Transitions.yellowWins(this);
            }
        }
    }

    public void col5(javafx.event.ActionEvent col5Event) {   // method: see col0 (& other columns)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol5(this);
        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                Transitions.redWins(this);
            } else {
                Transitions.yellowWins(this);
            }
        }
    }

    public void col6(javafx.event.ActionEvent col6Event) {   // method: see col0 (& other columns)
        if (!CheckIf.checkIfWon(Main.gameBoard)) {
            MakeMove.makeMoveCol6(this);
        }
        if (CheckIf.checkIfWon(Main.gameBoard)) {
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {
                Transitions.redWins(this);
            } else {
                Transitions.yellowWins(this);
            }
        }
    }

    public void draw() {  //displays draw message on the screen
        draw.setText("It\'s a draw!");
        draw.setVisible(true);
        Transitions.movingArrow(arrow);


        yourTurnText.setText("");
        resetText.setText("     Reset     ");
        instructions.setVisible(false);
        playGround.getChildren().remove(row0Button);
        playGround.getChildren().remove(row1Button);
        playGround.getChildren().remove(row2Button);
        playGround.getChildren().remove(row3Button);
        playGround.getChildren().remove(row4Button);
        playGround.getChildren().remove(row5Button);
        playGround.getChildren().remove(row6Button);
    }

    public void resetButton(javafx.event.ActionEvent reset) {  // clears the board of all set chips (and buttons); adds buttons again

        playGround.getChildren().clear();
        playGround.getChildren().add(row0Button);
        playGround.getChildren().add(row1Button);
        playGround.getChildren().add(row2Button);
        playGround.getChildren().add(row3Button);
        playGround.getChildren().add(row4Button);
        playGround.getChildren().add(row5Button);
        playGround.getChildren().add(row6Button);
        yourTurnText.setText("Red, start the game!");
        redBeanie.setVisible(false);
        yellowBeanie.setVisible(false);
        instructions.setVisible(true);
        resetText.setText("     Reset     ");
        arrow.setVisible(false);

        Reset.drawReset(draw);

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