/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.factory;

import Validation.checkers.Mode3;
import Validation.checkers.SudokuChecker;
import Validation.checkers.SequentialChecker;
import Validation.checkers.TwentySevenThreadsChecker;
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

            case 3:
                return new Mode3(maker);

            case 27:
                return new TwentySevenThreadsChecker(maker);
            default:
                throw new IllegalArgumentException("Invalid mode: " + mode + ". Use 0, 3, or 27.");
        }
    }
}
