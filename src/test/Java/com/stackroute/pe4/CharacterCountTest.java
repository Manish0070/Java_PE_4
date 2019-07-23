package com.stackroute.pe4;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterCountTest {
    CharacterCount characterCount;

    @org.junit.Before
    public void setUp() throws Exception {
        characterCount = new CharacterCount();
    }

    @org.junit.After
    public void tearDown() throws Exception {
        characterCount = null;
    }
    @Test
    public void givenInputStringAndACharacterShouldReturnOccurenceOfCharacter(){
        String string = "This is an Example Of The Character";

        String actuavalue = characterCount.countCharacter("a",string);

        assertEquals("count is 4",actuavalue);
    }
    @Test
    public void givenInputNullAndACharacterShouldReturnNull(){
        String actuavalue = characterCount.countCharacter("a",null);
        assertEquals("Should Not Be Null",actuavalue);

    }

}