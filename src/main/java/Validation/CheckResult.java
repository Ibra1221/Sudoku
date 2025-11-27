/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import java.util.ArrayList;

/**
 *
 * @author pola-nasser13
 */
public class CheckResult {
    private final boolean passed;
    private final ArrayList<String> errors;
    
    private CheckResult(boolean passed, ArrayList<String> errors) {
        this.passed = passed;
        this.errors = new ArrayList<>(errors);
    }
    
    public static CheckResult success() {
        return new CheckResult(true, new ArrayList<>());
    }
    
    public static CheckResult failure(ArrayList<String> errors) {
        return new CheckResult(false, errors);
    }
    
    public boolean isPassed() {
        return passed;
    }
    
    public ArrayList<String> getErrors() {
        return new ArrayList<>(errors);
    }
}
