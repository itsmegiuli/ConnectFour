package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Shape;

/**
 * WORK IN PROGRESS, Giuli
 */
public class Controller extends Shape {


    public Circle redChip;
    public Circle chip;
    public Circle newChip;
    int row0 = 5; //needs to keep going up with each move
    int row1 = 5;
    int row2 = 5;
    int row = 5;


    public Controller() {
        chip = this.chip;
    }

    @FXML
    private ToggleButton row0Button, row1Button, row2Button, row3Button, row4Button, row5Button, row6Button;


    public void row0(ActionEvent row0Event) { //method on click of Buttons (1-7)
        makeMove();


    }

    public void row1(ActionEvent row1Event) {
        makeMoveR1();
    }

    public void row2(ActionEvent row2Event) {
        makeMove();
    }

    public void row3(ActionEvent row3Event) {
        makeMove();
    }

    public void row4(ActionEvent row4Event) {
        makeMove();
    }

    public void row5(ActionEvent row5Event) {
        makeMove();
    }

    public void row6(ActionEvent row6Event) {
        makeMove();
    }


    public Circle getChip() {
        Circle chipNuevo = new Circle();
        chip = chipNuevo;

        return chipNuevo;
    }
    public void makeMove() {
        getChip();
        getChip().setVisible(true);
        getChip().setFill(Color.YELLOW);
        GridPane.setRowIndex(getChip(), row2);
        GridPane.setColumnIndex(getChip(), 4);
        row2--;
        System.out.println("move made");

    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void makeMoveR1() {
        Circle createChip = new Circle();
        createChip.setRadius(25);
        createChip.setFill(Color.YELLOW);
        createChip.setVisible(true);
        GridPane.setRowIndex(createChip,row1 );
        GridPane.setColumnIndex(chip, 1);

    }


    private int getRow() {
        row = this.row;
        return row;
    }


    public Circle copyChip () {
        Circle chipNew = new Circle();
        chip = chipNew;
        return chip;
    }


        public Circle newChip () {
        Circle newChip = new Circle();
        newChip.setRadius(25);
        newChip.setFill(Color.YELLOW);
        newChip.setVisible(true);
        return newChip;


    }
}
/**
 * WORK IN PROGRESS, Giuli
 */
