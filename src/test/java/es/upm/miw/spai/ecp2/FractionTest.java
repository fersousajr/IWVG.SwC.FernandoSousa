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
        assertFalse(new Fraction(2, 3).isImproper());
        assertTrue(new Fraction(3, 2).isImproper());
        assertTrue(new Fraction(2, 2).isImproper());
    }

    @Test
    public final void testIsEquivalent() {
    	Fraction f1 = new Fraction(2, 3);
    	Fraction f2 = new Fraction(4, 6);
    	assertTrue(f1.isEquivalent(f2));
    	
    	f2 = new Fraction(3, 4);
    	assertFalse(f1.isEquivalent(f2));
    }
    
    @Test
    public void testGreaterThan() {
    	
    	assertTrue(new Fraction(1, 2).greaterThan(new Fraction(2, 5)));
    	assertFalse(new Fraction(0, 2).greaterThan(new Fraction(1, 2)));
    }
    
}
