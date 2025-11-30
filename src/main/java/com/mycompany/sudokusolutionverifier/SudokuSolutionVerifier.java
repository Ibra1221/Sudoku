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
        String csv = args[0];
        String m = args[1];
        
        try {
            int mode = Integer.parseInt(m);
            if (mode != 0 && mode != 3 && mode != 27) {
                System.out.println("Error: Mode must be(0, 3, or 27)");
                return;
            }
            CheckService checker = new CheckService(csv, mode);
            String result = checker.getValidationReport();
            System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("Error: Mode must be(0, 3, or 27)");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
