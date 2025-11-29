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
 * @author Ibrahim
 */
public class SingleRowRule extends ConcurrentBaseRule {
    public SingleRowRule(int index){
        super(index);
    }
    
    @Override
    public ArrayList<String> check(SudokuBoard board) {
        ArrayList<String> problems = new ArrayList<>();
            int index = super.getIndex();
            int[] row = board.getRow(index);
            scanDuplicates(row, index + 1, problems, CheckType.ROW);
        return problems;
    }
}
