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
    public void GivenAStringContainsRequiredWordShouldReturnTrue(){

         String actualvalue = namePrescence.nameChecker("This Is Harry");
        System.out.println(actualvalue);

        assertEquals("Is Harry Here? true",actualvalue);
    }

    @Test
    public void GivenAStringNotContainsRequiredWordShouldReturnFalse(){

        String actualvalue = namePrescence.nameChecker("This Is Manish");
        System.out.println(actualvalue);

        assertEquals("Is Harry Here?false",actualvalue);
    }
}