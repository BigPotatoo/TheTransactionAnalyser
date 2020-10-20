package com.example.thetransactionanalyser.service;

import com.example.thetransactionanalyser.model.Transaction;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
public class FilterDate {
    private final LocaleDataTimeConverter formatDateTime;

    public List<Transaction> filterDate(List<Transaction> transactionList, String fromDate, String toDate, String merchant){
        return transactionList.stream()
                .filter(c->c.getDate().isEqual(formatDateTime.toDateFormat(fromDate)) || c.getDate().isAfter(formatDateTime.toDateFormat(fromDate))
                        && c.getDate().isEqual(formatDateTime.toDateFormat(toDate)) || c.getDate().isBefore(formatDateTime.toDateFormat(toDate)))
                .filter(m->m.getMerchant().equalsIgnoreCase(merchant))
                .collect(Collectors.toList());
    }
}
