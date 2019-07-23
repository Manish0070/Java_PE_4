package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TransposeStringTest {
    TransposeString transposeString;

    @Before
    public void setUp() throws Exception {
        transposeString = new TransposeString();
    }


    @After
    public void tearDown() throws Exception {
        transposeString = null;
    }

    @Test
    public void givenAStringShouldReturnTransposeOfThatString(){
        String actualvalue = transposeString.reverseWord("This Is Manish");

        assertEquals("sihT sI hsinaM",actualvalue);
    }

    @Test
    public void givenANullShouldReturnError(){
        String actualvalue = transposeString.reverseWord(null);

        assertEquals("Should Not Be Null",actualvalue);
    }
}