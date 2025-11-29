/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.workers;

import Board.SudokuBoard;
import Validation.rules.ValidationRule;
import java.util.ArrayList;

/**
 *
 * @author Ibrahim
 */
public class SudokuWorker extends BaseWorker{
    
    
    
    public SudokuWorker( SudokuBoard board, ValidationRule rule){
        super(board, rule); 
        
    }
    @Override
    protected void check(){
        ArrayList<String> error = rule.check(board);
        super.error = error;
    }
  
}

