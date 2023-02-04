package com.comapny.package18;

import com.comapny.package18.model.InputData;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        InputData inputData = new InputData()
                .withAmount(new BigDecimal("298000"))
                .withMonthsDuration(BigDecimal.valueOf(160));


    }
}
