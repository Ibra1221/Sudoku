/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;

/**
 *
 * @author pola-nasser13
 */
public class SudokuBoard {
    private int[][] grid;

    public SudokuBoard(int[][] grid) {
        this.grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.grid[i][j] = grid[i][j];
            }
        }
    }

    public SudokuBoard(SudokuBoard other) {
        this.grid = new int[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                this.grid[i][j] = other.grid[i][j];
            }
        }
    }

    public SudokuBoard copy() {
        return new SudokuBoard(this);
    }

    public int getValue(int row, int col) {
        return grid[row][col];
    }

    public int[] getRow(int rowIndex) {
        int[] row = new int[9];
        for (int i = 0; i < 9; i++) {
            row[i] = grid[rowIndex][i];
        }
        return row;
    }

    public int[] getColumn(int colIndex) {
        int[] column = new int[9];
        for (int i = 0; i < 9; i++) {
            column[i] = grid[i][colIndex];
        }
        return column;
    }

    public int[] getBox(int boxIndex) {
        int boxRow = boxIndex / 3;
        int boxCol = boxIndex % 3;
        int[] box = new int[9];
        int idx = 0;
        for (int r = boxRow * 3; r < boxRow * 3 + 3; r++) {
            for (int c = boxCol * 3; c < boxCol * 3 + 3; c++) {
                box[idx++] = grid[r][c];
            }
        }
        return box;
    }
}