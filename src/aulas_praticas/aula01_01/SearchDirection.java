/**
 * PDS 2018
 *
 */
package aulas_praticas.aula01_01;

/**
 * The directions you can search in a puzzle
 */
enum SearchDirection {
    UP(0, -1),
    DOWN(0, 1),
    RIGHT(1, 0),
    LEFT(-1, 0),
    UPRIGHT(1, -1),
    UPLEFT(-1, -1),
    DOWNRIGHT(1, 1),
    DOWNLEFT(-1, 1);

    private final int x;
    private final int y;

    SearchDirection(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}