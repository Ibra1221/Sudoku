/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.workers;

import Board.SudokuBoard;
import Validation.CheckResult;

/**
 *
 * @author Ibrahim
 */
public abstract class BaseWorker extends Thread{
    protected int index;
    protected SudokuBoard board;
    protected CheckResult result;
    
    protected BaseWorker(int index, SudokuBoard board){
        this.index = index;
        this.board = board;
    }
    
    @Override
    public void run(){
        result = check();
    }
    
    protected abstract CheckResult check();
}
