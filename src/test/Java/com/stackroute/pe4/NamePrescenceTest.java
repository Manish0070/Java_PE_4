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
    public void givenStringShouldReturnHarryPresent() {
        String actualResult = namePrescence.stringMatcher("This is Harry?");
        assertEquals("Is Harry here ? true", actualResult);
    }

    @Test
    public void givenStringShouldReturnHarryNotPresent() {
        String actualResult = namePrescence.stringMatcher("This is Henry?");
        assertEquals("Is Harry here ? false", actualResult);
    }

    @Test
    public void givenStringShouldReturnNotNull() {
        String actualResult = namePrescence.stringMatcher("This is Harry?");
        assertNotNull(actualResult);
    }
}