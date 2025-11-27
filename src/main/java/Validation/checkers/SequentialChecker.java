/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.checkers;

import Validation.factory.RuleMaker;
import Board.SudokuBoard;
import Validation.CheckResult;
import Validation.rules.ValidationRule;
import java.util.ArrayList;

/**
 *
 * @author pola-nasser13
 */
public class SequentialChecker implements SudokuChecker {
    private final RuleMaker maker;
    
    public SequentialChecker(RuleMaker maker) {
        this.maker = maker;
    }
    
    @Override
    public CheckResult validate(SudokuBoard board) {
        ArrayList<ValidationRule> rules = new ArrayList<>();
        rules.add(maker.makeRowRule());
        rules.add(maker.makeColumnRule());
        rules.add(maker.makeBoxRule());
        
        ArrayList<String> allErrors = new ArrayList<>();
        
        for (ValidationRule rule : rules) {
            allErrors.addAll(rule.check(board));
        }
        
        if (allErrors.isEmpty()) {
            return CheckResult.success();
        } else {
            return CheckResult.failure(allErrors);
        }
    }
}