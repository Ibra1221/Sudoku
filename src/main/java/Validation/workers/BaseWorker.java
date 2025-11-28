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
public abstract class BaseWorker extends Thread{
    
    protected SudokuBoard board;
    protected ArrayList<String> error;
    protected ValidationRule rule;
    
    protected BaseWorker( SudokuBoard board,  ValidationRule rule){
        this.board = board;
        this.rule = rule;
    }
    
    @Override
    public void run(){
        check();
    }
    
    public ArrayList<String> getError(){
    return this.error;
    }
    
    protected abstract void check();
}
