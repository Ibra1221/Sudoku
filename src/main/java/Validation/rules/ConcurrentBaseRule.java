/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.rules;

/**
 *
 * @author Ibrahim
 */
public abstract class ConcurrentBaseRule extends BaseRule {
    private int index;
    public ConcurrentBaseRule(int index){
     this.index = index;   
    }
    
    public int getIndex(){
        return this.index;
    }
}
