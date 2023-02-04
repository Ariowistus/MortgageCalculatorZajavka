package com.comapny.package18.service;

import com.comapny.package18.model.InputData;

public class MortgageCalculationServiceImpl implements MortgageCalculationService {

    private final PrintingService printingService;

    public MortgageCalculationServiceImpl(PrintingService printingService) {
        this.printingService = printingService;
    }
    @Override
    public void calculate(InputData inputData) {
         printingService.printInputDataInfo(inputData);
    }
}
