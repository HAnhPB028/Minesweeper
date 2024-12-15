package GUI;

public class GameState {
    int[][] a;
    boolean[][] t;
    boolean[][] flag;

    public GameState(int[][] a, boolean[][] t, boolean[][] flag) {
        this.a = copyArray(a);
        this.t = copyArray(t);
        this.flag = copyArray(flag);
    }

    private int[][] copyArray(int[][] source) {
        int[][] destination = new int[source.length][];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i].clone();
        }
        return destination;
    }

    private boolean[][] copyArray(boolean[][] source) {
        boolean[][] destination = new boolean[source.length][];
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i].clone();
        }
        return destination;
    }
}
