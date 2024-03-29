package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortingWordTest {
    SortingWord sortingWord;

    @Before
    public void setUp() throws Exception {
        sortingWord = new SortingWord();
    }

    @After
    public void tearDown() throws Exception {
        sortingWord = null;
    }
    @Test
    public void givenStringShouldReturnSortedString() {
        String actualResult= sortingWord.stringInput("world best batsmen kohli");
        String expected="[batsmen, best, kohli, world]";
        assertEquals(expected,actualResult);
    }
    @Test
    public void givenInputNullShouldReturnErrorMessage() {
        String actualResult= sortingWord.stringInput(null);

        assertEquals("Should Not Be Null",actualResult);
    }



}