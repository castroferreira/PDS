/**
 *  PDS 2018
 *
 */
package aulas_praticas.aula03_01;

public class JogoGaloEngine implements JGaloInterface {

    private char actualPlayer, winner;//initialPlayer;
    private char[][] grid;
    private int plays;
    private static final int TOTAL_PLAYS = 9;
    boolean finished;

    public JogoGaloEngine(char initialPlayer) {
        initialPlayer = Character.toUpperCase(initialPlayer);

        if (initialPlayer != 'X' && initialPlayer != 'O') {
            throw new IllegalArgumentException("Invalid player");
        }
        //this.initialPlayer=initialPlayer;
        actualPlayer = initialPlayer;

        grid = new char[3][3];
        plays = 0;
        finished = false;
    }

    // Identify first player
    public void changePlayer() {
        if (actualPlayer == 'X') {
            actualPlayer = 'O';
        } else if (actualPlayer == 'O') {
            actualPlayer = 'X';
        }
    }

    @Override
    public char getActualPlayer() {
        return actualPlayer;
    }

    @Override
    public boolean setJogada(int lin, int col) {
        lin--;
        col--;

        if (lin > grid.length - 1 || lin < 0 || col > grid.length || col < 0) {
            return false;
        }
        grid[lin][col] = actualPlayer;
        plays++;

        if (searchCombination()) {
            winner = actualPlayer;
        }

        changePlayer();

        return true;
    }

    @Override
    public boolean isFinished() {
        if (searchCombination()) {
            return true;
        } else if (plays == TOTAL_PLAYS) {
            winner = ' ';
            return true;
        }
        return false;
    }

    @Override
    public char checkResult() {
        return winner;
    }

    private boolean searchCombination() {
        String seqDiagonal_LeftRight = "";
        String seqDiagonal_RightLeft = "";

        for (int col = 0; col < grid.length; col++) {
            String seqHorizontal = "";
            String seqVertical = "";

            for (int lin = 0; lin < grid.length; lin++) {
                seqHorizontal += grid[lin][col];
                seqVertical += grid[col][lin];
            }

            seqDiagonal_LeftRight += grid[col][(grid.length - 1) - col];
            seqDiagonal_RightLeft += grid[col][col];

            if (checkWinnerSeq(seqHorizontal) || checkWinnerSeq(seqVertical) || checkWinnerSeq(seqDiagonal_LeftRight) || checkWinnerSeq(seqDiagonal_RightLeft)) {
                return true;
            }
        }
        return false;
    }

    private boolean checkWinnerSeq(String seq) {
        return seq.equals("XXX") || seq.equals("OOO");
    }
}
