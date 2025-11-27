/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sudokusolutionverifier;

import Services.CheckService;

/**
 *
 * @author pola-nasser13
 */
public class SudokuSolutionVerifier {

    public static void main(String[] args) {
        String csvFilePath = "sudoku.csv";
        int mode = 0;
        
        CheckService checkService = new CheckService(csvFilePath, mode);
        String result = checkService.getValidationReport();
        System.out.println(result);
    }
}
