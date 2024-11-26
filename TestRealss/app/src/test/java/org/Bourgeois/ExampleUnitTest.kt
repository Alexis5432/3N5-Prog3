package org.Bourgeois

import junit.framework.TestCase.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test


class ExampleUnitTest {
    @Test
    fun testValidEmails() {
        assertTrue(isValidEmail("bob@smith.org"))
        assertTrue(isValidEmail("bob@smith.org"))
        assertTrue(isValidEmail("a.b.c@pipo.com"))
        assertTrue(isValidEmail("Rodgere.Federer@tennis.info"))
    }

    @Test

        fun testInvalidEmails() {
            assertFalse(isValidEmail("bob@smith"))
            assertFalse(isValidEmail("a..b@popi.org"))
            assertFalse(isValidEmail("john.doe@.com"))
            assertFalse(isValidEmail("john.doe@plop.c"))
        }

}