package com.codedbychocolate.my32;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Pat O'Shea on 07/09/2016.
 */
public class AppSharedHelper {
    protected final SharedPreferences sharedPreferences;
    private final SharedPreferences.Editor editor;
    private static AppSharedHelper instance;

    public static class Constant {
        private static final String NAME = "My32";
        private static final String FIRST_BOOT = "FIRST_BOOT";
    }

    public static class Default {
        private static final boolean FIRST_BOOT = true;
    }

    public AppSharedHelper(Context context) {
        instance = this;
        this.sharedPreferences = context.getSharedPreferences(Constant.NAME, Context.MODE_PRIVATE);
        this.editor = this.sharedPreferences.edit();
        editor.apply();
    }

    public static AppSharedHelper getInstance() {
        if (instance == null) throw new NullPointerException("CoreSharedHelper was not initialized!");
        return instance;
    }


    public boolean isThisFirstBoot() {
        return sharedPreferences.getBoolean(Constant.FIRST_BOOT, Default.FIRST_BOOT);
    }

    public void setFirstBoot(boolean newValue){
        editor.putBoolean(Constant.FIRST_BOOT, newValue);
        editor.apply();
    }

}
