package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FractionTest {

    @Test
    public final void testIsProper() {
        assertTrue(new Fraction(2, 3).isProper());
        assertFalse(new Fraction(3, 2).isProper());
        assertFalse(new Fraction(2, 2).isProper());
    }

    @Test
    public final void testIsImproper() {
        assertFalse(new Fraction(2, 3).isProper());
        assertTrue(new Fraction(3, 2).isProper());
        assertTrue(new Fraction(2, 2).isProper());
    }

}
