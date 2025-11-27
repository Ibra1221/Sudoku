/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Validation.rules;

import Board.SudokuBoard;
import java.util.ArrayList;

/**
 *
 * @author pola-nasser13
 */
public interface ValidationRule {
    ArrayList<String> check(SudokuBoard board);
}
