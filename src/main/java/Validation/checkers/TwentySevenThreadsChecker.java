/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.checkers;

import Board.SudokuBoard;
import Validation.CheckResult;
import Validation.factory.RuleMaker;
import Validation.rules.ValidationRule;
import Validation.workers.SudokuWorker;
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
        workers = new ArrayList<SudokuWorker>();
    }
    
    @Override 
    public CheckResult validate(SudokuBoard board){
        workers.clear();
        for(int i = 0; i<9; i++){
            ValidationRule rule = maker.makeSingleBoxRule(i);
           workers.add(new SudokuWorker(board,rule));
        }
        
        for(int i = 0; i<9; i++){
          ValidationRule rule = maker.makeSingleColumnRule(i);
           workers.add(new SudokuWorker(board,rule));
        }
        
        for(int i = 0; i<9; i++){
           ValidationRule rule = maker.makeSingleRowRule(i);
           workers.add(new SudokuWorker(board,rule));
        }
        
        for(int i = 0; i < workers.size(); i++){
            workers.get(i).start();
        }
        for(int i = 0; i < workers.size(); i++){
            try {
                workers.get(i).join();
            }
            catch (InterruptedException e){
                System.out.println("An interrupted exception has occurred");
            }
        }
        ArrayList<String> allErrors = new ArrayList<>();
        
        for(SudokuWorker worker : workers){
            allErrors.addAll(worker.getError());
        }
        if (allErrors.isEmpty()) {
            return CheckResult.success();
        } else {
            return CheckResult.failure(allErrors);
        }
    }
}
