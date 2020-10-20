package com.example.thetransactionanalyser.service;

import com.example.thetransactionanalyser.model.Transaction;
import lombok.SneakyThrows;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public final class Count {
    @SneakyThrows
    public final BigDecimal averageTransactionValue(List<Transaction> list){
        return list.stream()
                .map(Transaction::getAmount)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .divide(BigDecimal.valueOf(list.size()),RoundingMode.CEILING);
    }
}