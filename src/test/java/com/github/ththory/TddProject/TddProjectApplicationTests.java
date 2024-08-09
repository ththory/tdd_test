package com.github.ththory.TddProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TddProjectApplicationTests {

    @Test
	public void testMultipication(){
        Dollar five = new Dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15), five.times(3));
    }

    @Test
    public void testEquals(){
        Dollar five = new Dollar(5);
        assertTrue(five.equals(new Dollar(5)));
        assertFalse(five.equals(new Dollar(6)));
    }
}
