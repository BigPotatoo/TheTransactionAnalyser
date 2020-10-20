package com.example.thetransactionanalyser.model;

import com.example.thetransactionanalyser.service.LocaleDataTimeConverter;
import com.opencsv.bean.CsvBindByPosition;
import com.opencsv.bean.CsvCustomBindByPosition;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @CsvBindByPosition(position = 0)
    private  String Id;
    @CsvCustomBindByPosition(position = 1, converter = LocaleDataTimeConverter.class)
    private LocalDateTime Date;
    @CsvBindByPosition(position = 2)
    private BigDecimal Amount;
    @CsvBindByPosition(position = 3)
    private String Merchant;
    @CsvBindByPosition(position = 4)
    private String Type;
    @CsvBindByPosition(position = 5)
    private String RelatedTransaction;
}