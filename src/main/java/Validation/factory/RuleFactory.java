/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.factory;

import Validation.rules.ValidationRule;
import Validation.factory.RuleMaker;
import Validation.rules.ColumnRule;
import Validation.rules.RowRule;
import Validation.rules.BoxRule;
import Validation.rules.SingleBoxRule;
import Validation.rules.SingleColumnRule;
import Validation.rules.SingleRowRule;


/**
 *
 * @author pola-nasser13
 */
public class RuleFactory implements RuleMaker {
    
    @Override
    public ValidationRule makeRowRule() {
        return new RowRule();
    }
    
    @Override
    public ValidationRule makeColumnRule() {
        return new ColumnRule();
    }
    
    @Override
    public ValidationRule makeBoxRule() {
        return new BoxRule();
    }
    
    @Override
    public ValidationRule makeSingleBoxRule(int index) {
        return new SingleBoxRule(index);
    }
    
    @Override
    public ValidationRule makeSingleColumnRule(int index) {
        return new SingleColumnRule(index);
    }
 
    @Override
    public ValidationRule makeSingleRowRule(int index) {
        return new SingleRowRule(index);
    }
    
}
