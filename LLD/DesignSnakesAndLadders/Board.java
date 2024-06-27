import java.util.concurrent.ThreadLocalRandom;

public class Board {

    Cell[][] cells;

    private void initialize(int boardSize) {
        cells = new Cell[boardSize][boardSize];

        for(int i = 0 ; i < boardSize ; i++) {
            for(int j = 0 ; j < boardSize ; j++) {
                Cell cellObj = new Cell();
                cells[i][j] = cellObj;
            }
        }
    }

    Board(int boardSize, int numberOfSnakes , int numberOfLadders) {
        initialize(boardSize);
        addSnakesAndLadders(cells,numberOfSnakes,numberOfLadders);
    }

    private void addSnakesAndLadders(Cell[][] cells, int numberOfSnakes, int numberOfLadders) {
        // Applying snakes on my cells in the given board.
        while(numberOfSnakes > 0) {
            int snakeHead = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length - 1);
            int snakeTail = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length - 1);
            if(snakeTail >= snakeHead)
                 continue;

            // Creating a new snakeObj if (snakeHead > snakeTail)
            Jump snakeObj = new Jump();
            snakeObj.start = snakeHead;
            snakeObj.end = snakeTail;

            Cell cell = getCell(snakeHead);
            cell.jump = snakeObj;

            numberOfSnakes--;
        }

        // Applying ladders on my cells in the given board.
        while(numberOfLadders > 0) {
            int ladderStart = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            int ladderEnd = ThreadLocalRandom.current().nextInt(1,cells.length*cells.length-1);
            if(ladderStart >= ladderEnd) {
                continue;
            }

            // Creating a new snakeObj if (ladderEnd > ladderHead)
            Jump ladderObj = new Jump();
            ladderObj.start = ladderStart;
            ladderObj.end = ladderEnd;

            Cell cell = getCell(ladderStart);
            cell.jump = ladderObj;

            numberOfLadders--;
        }
    }

    // Cell number --> {num/10,num%10}
    Cell getCell(int playerPosition) {
        int boardRow = playerPosition / cells.length;
        int boardColumn = (playerPosition % cells.length);
        return cells[boardRow][boardColumn];
    }
}
