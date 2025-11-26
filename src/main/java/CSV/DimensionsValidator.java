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
public class DimensionsValidator {
    
    public DimensionsValidator() {
    }
    
    public static void validateDimensions(List<List<String>> records) {
        if (records == null || records.isEmpty()) {
            throw new IllegalArgumentException("CSV file is empty");
        }
        
        if (records.size() != 9) {
            throw new IllegalArgumentException("It's not 9 rows");
        }
        
        for (int i = 0; i < records.size(); i++) {
            if (records.get(i).size() != 9) {
                throw new IllegalArgumentException("It's not 9 Columns for all rows");
            }
        }
    }
}
