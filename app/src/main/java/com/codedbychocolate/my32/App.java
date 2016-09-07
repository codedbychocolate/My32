package com.codedbychocolate.my32;

import android.app.Application;
import android.content.Context;

/**
 * CodedByChocolate on 06/09/2016.
 */
public class App extends Application{
    static AppSharedHelper prefs;
    static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
        prefs = new AppSharedHelper(context);
    }

    public static AppSharedHelper getPrefsInstance() {

        if (prefs == null) {
            prefs = new AppSharedHelper(context);
        }

        return prefs;
    }
}
