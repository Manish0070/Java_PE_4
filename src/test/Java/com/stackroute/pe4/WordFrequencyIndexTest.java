package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WordFrequencyIndexTest {
    WordFrequencyIndex wordFrequencyIndex;

    @Before
    public void setUp() throws Exception {
        wordFrequencyIndex  = new WordFrequencyIndex();
    }

    @After
    public void tearDown() throws Exception {
        wordFrequencyIndex = null;
    }

    @Test
    public void givenInputStringAndAWordShouldReturnIndexesOfThatWord() {
        String expected="Found at: 6 - 8\n" +
                "Found at: 14 - 16";
        String actual=wordFrequencyIndex.sortingFunction("don’t be evil.being evil is bad","be");
        assertEquals(expected,actual);
    }
    @Test
    public void givenInputStringNullShouldReturnErrorMessage() {
        String expected="Found at: 6 - 8\n" +
                "Found at: 14 - 16";

        String actual=wordFrequencyIndex.sortingFunction(null,"be");
        assertEquals("Should Not Be Null",actual);
    }

}