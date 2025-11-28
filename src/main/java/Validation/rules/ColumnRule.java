/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.rules;

import Validation.rules.BaseRule;
import Board.SudokuBoard;
import Validation.CheckType;
import java.util.ArrayList;

/**
 *
 * @author pola-nasser13
 */
public class ColumnRule extends BaseRule {
    
    @Override
    public ArrayList<String> check(SudokuBoard board) {
        ArrayList<String> problems = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            int[] col = board.getColumn(i);
            scanDuplicates(col, i + 1, problems, CheckType.COL);
        }
        
        return problems;
    }
}

