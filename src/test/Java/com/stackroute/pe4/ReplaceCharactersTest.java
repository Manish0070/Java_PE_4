package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceCharactersTest {
    ReplaceCharacters replaceCharacters;

    @Before
    public void setUp() throws Exception {
        replaceCharacters = new ReplaceCharacters();
    }


    @After
    public void tearDown() throws Exception {
        replaceCharacters = null;
    }
    @Test
    public void GivenInputStringAndACharcaterShouldReplaceCharacterInString(){

        String actualvalue = replaceCharacters.characterReplace("Manish",'M');
    }
    @Test
    public void GivenInputNullAndACharcaterShouldReturnError(){

        String actualvalue = replaceCharacters.characterReplace(null,'M');
        assertEquals("Not Null",actualvalue);
    }
}