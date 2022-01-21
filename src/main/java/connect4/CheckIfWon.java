package connect4;

/**
 * CheckIfWon checks if there are any 4-combinations in our 2D Array, that have the same char (==).
 * The "original" char array has 42 different characters, it only changes when the players make their move.
 * If 4 places next to each other are equal,... then that means whoever´s turn it was, WON!
 */

public class CheckIfWon {
    protected static boolean checkIfWon(char[][] gameBoard) { //access modifier (modified methods only - not the class itself) changed to protected
        boolean won = false;

        // **HORIZONTALLY**
        //checks all row-combinations, to see if there are 4 of the same symbol (X or O) next to each other
        for (int j = 0; j < gameBoard.length; j++) {
            if (gameBoard[j][0] == gameBoard[j][1] && gameBoard[j][1] == gameBoard[j][2] && gameBoard[j][2] == gameBoard[j][3] ||
                    gameBoard[j][1] == gameBoard[j][2] && gameBoard[j][2] == gameBoard[j][3] && gameBoard[j][3] == gameBoard[j][4] ||
                    gameBoard[j][2] == gameBoard[j][3] && gameBoard[j][3] == gameBoard[j][4] && gameBoard[j][4] == gameBoard[j][5] ||
                    gameBoard[j][3] == gameBoard[j][4] && gameBoard[j][4] == gameBoard[j][5] && gameBoard[j][5] == gameBoard[j][6]) {
                won = true;
            }

            // **VERTICALLY**
            //checks all column-combinations, to see if there are 4 of the same symbol (X or O) next to each other
            if (gameBoard[1][j] == gameBoard[2][j] && gameBoard[2][j] == gameBoard[3][j] && gameBoard[3][j] == gameBoard[4][j] ||
                            gameBoard[2][j] == gameBoard[3][j] && gameBoard[3][j] == gameBoard[4][j] && gameBoard[4][j] == gameBoard[5][j] ||
                            gameBoard[3][j] == gameBoard[4][j] && gameBoard[4][j] == gameBoard[5][j] && gameBoard[5][j] == gameBoard[6][j]) {
                won = true;
            }
        }

        // **DIAGONALLY**
        //checks all diagonal combinations, to see if there are 4 of the same symbol (X or O) diagonally across from each other
        for (int row = 0; row < gameBoard.length - 3; row++) {
            for (int col = 0; col < gameBoard[row].length - 3; col++) {
                int element = gameBoard[row][col];
                if (element == gameBoard[row + 1][col + 1] &&
                        element == gameBoard[row + 2][col + 2] &&
                        element == gameBoard[row + 3][col + 3]) {
                    won = true;
                }
            }
        }

        // **DIAGONALLY** //see above
        for (int row = 0; row < gameBoard.length - 3; row++) {
            for (int col = 3; col < gameBoard[row].length; col++) {
                int element = gameBoard[row][col];
                if (element == gameBoard[row + 1][col - 1] &&
                        element == gameBoard[row + 2][col - 2] &&
                        element == gameBoard[row + 3][col - 3]) {
                    won = true;
                }
            }
        }
        return won;
    }

    protected static boolean checkIfDraw(char[][] gameBoard) {  //checks if ALL fields are occupied without any winning combination
        boolean draw = false;
        int xy = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j <= 6; j++) {
                if (gameBoard[i][j] == 'X' || gameBoard[i][j] == 'O')
                    xy++;
            }
        }
        if (xy == 42)
            draw = true;
        return draw;

    }
}
