package com.udacity.gradle.builditbigger;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.util.Pair;
import android.test.AndroidTestCase;
import android.util.Log;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.concurrent.ExecutionException;

/**
 * Test for Async mock task
 */
@RunWith(AndroidJUnit4.class)
public class EndpointsAsyncTaskMockTest extends AndroidTestCase {

    private Context mContext;
    private static final String LOG_TAG = EndpointsAsyncTaskMockTest.class.getSimpleName();

    @Override
    protected void setUp() throws Exception {
        mContext = InstrumentationRegistry.getContext();
    }

    @Test
    public void testAsync() {
        EndpointsAsyncTaskMock task = new EndpointsAsyncTaskMock();
        try {
            task.execute(new Pair<Context, String>(mContext, LOG_TAG));
            String result = task.get();
            Log.d(LOG_TAG, "testAsync: "+result);
            assertTrue("Returning a empty string.",!result.trim().equals(""));
            assertTrue("Connect timed out.",!result.trim().equals("connect timed out"));
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
