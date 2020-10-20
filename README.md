# The Transaction Analyser
#### Let's start by installing the project


1. Clone the project from [github](https://github.com/BigPotatoo/TheTransactionAnalyser.git).
2. Open project in any IDE.
3. Open class [Runner.java](./src/main/java/com/example/thetransactionanalyser/Runner.java) from project.
4. Change the content `String path` to your file `CSV`. How should it look CSV file [example.csv](./src/main/resources/example.csv).<br/>
5. Launch class `Runner.java`
---
#### Input
Given the above CSV file and the following input arguments
```
fromDate: 20/08/2018 12:00:00
toDate: 20/08/2018 13:00:00
merchant: Kwik-E-Mart
```
#### The output will be:
```
Number of transactions = 1
Average Transaction Value = 59.99
```
#### Technologies
java 11, lombok, opencsv, junit.
