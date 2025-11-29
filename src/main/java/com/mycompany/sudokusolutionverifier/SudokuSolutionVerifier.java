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
        
        int mode = 27;
        long startTime1 = System.currentTimeMillis();
        CheckService checkService = new CheckService(csvFilePath, mode);
        String result = checkService.getValidationReport();
        System.out.println(result);
        long endTime1 = System.currentTimeMillis();
        System.out.println("Time difference in mode 27:" + (endTime1 - startTime1));
        int mode2 = 0;
        long startTime2 = System.currentTimeMillis();
        CheckService checkService2 = new CheckService(csvFilePath, mode2);
        String result2 = checkService2.getValidationReport();
        System.out.println(result2);
        long endTime2 = System.currentTimeMillis();
        System.out.println("Time difference in mode 0:" + (endTime2 - startTime2));
        int mode3 = 3;
        long startTime3 = System.currentTimeMillis();
        CheckService checkService3 = new CheckService(csvFilePath, mode3);
        String result3 = checkService3.getValidationReport();
        System.out.println(result3);
        long endTime3 = System.currentTimeMillis();
        System.out.println("Time difference in mode 3:" + (endTime3 - startTime3));
    }
}
