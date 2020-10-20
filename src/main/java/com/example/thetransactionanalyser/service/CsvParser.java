package com.example.thetransactionanalyser.service;

import com.example.thetransactionanalyser.model.Transaction;
import com.opencsv.bean.CsvToBeanBuilder;
import lombok.SneakyThrows;

import java.io.FileReader;
import java.util.List;

public class CsvParser {
    @SneakyThrows
    public final List<Transaction> readCsvFile(String filePath) {
        FileReader reader = new FileReader(filePath);
        List<Transaction> csvToBean = new CsvToBeanBuilder<Transaction>(reader)
                .withType(Transaction.class)
                .withSeparator(',')
                .build()
                .parse();
        //Sorting if the date is not in the correct order
        //csvToBean.sort(Comparator.comparing(Transaction::getDate));
        return csvToBean;
    }
}