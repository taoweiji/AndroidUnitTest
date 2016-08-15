package cn.taoweiji.a3robolectric;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Wiki on 16/8/15.
 */
@RunWith(RobolectricTestRunner.class)
@Config(manifest = "src/main/AndroidManifest.xml",sdk = 21)
public class MainActivityTest {
    private MainActivity activity;
    @Before
    public void setUp() throws Exception {
        activity = Robolectric.setupActivity(MainActivity.class);
    }
    @Test
    public void testTextView() throws Exception {
        assertEquals("Hello World!",activity.textView.getText().toString());
    }
}