package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CashServiceTest {

    @Test

    public void testCashForRelaxation() {
        CashService service = new CashService();
        int expected = 3;
        int actual = service.calculate(10000,3000,20000);

        Assertions.assertEquals(expected, actual);

    }
}


