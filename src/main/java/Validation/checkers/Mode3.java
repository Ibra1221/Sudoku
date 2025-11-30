/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.checkers;
import Board.SudokuBoard;
import Validation.CheckResult;
import Validation.factory.RuleMaker;
import Validation.workers.SudokuWorker;
import java.util.ArrayList;

/**
 *
 * @author Pc
 */
public class Mode3 implements SudokuChecker {
    private final RuleMaker maker;
    
    public Mode3(RuleMaker maker) {
        this.maker = maker;
    }
    @Override
   public CheckResult validate(SudokuBoard board){
       SudokuWorker rowWorker = new SudokuWorker(board,maker.makeRowRule());
       SudokuWorker colWorker = new SudokuWorker(board,maker.makeColumnRule());
       SudokuWorker boxWorker = new SudokuWorker(board,maker.makeBoxRule());
       rowWorker.start();
       colWorker.start();
       boxWorker.start();
       try {
            rowWorker.join();
            colWorker.join();
            boxWorker.join();
        } catch (InterruptedException e) {
            return CheckResult.failure(new ArrayList<>());
        }
       ArrayList<String> rowErrors=rowWorker.getError();
       ArrayList<String> colErrors=colWorker.getError();
       ArrayList<String> boxErrors=boxWorker.getError();
       ArrayList<String> allErrors= new ArrayList<>();
       allErrors.addAll(rowErrors);
       allErrors.addAll(colErrors);
       allErrors.addAll(boxErrors);
       if(allErrors.isEmpty()){
           return CheckResult.success();
       }
       else{
           return CheckResult.failure(allErrors);
       }
       
   }
}
