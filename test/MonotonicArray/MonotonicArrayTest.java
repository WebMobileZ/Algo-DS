package MonotonicArray;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class MonotonicArrayTest {

    @Test
    public void test1() {
        int[] array = new int[]{-1,-5,-10,-1100,-1101, -1102, -9001};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), true);
    }

    @Test
    public void test2() {
        int[] array = new int[]{-1,5,-10};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), false);
    }

    @Test
    public void test3() {
        int[] array = new int[]{1,5,10};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), true);
    }

    @Test
    public void test4() {
        int[] array = new int[]{1,1,1};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), true);
    }


}
