package connect4;


import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;


public class MakeMove {

    protected static int counterForSwitchingPlayer = 1;
    protected static int counterCol0 = 0, counterCol1 = 0, counterCol2 = 0, counterCol3 = 0, counterCol4 = 0, counterCol5 = 0, counterCol6 = 0;
    protected static int col0 = 6, col1 = 6, col2 = 6, col3 = 6, col4 = 6, col5 = 6, col6 = 6;
    protected static String yourTurnYellow = "Yellow, make your move!";
    protected static String yourTurnRed = "Red, make your move!";


    protected static void makeMoveCol0(Controller controller) {
        counterCol0++;
        counterForSwitchingPlayer++;       // counts one move, so the Game knows it´s the other Player´s turn

        if (counterCol0 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);         // after Red made its move: Your turn, Yellow
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);        // after Yellow made its move: Your turn, Red
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col0);
            GridPane.setColumnIndex(newChip, 0);
            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col0][0] = 'X';
            } else Main.gameBoard[col0][0] = 'O';

            col0--;  // column counter starts at 6 (at the bottom) -> counts subtracted to know the place of the chip

        } else {
            Reset.fullCol(controller.fullCol);
        }
        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

    protected static void makeMoveCol1(Controller controller) { //method: see makeMoveCol0 (makeMoveCol2, etc.)
        counterCol1++;
        counterForSwitchingPlayer++;

        if (counterCol1 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col1);
            GridPane.setColumnIndex(newChip, 1);

            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col1][1] = 'X';
            } else Main.gameBoard[col1][1] = 'O';

            col1--;

        } else {
            Reset.fullCol(controller.fullCol);
        }
        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

    protected static void makeMoveCol2(Controller controller) { //method: see makeMoveCol0
        counterCol2++;
        counterForSwitchingPlayer++;


        if (counterCol2 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);

            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col2);
            GridPane.setColumnIndex(newChip, 2);

            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col2][2] = 'X';
            } else Main.gameBoard[col2][2] = 'O';

            col2--;

        } else {
            Reset.fullCol(controller.fullCol);
        }
        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

    protected static void makeMoveCol3(Controller controller) {  //method: see makeMoveCol0
        counterCol3++;
        counterForSwitchingPlayer++;


        if (counterCol3 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col3);
            GridPane.setColumnIndex(newChip, 3);

            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col3][3] = 'X';
            } else Main.gameBoard[col3][3] = 'O';

            col3--;

        } else {
            Reset.fullCol(controller.fullCol);
        }
        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

    protected static void makeMoveCol4(Controller controller) {   //method: see makeMoveCol0
        counterCol4++;
        counterForSwitchingPlayer++;


        if (counterCol4 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col4);
            GridPane.setColumnIndex(newChip, 4);

            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col4][4] = 'X';
            } else Main.gameBoard[col4][4] = 'O';

            col4--;

        } else {
            Reset.fullCol(controller.fullCol);
        }
        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

    protected static void makeMoveCol5(Controller controller) {   //method: see makeMoveCol0
        counterCol5++;
        counterForSwitchingPlayer++;


        if (counterCol5 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col5);
            GridPane.setColumnIndex(newChip, 5);

            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col5][5] = 'X';
            } else Main.gameBoard[col5][5] = 'O';

            col5--;

        } else {
            Reset.fullCol(controller.fullCol);
        }

        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

    protected static void makeMoveCol6(Controller controller) {   //method: see makeMoveCol0
        counterCol6++;
        counterForSwitchingPlayer++;

        if (counterCol6 <= 6) {
            Reset.fullColReset(controller.fullCol);
            Circle newChip = new Circle(26);
            controller.playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                controller.yourTurnText.setText(yourTurnYellow);
            } else {
                newChip.setFill(Color.YELLOW);
                controller.yourTurnText.setText(yourTurnRed);
            }
            GridPane.setRowIndex(newChip, col6);
            GridPane.setColumnIndex(newChip, 6);

            if (counterForSwitchingPlayer % 2 == 1) {
                Main.gameBoard[col6][6] = 'X';
            } else Main.gameBoard[col6][6] = 'O';

            col6--;

        } else {
            Reset.fullCol(controller.fullCol); //see class Reset
        }
        if (CheckIf.checkIfDraw(Main.gameBoard)) {
            controller.draw();
        }
    }

}

