/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;

import CSV.ToBoard;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;

/**
 *
 * @author pola-nasser13
 */
public class BoardLoader {
    private ToBoard ToBoard;
    
    public BoardLoader() {
        this.ToBoard = new ToBoard();
    }

    public SudokuBoard load(String filePath) throws IOException, CsvValidationException {
        int[][] grid = ToBoard.readSudokuBoard(filePath);
        return new SudokuBoard(grid);
    }

}
