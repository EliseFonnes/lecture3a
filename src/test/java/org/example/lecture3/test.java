package org.example.lecture3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class test {

 @Test
    void shouldConvertToOne() {
     assertEquals("I", task.intToRoman(1));
 }

 @Test
    void shouldConvertToTen() {
     assertEquals("X", task.intToRoman(10));
 }

 @Test
    void shouldConvertOneToTen() {
     String [] onetoten = {" ", "I", "II", "III", "IV", "V", "VI", "VII", "VIII","IX" ,"X"};
     for(int i = 0; i < 11; i++) {
         assertEquals(onetoten[i], task.intToRoman(i));
     }
 }

}
