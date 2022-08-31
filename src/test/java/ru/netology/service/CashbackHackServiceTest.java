package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remain() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1;
        int actual = service.remain(999);



    }
}