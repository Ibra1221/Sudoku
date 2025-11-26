/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV;

import java.util.List;

/**
 *
 * @author pola-nasser13
 */
public class Converter {
    
    private Converter() {}
    
    public static int[][] convertToIntBoard(List<List<String>> records) {
        int[][] board = new int[9][9];
        
        for (int row = 0; row < 9; row++) {
            List<String> rowData = records.get(row);
            for (int col = 0; col < 9; col++) {
                board[row][col] = parseInt(rowData.get(col), row, col);
            }
        }
        
        return board;
    }
    
    private static int parseInt(String value, int row, int col) {
        String trimmedValue = value.trim();
        
        if (trimmedValue.isEmpty()) {
            throw new IllegalArgumentException(
                String.format("Cell [%d,%d] is empty", row + 1, col + 1)
            );
        }
        
        try {
            int number = Integer.parseInt(trimmedValue);
            
            if (number < 1 || number > 9) {
                throw new IllegalArgumentException(
                    String.format("Cell [%d,%d]: Value %d must be between 1.....9", row + 1, col + 1, number)
                );
            }
            
            return number;
            
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(
                String.format("Cell [%d,%d]: '%s' is not a valid number", row + 1, col + 1, value)
            );
        }
    }
}