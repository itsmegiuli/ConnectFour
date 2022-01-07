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
    public int counterCheckFourVerticalREDColm0 = 0;
    public int counterCheckFourVerticalYellowColm0 = 0;
    public int counterCheckFourVerticalREDColm1 = 0;
    public int counterCheckFourVerticalYellowColm1 = 0;
    public int counterCheckFourVerticalREDColm2 = 0;
    public int counterCheckFourVerticalYellowColm2 = 0;
    public int counterCheckFourVerticalREDColm3 = 0;
    public int counterCheckFourVerticalYellowColm3 = 0;
    public int counterCheckFourVerticalREDColm4 = 0;
    public int counterCheckFourVerticalYellowColm4 = 0;
    public int counterCheckFourVerticalREDColm5 = 0;
    public int counterCheckFourVerticalYellowColm5 = 0;
    public int counterCheckFourVerticalREDColm6 = 0;
    public int counterCheckFourVerticalYellowColm6 = 0;
    public int rowcountercolm1 = 0;
    public int rowcountercolm2 = 0;
    public int rowcountercolm3 = 0;
    public int rowcountercolm4 = 0;
    public int rowcountercolm5 = 0;
    public int rowcountercolm6 = 0;
    public int rowcountercolm0 = 0;
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
            if (gameBoard[j][0]== gameBoard[j][1] &&  gameBoard[j][1] == gameBoard[j][2] && gameBoard[j][2]== gameBoard[j][3] ||
                    gameBoard[j][1]== gameBoard[j][2] &&  gameBoard[j][2] == gameBoard[j][3] && gameBoard[j][3]== gameBoard[j][4] ||
                    gameBoard[j][2]== gameBoard[j][3] &&  gameBoard[j][3] == gameBoard[j][4] && gameBoard[j][4]== gameBoard[j][5] ||
                    gameBoard[j][3]== gameBoard[j][4] &&  gameBoard[j][4] == gameBoard[j][5] && gameBoard[j][5]== gameBoard[j][6]) {
                won = true;
            }
            if (gameBoard[0][j]== gameBoard[1][j] &&  gameBoard[1][j] == gameBoard[2][j] && gameBoard[2][j] == gameBoard[3][j] ||
            gameBoard[1][j]== gameBoard[2][j] &&  gameBoard[2][j] == gameBoard[3][j] && gameBoard[3][j] == gameBoard[4][j] ||
            gameBoard[2][j]== gameBoard[3][j] &&  gameBoard[3][j] == gameBoard[4][j] && gameBoard[4][j] == gameBoard[5][j]) { //vertically
                won = true;
            }}
        return won;
    }

    public void col0(ActionEvent col0Event) { //method on click of Buttons (1-7)

        do {
            makeMoveCol0();

            if(checkIfWon() == true) {
                if(counterForSwitchingPlayer %2==1) {
                    whoWonText.setText("Yellow, you won!");
                    whoWonText.setTextFill(Color.BLUE);
            }else {
                    whoWonText.setText("Red, you won!");
                    whoWonText.setTextFill(Color.BLUE);
                }
            }
    } while (!checkIfWon());

    }

    public void col1(ActionEvent col1Event) {
        if (!checkIfWon()) {

            counterForSwitchingPlayer++;

            if (counterForSwitchingPlayer % 2 == 1) {
                counterCheckFourVerticalREDColm1++;
                counterCheckFourVerticalYellowColm1 = 0;
            } else {
                counterCheckFourVerticalYellowColm1++;
                counterCheckFourVerticalREDColm1 = 0;
            }
            makeMoveCol1();

        } else if (counterCheckFourVerticalYellowColm1 == 4)
            System.out.println("Gelb hat gewonnen");
        else if (counterCheckFourVerticalREDColm1 == 4)
            System.out.println("Rot hat gewonnen");

    }

    public void col2(ActionEvent col2Event) {
        if (!checkIfWon()) {

            counterForSwitchingPlayer++;

            if (counterForSwitchingPlayer % 2 == 1) {
                counterCheckFourVerticalREDColm2++;
                counterCheckFourVerticalYellowColm2 = 0;
            } else {
                counterCheckFourVerticalYellowColm2++;
                counterCheckFourVerticalREDColm2 = 0;
            }
            makeMoveCol2();

        } else if (counterCheckFourVerticalYellowColm2 == 4)
            System.out.println("Gelb hat gewonnen");
        else if (counterCheckFourVerticalREDColm2 == 4)
            System.out.println("Rot hat gewonnen");


    }

    public void col3(ActionEvent col3Event) {
        if (!checkIfWon()) {

            counterForSwitchingPlayer++;

            if (counterForSwitchingPlayer % 2 == 1) {
                counterCheckFourVerticalREDColm3++;
                counterCheckFourVerticalYellowColm3 = 0;
            } else {
                counterCheckFourVerticalYellowColm3++;
                counterCheckFourVerticalREDColm3 = 0;
            }
            makeMoveCol3();

        } else if (counterCheckFourVerticalYellowColm3 == 4)
            System.out.println("Gelb hat gewonnen");
        else if (counterCheckFourVerticalREDColm3 == 4)
            System.out.println("Rot hat gewonnen");


    }

    public void col4(ActionEvent col4Event) {
        if (!checkIfWon()) {

            counterForSwitchingPlayer++;

            if (counterForSwitchingPlayer % 2 == 1) {
                counterCheckFourVerticalREDColm4++;
                counterCheckFourVerticalYellowColm4 = 0;
            } else {
                counterCheckFourVerticalYellowColm4++;
                counterCheckFourVerticalREDColm4 = 0;
            }
            makeMoveCol4();

        } else if (counterCheckFourVerticalYellowColm4 == 4)
            System.out.println("Gelb hat gewonnen");
        else if (counterCheckFourVerticalREDColm4 == 4)
            System.out.println("Rot hat gewonnen");


    }

    public void col5(ActionEvent col5Event) {
        if (!checkIfWon()) {

            counterForSwitchingPlayer++;

            if (counterForSwitchingPlayer % 2 == 1) {
                counterCheckFourVerticalREDColm5++;
                counterCheckFourVerticalYellowColm5 = 0;
            } else {
                counterCheckFourVerticalYellowColm5++;
                counterCheckFourVerticalREDColm5 = 0;
            }
            makeMoveCol5();

        } else if (counterCheckFourVerticalYellowColm5 == 4)
            System.out.println("Gelb hat gewonnen");
        else if (counterCheckFourVerticalREDColm5 == 4)
            System.out.println("Rot hat gewonnen");


    }

    public void col6(ActionEvent col6Event) {
        if (!checkIfWon()) {

            counterForSwitchingPlayer++;

            if (counterForSwitchingPlayer % 2 == 1) {
                counterCheckFourVerticalREDColm6++;
                counterCheckFourVerticalYellowColm6 = 0;
            } else {
                counterCheckFourVerticalYellowColm6++;
                counterCheckFourVerticalREDColm6 = 0;
            }
            makeMoveCol6();

        } else if (counterCheckFourVerticalYellowColm6 == 4)
            System.out.println("Gelb hat gewonnen");
        else if (counterCheckFourVerticalREDColm6 == 4)
            System.out.println("Rot hat gewonnen");


    }


    public void makeMoveCol0() {

        rowcountercolm0++;
        if (rowcountercolm0 <= 6) {
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
        rowcountercolm1++;
        if (rowcountercolm1 <= 6) {
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
        rowcountercolm2++;
        if (rowcountercolm2 <= 6) {
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
        rowcountercolm3++;
        if (rowcountercolm3 <= 6) {

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
        rowcountercolm4++;
        if (rowcountercolm4 <= 6) {

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
        rowcountercolm5++;
        if (rowcountercolm5 <= 6) {

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
        rowcountercolm6++;
        if (rowcountercolm6 <= 6) {

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






/**
 * IDEA:
 * in each makemove, it should save either 1 or 2 (1 for p1, 2 for p2) to then check if won
 * check if won: like tic tac toe (4 1s next to each other/ 4 2s next to each other)
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 * <p>
 * WORK IN PROGRESS, Giuli
 */


/**
 * WORK IN PROGRESS, Giuli
 */
