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
}
