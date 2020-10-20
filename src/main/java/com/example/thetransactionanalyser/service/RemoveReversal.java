package com.example.thetransactionanalyser.service;

import com.example.thetransactionanalyser.model.Transaction;

import java.util.List;

public final class RemoveReversal {
    public final List<Transaction> removeReversalTransaction(List<Transaction> list) {
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getType().equalsIgnoreCase("REVERSAL")) {
                int finalI = i;
                list.removeIf(j -> list.get(finalI).getRelatedTransaction().equalsIgnoreCase(j.getId()));
            }
        }

        list.removeIf(j -> j.getType().equalsIgnoreCase("REVERSAL"));
        return list;
    }
}