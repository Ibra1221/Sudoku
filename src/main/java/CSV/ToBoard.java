/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV;

import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author pola-nasser13
 */
public class ToBoard {
    private CsvReader csvReader;
    
    public ToBoard() {
        this.csvReader = CsvReader.getInstance();
    }
    
    public int[][] readSudokuBoard(String filePath) throws IOException, CsvValidationException {
        List<List<String>> records = csvReader.readCsvRecords(filePath);
        DimensionsValidator.validateDimensions(records);
        return Converter.convertToIntBoard(records);
    } 
}
