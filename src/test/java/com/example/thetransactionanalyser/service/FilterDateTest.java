package com.example.thetransactionanalyser.service;

import com.example.thetransactionanalyser.model.Transaction;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FilterDateTest {

    @Test
    public void filterDate() {
        List<Transaction> transactionList = new CsvParser().readCsvFile("src/main/resources/example.csv");
        FilterDate filter = new FilterDate(new LocaleDataTimeConverter());
        List<Transaction> actual = filter.filterDate(transactionList,"20/08/2018 12:50:02", "20/08/2018 14:07:10","MacLaren");
        List<Transaction> expected = new ArrayList<>();
        expected.add(transactionList.get(2));
        expected.add(transactionList.get(5));
        Assert.assertEquals(expected, actual);
    }
}