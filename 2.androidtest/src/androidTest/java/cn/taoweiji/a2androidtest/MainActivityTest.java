package cn.taoweiji.a2androidtest;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by Wiki on 16/8/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    public MainActivityTest() {
        super(MainActivity.class);
    }
    public void testTextView(){
        assertEquals("Hello World!",getActivity().textView.getText().toString());
    }
}