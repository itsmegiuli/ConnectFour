package connect4;

import javafx.animation.Interpolator;
import javafx.animation.RotateTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

public class WhoWonTransition {

    protected static void yellowWins(Controller controller) {

        controller.yourTurnText.setText("Yellow, you won!"); // sets the animation when yellow wins


        controller.instructions.setVisible(false);
        controller.yellowBeanie.setVisible(true);
        controller.resetText.setText(" Play again " );

        controller.playGround.getChildren().remove(controller.row0Button);
        controller.playGround.getChildren().remove(controller.row1Button);
        controller.playGround.getChildren().remove(controller.row2Button);
        controller.playGround.getChildren().remove(controller.row3Button);
        controller.playGround.getChildren().remove(controller.row4Button);
        controller.playGround.getChildren().remove(controller.row5Button);
        controller.playGround.getChildren().remove(controller.row6Button);

        TranslateTransition leftToRight = new TranslateTransition();
        leftToRight.setNode(controller.yellowBeanie);
        leftToRight.setDuration(Duration.millis(1000));
        leftToRight.setCycleCount(2);
        leftToRight.setAutoReverse(true);
        leftToRight.setByX(-400);
        leftToRight.setByY(-400);


        RotateTransition rotate = new RotateTransition();
        rotate.setNode(controller.yellowBeanie);
        rotate.setDuration(Duration.millis(400));
        rotate.setCycleCount(5);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);


        TranslateTransition upAndDown = new TranslateTransition();
        upAndDown.setNode(controller.yellowBeanie);
        upAndDown.setDuration(Duration.millis(1000));
        upAndDown.setCycleCount(TranslateTransition.INDEFINITE);
        upAndDown.setAutoReverse(true);
        upAndDown.setByY(15);


        ScaleTransition scale = new ScaleTransition();
        scale.setNode(controller.yellowBeanie);
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

    protected static void redWins(Controller controller) {   // sets the animation when red wins

        controller.instructions.setVisible(false);
        controller.redBeanie.setVisible(true);
        controller.yourTurnText.setText("Red, you won!");
        controller.resetText.setText(" Play again " );
        controller.playGround.getChildren().remove(controller.row0Button);
        controller.playGround.getChildren().remove(controller.row1Button);
        controller.playGround.getChildren().remove(controller.row2Button);
        controller.playGround.getChildren().remove(controller.row3Button);
        controller.playGround.getChildren().remove(controller.row4Button);
        controller.playGround.getChildren().remove(controller.row5Button);
        controller.playGround.getChildren().remove(controller.row6Button);

        TranslateTransition leftToRight = new TranslateTransition();
        leftToRight.setNode(controller.redBeanie);
        leftToRight.setDuration(Duration.millis(1000));
        leftToRight.setCycleCount(2);
        leftToRight.setAutoReverse(true);
        leftToRight.setByX(-400);
        leftToRight.setByY(-400);


        RotateTransition rotate = new RotateTransition();
        rotate.setNode(controller.redBeanie);
        rotate.setDuration(Duration.millis(400));
        rotate.setCycleCount(5);
        rotate.setInterpolator(Interpolator.LINEAR);
        rotate.setByAngle(360);
        rotate.setAxis(Rotate.Z_AXIS);


        TranslateTransition upAndDown = new TranslateTransition();
        upAndDown.setNode(controller.redBeanie);
        upAndDown.setDuration(Duration.millis(1000));
        upAndDown.setCycleCount(TranslateTransition.INDEFINITE);
        upAndDown.setAutoReverse(true);
        upAndDown.setByY(15);


        ScaleTransition scale = new ScaleTransition();
        scale.setNode(controller.redBeanie);
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
}
