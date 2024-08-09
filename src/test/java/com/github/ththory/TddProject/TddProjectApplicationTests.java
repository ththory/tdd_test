package com.github.ththory.TddProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TddProjectApplicationTests {

    @Test
	public void testMultipication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }

}
