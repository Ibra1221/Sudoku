/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.workers;

import Board.SudokuBoard;

/**
 *
 * @author Ibrahim
 */
public class SudokuWorker extends BaseWorker{
    
    private WorkerType type;
    
    public SudokuWorker(int index, SudokuBoard board, WorkerType type){
        super(index, board); 
        this.type = type;
    }
    @Override
    protected CheckResult check(){
    
    }
  
}
}
