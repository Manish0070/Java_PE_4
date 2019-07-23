package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NamePrescenceTest {
    NamePrescence namePrescence;

    @Before
    public void setUp() throws Exception {
        namePrescence = new NamePrescence();
    }

    @After
    public void tearDown() throws Exception {
        namePrescence = null;
    }

    @Test
    public void inputStringChecksForWordHarry(){

        assertEquals(true, namePrescence.nameChecker("This is Harry"));
    }

    @Test
    public void inputStringChecksForWordHarryAndReturnFalse(){

        assertEquals(false, namePrescence.nameChecker("This is Henry"));
    }

    @Test
    public void inputStringChecksForNotEquality(){

        assertNotEquals(true, namePrescence.nameChecker("This is Henry"));
    }
}