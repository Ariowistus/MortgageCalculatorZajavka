package com.comapny.package18.service;

import com.comapny.package18.model.InputData;

public interface PrintingService {

    String INTEREST_SUM = "SUMA ODSETEK";
    String RATE_NUMBER = "NR: ";
    String YEAR = "ROK: ";
    String MONTH = "MIESIĄC: ";
    String DATE = "DATA: ";

    String MONTHS = " MIESIECY";

    String RATE = "RATA";

    String INTEREST = "OPROCENTOWANIE: ";
    String CAPITAL = "KAPITAL";

    String LEFT = "POZOSTAŁO";

    String MORTGAGE_AMOUNT = "KWOTA KREDYTU: ";

    String MORTAGE_PERIOD = "OKRES KREDYTOWANIA: ";


    String CURRENCY = " Zł ";
    String NEW_LINE = "\n";
    String PERCENT = "%";

    void printInputDataInfo(final InputData inputData);
}
