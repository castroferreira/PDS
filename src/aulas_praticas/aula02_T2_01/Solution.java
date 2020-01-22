package aulas_praticas.aula02_T2_01;

import java.util.Formatter;

/**
 * classe usada para armazenar a localiza��o de uma palavra no puzzle
 *
 */
public class Solution {

    private String palavra;
    private int x;
    private int y;
    private Direction direction;

    /**
     *
     * @param palavra - palavra da solu��o
     */
    public Solution(String palavra) {
        this.palavra = palavra;
        this.x = -1;
        this.y = -1;
        this.direction = Direction.NONE;
    }

    /**
     *
     * @param palavra - palavra da solu��o
     * @param x - coluna onde a palavra est�
     * @param y - linha onde a palavra est�
     * @param dir - dire��o para a qual a palavra est� orientada
     */
    public Solution(String palavra, int x, int y, Direction dir) {
        this.palavra = palavra;
        this.x = x;
        this.y = y;
        this.direction = dir;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public int getY() {
        return y;
    }

    /**
     *
     * usado para indicar a dire��o da palavra no puzzle
     *
     */
    public enum Direction {
        NONE, LEFT, RIGHT, DOWN, UP, DOWNLEFT, DOWNRIGHT, UPLEFT, UPRIGHT;
    }

    public String toString() {

        StringBuilder bs = new StringBuilder();
        Formatter f = new Formatter(bs);
        f.format("%-10s %-4d %d,%-3d %-10s", palavra.toUpperCase(), palavra.length(), y, x, direction.toString());
        f.close();
//		palavra.toUpperCase() + "\t\t"+ palavra.length() + "\t" + x + "," + y + "\t" + direction.toString() + "\n"

        return bs.toString();
    }
}