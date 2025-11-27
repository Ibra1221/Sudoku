/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Board.BoardLoader;
import Board.SudokuBoard;
import Validation.CheckResult;
import Validation.checkers.SudokuChecker;
import Validation.factory.CheckerFactory;
import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author pola-nasser13
 */
public class CheckService {
    private final String csvFilePath;
    private final int mode;
    
    public CheckService(String csvFilePath, int mode) {
        this.csvFilePath = csvFilePath;
        this.mode = mode;
    }
    
    public String getValidationReport() {
        try {
            BoardLoader loader = new BoardLoader();
            SudokuBoard originalBoard = loader.load(csvFilePath);
            SudokuBoard boardCopy = originalBoard.copy();
            
            SudokuChecker checker = CheckerFactory.createChecker(mode);
            CheckResult result = checker.validate(boardCopy);
            
            if (result.isPassed()) {
                return "VALID";
            } else {
                return buildErrorReport(result.getErrors());
            }
            
        } catch (Exception e) {
            return "ERROR: " + e.getMessage();
        }
    }
    
    private String buildErrorReport(ArrayList<String> errors) {
        StringBuilder report = new StringBuilder();
        report.append("INVALID\n");
        
        ArrayList<String> rowErrors = new ArrayList<>();
        ArrayList<String> colErrors = new ArrayList<>();
        ArrayList<String> boxErrors = new ArrayList<>();
        
        for (int i = 0; i < errors.size(); i++) {
            String error = errors.get(i);
            if (error.startsWith("ROW")) {
                rowErrors.add(error);
            } else if (error.startsWith("COL")) {
                colErrors.add(error);
            } else if (error.startsWith("BOX")) {
                boxErrors.add(error);
            }
        }
        
        for (int i = 0; i < rowErrors.size(); i++) {
            report.append(rowErrors.get(i)).append("\n");
        }
        
        if (!rowErrors.isEmpty() && (!colErrors.isEmpty() || !boxErrors.isEmpty())) {
            report.append("------------------------------------------\n");
        }
        
        for (int i = 0; i < colErrors.size(); i++) {
            report.append(colErrors.get(i)).append("\n");
        }
        
        if (!colErrors.isEmpty() && !boxErrors.isEmpty()) {
            report.append("------------------------------------------\n");
        }
        
        for (int i = 0; i < boxErrors.size(); i++) {
            report.append(boxErrors.get(i)).append("\n");
        }
        
        return report.toString();
    }
}