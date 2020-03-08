package test;

import main.InverseCaptcha;
import main.InverseCaptcha2;
import org.junit.Test;

import static org.junit.Assert.*;

public class InverseCaptchaTest {

    @Test
    public void testSolveCaptcha1() {
        assertEquals(3, InverseCaptcha.solveCaptcha("1122"));
    }

    @Test
    public void testSolveCaptcha2() {
        assertEquals(4, InverseCaptcha.solveCaptcha("1111"));
    }

    @Test
    public void testSolveCaptcha3() {
        assertEquals(0, InverseCaptcha.solveCaptcha("1234"));
    }

    @Test
    public void testSolveCaptcha4() {
        assertEquals(9, InverseCaptcha.solveCaptcha("91212129"));
    }



    @Test
    public void testSolveCaptcha5() {
        assertEquals(6, InverseCaptcha2.solveCaptcha("1212"));
    }

    @Test
    public void testSolveCaptcha6() {
        assertEquals(0, InverseCaptcha2.solveCaptcha("1221"));
    }

    @Test
    public void testSolveCaptcha7() {
        assertEquals(12, InverseCaptcha2.solveCaptcha("123123"));
    }

    @Test
    public void testSolveCaptcha8() {
        assertEquals(4, InverseCaptcha2.solveCaptcha("12131415"));
    }
}