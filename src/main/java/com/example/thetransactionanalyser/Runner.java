package com.example.thetransactionanalyser;

import com.example.thetransactionanalyser.model.Transaction;
import com.example.thetransactionanalyser.service.*;
import lombok.SneakyThrows;

import java.util.*;


public final class Runner {
    @SneakyThrows
    public static void main(String[] args){
        String path = "src/main/resources/example.csv";

        Scanner scanner = new Scanner(System.in);
        System.out.print("fromDate: ");
        String fromDate = scanner.nextLine();
        System.out.print("toDate: ");
        String toDate = scanner.nextLine();
        System.out.print("merchant: ");
        String merchant = scanner.nextLine();


        List<Transaction> transactionList = new RemoveReversal().
                removeReversalTransaction(new CsvParser().readCsvFile(path));

        Count count = new Count();
        FilterDate filter = new FilterDate(new LocaleDataTimeConverter());
        List<Transaction> filteredTransactionList = filter.filterDate(transactionList,fromDate,toDate,merchant);

        System.out.println("Number of transactions = " + filteredTransactionList.size());
        System.out.println("Average Transaction Value = " + count.averageTransactionValue(filteredTransactionList));
    }
}