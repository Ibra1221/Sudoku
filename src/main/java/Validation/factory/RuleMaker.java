/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Validation.factory;

import Validation.rules.ValidationRule;


/**
 *
 * @author pola-nasser13
 */
public interface RuleMaker {
    ValidationRule makeRowRule();
    ValidationRule makeColumnRule();
    ValidationRule makeBoxRule();
    ValidationRule makeSingleBoxRule(int index);
    ValidationRule makeSingleColumnRule(int index);
    ValidationRule makeSingleRowRule(int index);
}
