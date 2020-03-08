package test;

import org.junit.Test;

import static org.junit.Assert.*;

import main.SpiralMemory;

public class SpiralMemoryTest {

    @Test
    public void calculateDistance1() {
        assertEquals(0, SpiralMemory.calculateSteps(1));
    }

    @Test
    public void calculateDistance2() {
        assertEquals(3,SpiralMemory.calculateSteps(12));
    }

    @Test
    public void calculateDistance3() {
        assertEquals(2,SpiralMemory.calculateSteps(23));
    }

    @Test
    public void calculateDistance4() {
        assertEquals(31,SpiralMemory.calculateSteps(1024));
    }
}