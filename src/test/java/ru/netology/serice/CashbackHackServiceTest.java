package ru.netology.serice;

import org.testng.annotations.Test;
import ru.netology.service.CashbackHackService;

import static org.testng.AssertJUnit.assertEquals;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void caseWhenAmount0Test() {
        assertEquals(0, service.remain(0));
    }

    @Test
    public void caseWhenAmount1Test() {
        assertEquals(0, service.remain(1));
    }

    @Test
    public void caseWhenAmount500Test() {
        assertEquals(500, service.remain(500));
    }

    @Test
    public void caseWhenAmount999Test() {
        assertEquals(1, service.remain(999));
    }

    @Test
    public void caseWhenAmount1000Test() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void caseWhenAmount1001Test() {
        assertEquals(0, service.remain(1001));
    }

    @Test
    public void caseWhenAmountNegativeTest() {
        assertEquals(0, service.remain(-1));
    }
}
