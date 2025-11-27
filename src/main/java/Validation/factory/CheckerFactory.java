/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.factory;

import Validation.checkers.SudokuChecker;
import Validation.checkers.SequentialChecker;
/**
 *
 * @author pola-nasser13
 */
public class CheckerFactory {
    
    public static SudokuChecker createChecker(int mode) {
        RuleMaker maker = new RuleFactory();
        
        switch (mode) {
            case 0:
                return new SequentialChecker(maker);
//            case 3:
//            case 27:
            default:
                throw new IllegalArgumentException("Invalid mode: " + mode + ". Use 0, 3, or 27.");
        }
    }
}
