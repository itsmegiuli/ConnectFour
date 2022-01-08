package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

import static javafx.application.Application.launch;

/**
 * WORK IN PROGRESS, Giuli
 */
public class Controller extends Shape {
    public Player p1;
    public Player p2;
    public int counterForSwitchingPlayer = 1;
    public int counterCol0 = 0;
    public int counterCol1 = 0;
    public int counterCol2 = 0;
    public int counterCol3 = 0;
    public int counterCol4 = 0;
    public int counterCol5 = 0;
    public int counterCol6 = 0;

    public GridPane playGround;
    public Button reset;
    public RowConstraints rowForReset0, rowForReset1, rowForReset2, rowForReset3, rowForReset4, rowForReset5;
    public Label yourTurnText;
    public Label whoWonText;
    int col0 = 5, col1 = 5, col2 = 5, col3 = 5, col4 = 5, col5 = 5, col6 = 5;


    public char[][] gameBoard = new char[][]{
            {'a', 'b', 'c', 'd', 'e', 'f', 'g'},
            {'h', 'i', 'j', 'k', 'l', 'm', 'n'},
            {'o', 'p', 'q', 'r', 's', 't', 'u'},
            {'v', 'w', 'x', 'y', 'z', 'A', 'B'},
            {'C', 'D', 'E', 'F', 'G', 'H', 'I'},
            {'J', 'K', 'L', 'M', 'N', 'P', 'Q'},
            {'R', 'S', 'T', 'U', 'V', 'W', 'Y'},
    };


    @FXML
    private ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;

    public boolean checkIfWon() {
        boolean won = false;

        for (int j = 0; j < gameBoard.length; j++) { //horizontally
            if (gameBoard[j][0] == gameBoard[j][1] && gameBoard[j][1] == gameBoard[j][2] && gameBoard[j][2] == gameBoard[j][3] ||
                    gameBoard[j][1] == gameBoard[j][2] && gameBoard[j][2] == gameBoard[j][3] && gameBoard[j][3] == gameBoard[j][4] ||
                    gameBoard[j][2] == gameBoard[j][3] && gameBoard[j][3] == gameBoard[j][4] && gameBoard[j][4] == gameBoard[j][5] ||
                    gameBoard[j][3] == gameBoard[j][4] && gameBoard[j][4] == gameBoard[j][5] && gameBoard[j][5] == gameBoard[j][6]) {
                won = true;
            }
            if (gameBoard[0][j] == gameBoard[1][j] && gameBoard[1][j] == gameBoard[2][j] && gameBoard[2][j] == gameBoard[3][j] ||
                    gameBoard[1][j] == gameBoard[2][j] && gameBoard[2][j] == gameBoard[3][j] && gameBoard[3][j] == gameBoard[4][j] ||
                    gameBoard[2][j] == gameBoard[3][j] && gameBoard[3][j] == gameBoard[4][j] && gameBoard[4][j] == gameBoard[5][j]) { //vertically
                won = true;
            }
        }

        for (int row = 0; row < gameBoard.length - 3; row++) {
            for (int col = 0; col < gameBoard[row].length - 3; col++) {
                int element = gameBoard[row][col];
                if (element == gameBoard[row + 1][col + 1] &&
                        element == gameBoard[row + 2][col + 2] &&
                        element == gameBoard[row + 3][col + 3])
                {
                    won = true;
                }
            }
        }
        for (int row = 0; row < gameBoard.length - 3; row++) {
            for (int col = 3; col < gameBoard[row].length; col++) {
                int element = gameBoard[row][col];
                if (element == gameBoard[row + 1][col - 1] &&
                        element == gameBoard[row + 2][col - 2] &&
                        element == gameBoard[row + 3][col - 3])
                {
                    won = true;
                }
            }
        }
        return won;
    }

    public void col0(ActionEvent col0Event) { //method on click of Buttons (1-7)
        if (!checkIfWon()) {
            makeMoveCol0();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }

    public void col1(ActionEvent col1Event) {
        if (!checkIfWon()) {
            makeMoveCol1();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }

    public void col2(ActionEvent col2Event) {
        if (!checkIfWon()) {
            makeMoveCol2();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }

    public void col3(ActionEvent col3Event) {
        if (!checkIfWon()) {
            makeMoveCol3();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }

    public void col4(ActionEvent col4Event) {
        if (!checkIfWon()) {
            makeMoveCol4();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }

    public void col5(ActionEvent col5Event) {
        if (!checkIfWon()) {
            makeMoveCol5();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }

    public void col6(ActionEvent col6Event) {
        if (!checkIfWon()) {
            makeMoveCol6();
        }
        if (checkIfWon()) {
            if (counterForSwitchingPlayer % 2 == 1) {
                whoWonText.setText("Red, you won!");
                whoWonText.setTextFill(Color.RED);
            } else {
                whoWonText.setText("Yellow, you won!");
                whoWonText.setTextFill(Color.YELLOW);
            }
        }
    }
    public void makeMoveCol0() {

        counterCol0++;
        counterForSwitchingPlayer++;
        if (counterCol0 <= 6) {
            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                //   counterCheckFourVerticalYellow++;
                //  counterCheckFourVerticalRED = 0;
            } else newChip.setFill(Color.YELLOW);

            GridPane.setRowIndex(newChip, col0);
            GridPane.setColumnIndex(newChip, 0);
            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col0][0] = 'X';
            } else gameBoard[col0][0] = 'O';
            // if - 1 for player 1 // if: 2 for player 2
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();

            }
            col0--;
        } else {
            System.out.println("Colm is full");
            System.out.println();
        }

    }

    public void makeMoveCol1() {
        counterCol1++;
        counterForSwitchingPlayer++;
        if (counterCol1 <= 6) {
            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
                yourTurnText.setText ("Red, your turn");
            } else newChip.setFill(Color.YELLOW); //change color according to player
            GridPane.setRowIndex(newChip, col1);
            GridPane.setColumnIndex(newChip, 1);

            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col1][1] = 'X';
            } else gameBoard[col1][1] = 'O';
            col1--; //fix: cant be less than 0


            //will be deleted
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();

            }
        } else {
            System.out.println("Colm is full");
            System.out.println();
        }

    }

    public void makeMoveCol2() {
        counterCol2++;
        counterForSwitchingPlayer++;

        if (counterCol2 <= 6) {
            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
            } else newChip.setFill(Color.YELLOW);
            ; //change color according to player
            GridPane.setRowIndex(newChip, col2);
            GridPane.setColumnIndex(newChip, 2);

            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col2][2] = 'X';
            } else gameBoard[col2][2] = 'O';
            col2--; //fix: cant be less than 0


            //will be deleted
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();


            }
        } else {
            System.out.println("Colm is full");
            System.out.println();
        }

    }

    public void makeMoveCol3() {
        counterCol3++;
        counterForSwitchingPlayer++;

        if (counterCol3 <= 6) {

            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
            } else newChip.setFill(Color.YELLOW); //change color according to player
            GridPane.setRowIndex(newChip, col3);
            GridPane.setColumnIndex(newChip, 3);

            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col3][3] = 'X';
            } else gameBoard[col3][3] = 'O';
            col3--; //fix: cant be less than 0
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();

            }
        } else {
            System.out.println("Colm is full");
            System.out.println();
        }

    }

    public void makeMoveCol4() {
        counterCol4++;
        counterForSwitchingPlayer++;

        if (counterCol4 <= 6) {

            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
            } else newChip.setFill(Color.YELLOW); //change color according to player
            GridPane.setRowIndex(newChip, col4);
            GridPane.setColumnIndex(newChip, 4);

            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col4][4] = 'X';
            } else gameBoard[col4][4] = 'O';
            col4--; //fix: cant be less than 0
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();


            }
        } else {
            System.out.println("Colm is full");
            System.out.println();
        }

    }

    public void makeMoveCol5() {
        counterCol5++;
        counterForSwitchingPlayer++;

        if (counterCol5 <= 6) {

            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
            } else newChip.setFill(Color.YELLOW); //change color according to player
            GridPane.setRowIndex(newChip, col5);
            GridPane.setColumnIndex(newChip, 5);

            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col5][5] = 'X';
            } else gameBoard[col5][5] = 'O';

            col5--; //fix: cant be less than 0
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();

            }
        } else {
            System.out.println("Colm is full");
            System.out.println();
        }


    }

    public void makeMoveCol6() {
        counterCol6++;
        counterForSwitchingPlayer++;

        if (counterCol6 <= 6) {

            Circle newChip = new Circle(25);
            playGround.getChildren().add(newChip);
            if (counterForSwitchingPlayer % 2 == 1) {
                newChip.setFill(Color.RED);
            } else newChip.setFill(Color.YELLOW); //change color according to player
            GridPane.setRowIndex(newChip, col6);
            GridPane.setColumnIndex(newChip, 6);

            if (counterForSwitchingPlayer % 2 == 1) {
                gameBoard[col6][6] = 'X';
            } else gameBoard[col6][6] = 'O';
            for (int i = 0; i <= 5; i++) {
                System.out.print(gameBoard[i][0]);
                System.out.print(gameBoard[i][1]);
                System.out.print(gameBoard[i][2]);
                System.out.print(gameBoard[i][3]);
                System.out.print(gameBoard[i][4]);
                System.out.print(gameBoard[i][5]);
                System.out.print(gameBoard[i][6]);
                System.out.println();

            }

            col6--; //fix: cant be less than 0

        } else {
            System.out.println("Colm is full");
            System.out.println();
        }
    }





    /**
     * ## reset: nicht fertig.##
     * To-Do: clear like it is BUT ONLY row 0-5 of gridpane(playground)
     *
     * */
    public void reset(ActionEvent reset) {
        // Circle circle = this.newChip;

        playGround.getChildren().clear();
        //playGround.getChildren().removeAll(newChip);
        this.gameBoard = new char[][]{
                {'-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-'},
                {'-', '-', '-', '-', '-', '-', '-'},
        };
        System.out.println("reseted");

    }


}