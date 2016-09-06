package com.codedbychocolate.my32;

import android.app.Activity;
import android.os.Bundle;

/**
 * CodedByChocolate on 06/09/2016.
 */
public class SplashActivity extends Activity{
    //decide what screen to go to next
    //if logged in continue
    //if not logged in go to login
    //if app goes into back ground - always restart with the splash screen onResume (like SnapChat)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }


}
