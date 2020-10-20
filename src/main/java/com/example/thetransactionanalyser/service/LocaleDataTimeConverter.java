package com.example.thetransactionanalyser.service;

import com.opencsv.bean.AbstractBeanField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaleDataTimeConverter extends AbstractBeanField<Object, LocalDateTime> {
    @Override
    protected Object convert(String s)  {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        return LocalDateTime.parse(s,dtf);
    }

    public LocalDateTime toDateFormat(String date){
        return LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
    }
}