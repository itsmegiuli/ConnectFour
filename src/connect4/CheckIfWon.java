package connect4;

public class CheckIfWon {
    public static boolean checkIfWon(char[][] gameBoard) {
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
                        element == gameBoard[row + 3][col + 3]) {
                    won = true;
                }
            }
        }
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
}