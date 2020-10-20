package com.example.thetransactionanalyser.service;

import com.example.thetransactionanalyser.model.Transaction;
import org.junit.Test;

import java.util.List;

public class CsvParserTest {

    @Test
    public void readCsvFile() {
        List<Transaction> transactionList = new CsvParser().readCsvFile("src/main/resources/example.csv");
        transactionList.forEach(System.out::println);
    }
}