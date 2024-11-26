package org.example

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


class CodePostalTests {

    @Test
    fun TestZipCode(){
        assertTrue(isValidZipCode("H1Y1E1"))
        assertTrue(isValidZipCode("H1Y 1E1"))
        assertTrue(isValidZipCode("h3Y 1E8"))
        assertTrue(isValidZipCode("H1Y-1E1"))
        assertTrue(isValidZipCode("h3Y-1E8"))
    }

    @Test
    fun TestZipCodeInvalide(){
        assertFalse(isValidZipCode("H1Y   1E1"))
        assertFalse(isValidZipCode("H1Y_1E1"))
        assertFalse(isValidZipCode("h3Y 1TO"))
    }
}