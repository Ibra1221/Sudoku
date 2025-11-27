/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation.rules;

import Board.SudokuBoard;
import Validation.CheckType;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author pola-nasser13
 */
public abstract class BaseRule implements ValidationRule {
    
    @Override
    public abstract ArrayList<String> check(SudokuBoard board);
    
    protected void scanDuplicates(int[] data, int index, ArrayList<String> problems, CheckType type) {
        HashMap<Integer, ArrayList<Integer>> positions = new HashMap<>();
        
        for (int i = 0; i < data.length; i++) {
            int num = data[i];
            if (num != 0) {
                if (!positions.containsKey(num)) {
                    positions.put(num, new ArrayList<>());
                }
                positions.get(num).add(i + 1);
            }
        }
        
        for (HashMap.Entry<Integer, ArrayList<Integer>> entry : positions.entrySet()) {
            if (entry.getValue().size() > 1) {
                String problem = String.format("%s %d, #%d, %s", 
                    type, index, entry.getKey(), entry.getValue());
                problems.add(problem);
            }
        }
    }
}