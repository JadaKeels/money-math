package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {

        float floatValue = 0.0f;
        double doubleValue = 0.0;
        BigDecimal bigDecimalValue = BigDecimal.ZERO;
    }
}

for (int i = 1; i <= 10; i++){

floatValue +=0.10f;
doubleValue +=0.10;
bigDecimalValue =bigDecimalValue.

add(new BigDecimal("0.10"));

        System.out.

println(
            "Iteration "+i +
                " | Float: "+floatValue+
                " | Double: "+doubleValue+
                " | BigDecimal: "+bigDecimalValue
);
        }


