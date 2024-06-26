import com.sun.tools.javac.util.Pair;

import java.util.*;

public class TicTacToeGame {
    Deque<Player> players;
    Board gameBoard;

    public void initializeGame() {
        players = new LinkedList<>();

        PlayingPieceX crossPiece = new PlayingPieceX();
        Player player1 = new Player("Player1",crossPiece);

        PlayingPieceO noughtsPiece = new PlayingPieceO();
        Player player2 = new Player("Player2",noughtsPiece);

        players.add(player1);
        players.add(player2);

        gameBoard = new Board(3);
    }

    public String startGame() {
        boolean noWinner = true;

        while(noWinner) {
            Player playerTurn = players.removeFirst();

            gameBoard.printBoard();

            List<List<Integer>> freeSpaces = gameBoard.getFreeCells();

            if(freeSpaces.isEmpty()) {
                noWinner = false;
                continue;
            }

            System.out.println("Player: " + playerTurn.name + "Enter row,column: ");
            Scanner inputScanner = new Scanner(System.in);

            String s = inputScanner.nextLine();
            String[] values = s.split(",");
            int inputRow = Integer.valueOf(values[0]);
            int inputColumn = Integer.valueOf(values[1]);

            boolean pieceAddedSucessfully = gameBoard.addPiece(inputRow,inputColumn,playerTurn.piece);
            if(!pieceAddedSucessfully) {
                // player can't insert the piece into this cell , player has to choose another cell.
                System.out.println("Incorrect position chosen , try again");
                players.addFirst(playerTurn);
                continue;
            }
            players.addLast(playerTurn);

            boolean winner = isThereWinner(inputRow,inputColumn,playerTurn.piece.pieceType);
            if(winner) {
                return playerTurn.name;
            }
        }
        return "tie";
    }

    public boolean isThereWinner(int row, int column , PieceType pieceType) {
        boolean rowMatch = true;
        boolean columnMatch = true;
        boolean diagonalMatch = true;
        boolean antiDiagonalMatch = true;

        // need to check in row
        for(int i = 0 ; i < gameBoard.size; i++) {
            if(gameBoard.board[row][i] == null || gameBoard.board[row][i].pieceType != pieceType) {
                rowMatch = false;
            }
        }

        // need to check in column.
        for(int i = 0 ; i < gameBoard.size; i++) {
            if(gameBoard.board[i][column] == null || gameBoard.board[i][column].pieceType != pieceType) {
                columnMatch = false;
            }
        }

        //need to check diagonals
        for(int i=0, j=0; i<gameBoard.size;i++,j++) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                diagonalMatch = false;
            }
        }

        //need to check anti-diagonals
        for(int i=0, j=gameBoard.size-1; i<gameBoard.size;i++,j--) {
            if (gameBoard.board[i][j] == null || gameBoard.board[i][j].pieceType != pieceType) {
                antiDiagonalMatch = false;
            }
        }
        return rowMatch || columnMatch || diagonalMatch || antiDiagonalMatch;
    }
}
