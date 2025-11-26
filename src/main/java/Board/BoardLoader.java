/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Board;

import CSV.CsvReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;

/**
 *
 * @author pola-nasser13
 */
public class BoardLoader {
        private final CsvReader csvReader;
    public BoardLoader() {
        this.csvReader = CsvReader.getInstance();
    }
    
    public SudokuBoard load(String filePath) throws IOException, CsvValidationException {
        int[][] grid = csvReader.readSudokuBoard(filePath);
        return new SudokuBoard(grid);
    }
    
}
