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
public class keep2DecimalParameterizedTest {
    private String expected;
    private double param0;
    @Parameterized.Parameters
    public static Collection<Object[]> getTestParameters() {
        return Arrays.asList(new Object[][]{
                {"1.00", 1.002},
                {"2.15", 2.156},
                {"3.14", 3.141}
        });
    }
    public keep2DecimalParameterizedTest(String expected, double param0) {
        this.expected = expected;
        this.param0 = param0;
    }
    @Test
    public void add() throws Exception {
        Assert.assertEquals(expected, Compute.keep2Decimal(param0));
    }
}
