package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void caseWhenAmount0Test() {
        Assert.assertEquals(0, service.remain(0));
    }

    @Test
    public void caseWhenAmount1Test() {
        Assert.assertEquals(0, service.remain(1));
    }

    @Test
    public void caseWhenAmount500Test() {
        Assert.assertEquals(500, service.remain(500));
    }

    @Test
    public void caseWhenAmount999Test() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void caseWhenAmount1000Test() {
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void caseWhenAmount1001Test() {
        Assert.assertEquals(0, service.remain(1001));
    }

    @Test
    public void caseWhenAmountNegativeTest() {
        Assert.assertEquals(0, service.remain(-1));
    }
}
