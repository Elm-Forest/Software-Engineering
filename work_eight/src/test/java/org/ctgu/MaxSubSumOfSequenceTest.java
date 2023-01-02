package org.ctgu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple App.
 */
public class MaxSubSumOfSequenceTest {
    @Test
    public void testApp() {
        assertEquals(0, MaxSubSumOfSequence.getMaxSubSum(new int[]{}));
        assertEquals(0, MaxSubSumOfSequence.getMaxSubSum(new int[]{0}));
        assertEquals(1, MaxSubSumOfSequence.getMaxSubSum(new int[]{1}));
        assertEquals(0, MaxSubSumOfSequence.getMaxSubSum(new int[]{-1}));
        assertEquals(3, MaxSubSumOfSequence.getMaxSubSum(new int[]{1, 2}));
        assertEquals(8, MaxSubSumOfSequence.getMaxSubSum(new int[]{1, -2, 3, 5, -1}));
        assertEquals(6, MaxSubSumOfSequence.getMaxSubSum(new int[]{1, -2, 3, -8, 5, 1}));
        assertEquals(7, MaxSubSumOfSequence.getMaxSubSum(new int[]{1, -2, 3, -2, 5, 1}));
        assertEquals(10, MaxSubSumOfSequence.getMaxSubSum(new int[]{1, 2, 5, -5, 6, -9, 10}));
        assertEquals(24, MaxSubSumOfSequence.getMaxSubSum(new int[]{5, -9, 6, 4, 2, -3, -1, 5, 3, 8}));
    }
}
