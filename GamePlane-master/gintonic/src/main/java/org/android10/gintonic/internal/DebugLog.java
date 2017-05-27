/**
 * Copyright (C) 2014 android10.org. All rights reserved.
 * @author Fernando Cejas (the android10 coder)
 */
package org.android10.gintonic.internal;

import android.util.Log;


public class DebugLog {

    private DebugLog() {}


    public static void log(String tag, String message) {
        Log.d(tag, message);
    }
}
