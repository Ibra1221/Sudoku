/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CSV;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author pola-nasser13
 */
public class CsvReader {
    private static volatile CsvReader instance;

    private CsvReader() {
    }
    

    public static CsvReader getInstance() {
        if (instance == null) {
            synchronized (CsvReader.class) {
                if (instance == null) {
                    instance = new CsvReader();
                }
            }
        }
        return instance;
    }
    
    public List<List<String>> readCsvRecords(String filePath) throws IOException, CsvValidationException {
        List<List<String>> records = new ArrayList<>();
        
        try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        }
        
        return records;
    }
}    

