package org.example.lecture3.lecture3;

import static org.junit.Assert.assertEquals;

import org.example.lecture3.task;
import org.junit.Test;

public class test2 {

    @Test
    public void TestToTen() {
        assertEquals("X", task.intToRoman(10));
    }

    @Test
    public void TestToHundred(){
        assertEquals("C", task.intToRoman(100));

    }

    @Test
    public void TestToThousand(){
        assertEquals("M", task.intToRoman(1000));

    }

    @Test
    public void TestToUnits() {
        assertEquals("X", task.intToRoman(10));
    }



}
