package com.comapny.package18;

import com.comapny.package18.model.InputData;
import com.comapny.package18.service.PrintingService;
import com.comapny.package18.service.PrintingServiceImpl;

import java.math.BigDecimal;

public class Main {



    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(160));

        PrintingService printingService = new PrintingServiceImpl();
        printingService.printInputDataInfo(inputData);
    }
}
