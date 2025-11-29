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
public class SingleColumnRule extends ConcurrentBaseRule {
    
    
     public SingleColumnRule(int index){
        super(index);
    }
    
    @Override
    public ArrayList<String> check(SudokuBoard board) {
        ArrayList<String> problems = new ArrayList<>();
            int index = super.getIndex();
            int[] column = board.getColumn(index);
            scanDuplicates(column, index + 1, problems, CheckType.COL);
        return problems;
    }

}
