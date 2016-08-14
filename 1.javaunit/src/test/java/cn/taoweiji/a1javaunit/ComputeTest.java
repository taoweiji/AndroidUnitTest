package cn.taoweiji.a1javaunit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Wiki on 16/8/14.
 */
public class ComputeTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("每个单元测试前都会执行,通常用于做一些初始化");
    }
    @After
    public void tearDown() throws Exception {
        System.out.println("每个单元测试后都会执行,通常用于做一些回收工作");
    }
    @Test
    public void add() throws Exception {
        int result = Compute.add(1,3);//错误示范
        Assert.assertEquals(3,result);
    }
    @Test
    public void ride() throws Exception {
        int result = Compute.ride(1,2);
        Assert.assertEquals(2,result);
    }
}