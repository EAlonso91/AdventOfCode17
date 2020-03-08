package test;

import org.junit.Assert;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;

import main.CorruptionChecksum;
import main.CorruptionChecksum2;

public class CorruptionChecksumTest {

    @Test
    public void calculateChecksum() throws IOException {
        Assert.assertEquals(18, CorruptionChecksum.calculateChecksum("src/files/PuzzleInput2_test.txt"));
    }

    @Test
    public void calculateChecksum2() throws IOException {
        Assert.assertEquals(9, CorruptionChecksum2.calculateChecksum("src/files/PuzzleInput2_test2.txt"));
    }
}