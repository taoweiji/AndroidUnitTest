package cn.taoweiji.a1javaunit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Wiki on 16/8/14.
 */
@RunWith(value = Parameterized.class)
public class ParameterizedTest {
    private int expected;
    private int param0;
    private int param1;
    @Parameterized.Parameters
    public static Collection<Integer[]> getTestParameters() {
        return Arrays.asList(new Integer[][]{
                {2, 1, 1},
                {4, 2, 2},
                {5, 3, 3}
        });
    }
    public ParameterizedTest(int expected, int param0, int param1) {
        this.expected = expected;
        this.param0 = param0;
        this.param1 = param1;
    }
    @Test
    public void add() throws Exception {
        int result = Compute.add(param0, param1);//错误示范
        Assert.assertEquals(expected, result);
    }
}
