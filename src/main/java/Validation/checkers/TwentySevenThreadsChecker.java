/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.checkers;

import Board.SudokuBoard;
import Validation.CheckResult;
import Validation.factory.RuleMaker;
import Validation.workers.SudokuWorker;
import Validation.workers.WorkerType;
import java.util.ArrayList;

/**
 *
 * @author Ibrahim
 */
public class TwentySevenThreadsChecker implements SudokuChecker {
    private final RuleMaker maker;
    private ArrayList<SudokuWorker> workers;
    
    public TwentySevenThreadsChecker(RuleMaker maker){
        this.maker = maker;
    }
    
    @Override 
    public CheckResult validate(SudokuBoard board){
        for(int i = 0; i<9; i++){
           workers.add(new SudokuWorker(i, board, WorkerType.ROW_ONE));
           
        }
        
        for(int i = 9; i<18; i++){
           workers.add(new SudokuWorker(i, board, WorkerType.COLUMN_ONE));
           
        }
        
        for(int i = 0; i<9; i++){
           workers.add(new SudokuWorker(i, board, WorkerType.BOX_ONE));
           
        }
    }
}
