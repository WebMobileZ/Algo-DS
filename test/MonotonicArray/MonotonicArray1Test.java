package MonotonicArray;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MonotonicArray1Test {

    @Test
    public void test0() {
        int[] array = new int[]{1};
        MonotonicArray1 monotonicArray = new MonotonicArray1();
        assertEquals(monotonicArray.isMonotonicArray(array), false);
    }

    @Test
    public void test1() {
        int[] array = new int[]{-1,-5,-10};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), true);
    }

    @Test
    public void test2() {
        int[] array = new int[]{1,5,10};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), true);
    }

    @Test
    public void test3() {
        int[] array = new int[]{1,-5,10};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), false);
    }

    @Test
    public void test4() {
        int[] array = new int[]{1,1,1};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), true);
    }

    @Test
    public void test5() {
        int[] array = new int[]{};
        MonotonicArray monotonicArray = new MonotonicArray();
        assertEquals(monotonicArray.isMonotonicArray(array), false);
    }

}
