/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Validation.checkers;

import Board.SudokuBoard;
import Validation.CheckResult;

/**
 *
 * @author pola-nasser13
 */
public interface SudokuChecker {
    CheckResult validate(SudokuBoard board);
}
