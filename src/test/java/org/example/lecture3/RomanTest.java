package org.example.lecture3;



import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RomanTest {

    @Test
    public void shouldConvertToOne() {
        assertEquals("I", RomanNumbers.intToRoman(1));
    }

    @Test
    public void shouldConvertToTen() {
        assertEquals("X", RomanNumbers.intToRoman(10));
    }

    @Test
    public void shouldConvertOneToTen() {
        String[] onetoten = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        for (int i = 1; i < 11; i++) {
            assertEquals(onetoten[i], RomanNumbers.intToRoman(i));
        }
    }

    @Test
    public void shouldConvertToFifty() {
        assertEquals("L", RomanNumbers.intToRoman(50));
    }

}
