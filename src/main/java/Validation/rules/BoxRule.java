/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.rules;

import Board.SudokuBoard;
import Validation.CheckType;
import java.util.ArrayList;

/**
 *
 * @author pola-nasser13
 */
public class BoxRule extends BaseRule {
    
    @Override
    public ArrayList<String> check(SudokuBoard board) {
        ArrayList<String> problems = new ArrayList<>();
        
        for (int i = 0; i < 9; i++) {
            int[] box = board.getBox(i);
            scanDuplicates(box, i + 1, problems, CheckType.BOX);
        }
        
        return problems;
    }    
}
