package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    private Character [][] matrix;

    public Board(Character[][] matrix) {
        this.matrix = matrix;
    }

    public Boolean isInFavorOfX() {

        char x = 'X';
        return leftCol(x) || rightCol(x) || midCol(x) ||
                topRow(x) || middleRow(x) || bottomRow(x) ||
                NE(x) || NW(x);
    }

    public Boolean isInFavorOfO() {
        char o = 'O';
        return leftCol(o) || rightCol(o) || midCol(o) ||
                topRow(o) || middleRow(o) || bottomRow(o) ||
                NE(o) || NW(o);
    }

    public Boolean isTie() {
        return !isInFavorOfX() && !isInFavorOfO();
    }

    public String getWinner() {

        if(isInFavorOfO()) {
            return "O";
        }
        else if(isInFavorOfX()) {
            return "X";
        }
        else{
            return "";
        }
    }

    public boolean leftCol(Character c) {
        return (matrix[0][0] == c && matrix[1][0] == c && matrix[2][0] == c);
    }
    public boolean midCol(Character c) {
        return (matrix[0][1] == c && matrix[1][1] == c && matrix[2][1] == c);
    }

    public boolean rightCol(Character c) {
        return (matrix[0][2] == c && matrix[1][2] == c && matrix[2][2] == c);
    }
    public boolean topRow(Character c) {
        return (matrix[0][0] == c && matrix[0][1] == c && matrix[0][2] == c);
    }
    public boolean middleRow(Character c) {
        return (matrix[1][0] == c && matrix[1][1] == c && matrix[1][2] == c);
    }
    public boolean bottomRow(Character c) {
        return (matrix[2][0] == c && matrix[2][1] == c && matrix[2][2] == c);
    }
    public boolean NE(Character c) {
        return (matrix[2][0] == c && matrix[1][1] == c && matrix[0][2] == c);
    }
    public boolean NW(Character c) {
        return (matrix[2][2] == c && matrix[1][1] == c && matrix[0][0] == c);
    }

}

//Ultimately the winner should have a greater number of marks than the other one.
//Iterate through matrix, and log number of