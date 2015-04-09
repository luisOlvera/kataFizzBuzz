package test;

import cls.fizzBussClass;

import static org.junit.Assert.*;

public class fizzBussClassTest {

    @org.junit.Test
    public void testIsFizzBuss() throws Exception {
        fizzBussClass fizzBuss = new fizzBussClass();
    assertEquals(null, fizzBuss.isFizzBuss(1) );
    }
}