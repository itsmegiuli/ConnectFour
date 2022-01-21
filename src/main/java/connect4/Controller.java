package connect4;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

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
    public Label Draw;
    public ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;
    public Button reset;
    public ImageView redWonImage;
    public ImageView redBeanie;
    public ImageView yellowBeanie;
    public Label instructions;

    public void yellowWins() {

        yourTurnText.setText("Yellow, you won!"); // giuli´s note to self: your turn text instead of who won - delete who won


        instructions.setVisible(false);
        yellowBeanie.setVisible(true);

        TranslateTransition leftToRight = new TranslateTransition();
        leftToRight.setNode(yellowBeanie);
        leftToRight.setDuration(Duration.millis(1000));
        leftToRight.setCycleCount(2);
        leftToRight.setAutoReverse(true);
        leftToRight.setByX(-400);
        leftToRight.setByY(-400);


        RotateTransition rotate = new RotateTransition();
        rotate.setNode(yellowBeanie);
        rotate.setDuration(Duration.millis(400));
        rotate.setCycleCount(5);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);


        TranslateTransition upAndDown = new TranslateTransition();
        upAndDown.setNode(yellowBeanie);
        upAndDown.setDuration(Duration.millis(1000));
        upAndDown.setCycleCount(TranslateTransition.INDEFINITE);
        upAndDown.setAutoReverse(true);
        upAndDown.setByY(15);


        ScaleTransition scale = new ScaleTransition();
        scale.setNode(yellowBeanie);
        scale.setDuration(Duration.millis(1000));
        scale.setByX(1.5f);
        scale.setByY(1.5f);
        scale.setCycleCount(2);
        scale.setAutoReverse(true);

        scale.play();
        rotate.play();
        leftToRight.play();
        upAndDown.play();
    }

    public void redWins() {

        instructions.setVisible(false);
        redBeanie.setVisible(true);
        yourTurnText.setText("Red, you won!"); // giuli´s note to self: your turn text instead of who won - delete who won

        TranslateTransition leftToRight = new TranslateTransition();
        leftToRight.setNode(redBeanie);
        leftToRight.setDuration(Duration.millis(1000));
        leftToRight.setCycleCount(2);
        leftToRight.setAutoReverse(true);
        leftToRight.setByX(-400);
        leftToRight.setByY(-400);


        RotateTransition rotate = new RotateTransition();
        rotate.setNode(redBeanie);
        rotate.setDuration(Duration.millis(400));
        rotate.setCycleCount(5);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);


        TranslateTransition upAndDown = new TranslateTransition();
        upAndDown.setNode(redBeanie);
        upAndDown.setDuration(Duration.millis(1000));
        upAndDown.setCycleCount(TranslateTransition.INDEFINITE);
        upAndDown.setAutoReverse(true);
        upAndDown.setByY(15);


        ScaleTransition scale = new ScaleTransition();
        scale.setNode(redBeanie);
        scale.setDuration(Duration.millis(1000));
        scale.setByX(1.5f);
        scale.setByY(1.5f);
        scale.setCycleCount(2);
        scale.setAutoReverse(true);

        scale.play();
        rotate.play();
        leftToRight.play();
        upAndDown.play();
    }

    public void Draw() {
        Draw.setText("Its a Draw!");
        Draw.setVisible(true);
    }


    public void col0(javafx.event.ActionEvent col0Event) {    //method on click of Buttons (1-7)
        if (!CheckIfWon.checkIfWon(Main.gameBoard)) {        // if nobody wins, you keep playing the game
            MakeMove.makeMoveCol0(this);


        }
        if (CheckIfWon.checkIfWon(Main.gameBoard)) {        // method being called when somebody wins the game
            yourTurnText.setText("");
            if (MakeMove.counterForSwitchingPlayer % 2 == 1) {  //second turn = Red Player wins
                redWins();
            } else {                                           //first turn = Yellow Player wins
                yellowWins();
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
                redWins();
            } else {
                yellowWins();
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
                redWins();
            } else {
                yellowWins();
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
                redWins();
            } else {
                yellowWins();
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
                redWins();
            } else {
                yellowWins();
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
                redWins();
            } else {
                yellowWins();
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
                redWins();
            } else {
                yellowWins();
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
        redBeanie.setVisible(false);
        yellowBeanie.setVisible(false);
        instructions.setVisible(true);
        Reset.DrawReset(Draw);

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