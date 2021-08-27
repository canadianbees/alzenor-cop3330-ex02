package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringInfoTest {

    @Test
    void numCharacters()
    {
        int len = "hello".length();

        assertEquals(5,len);
    }
}