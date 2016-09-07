package com.codedbychocolate.my32;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * CodedByChocolate on 06/09/2016.
 */
public class SplashActivity extends Activity{
    //decide what screen to go to next
    //if logged in continue
    //if not logged in go to login
    //if app goes into back ground - always restart with the splash screen onResume (like SnapChat)
    AppSharedHelper prefs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //start progress bar

        whereDoWeGoNow();
    }

    private void whereDoWeGoNow() {
        //not signed in - go to LoginActivity
        //signed in? - go to MainActivity
        prefs = App.getPrefsInstance();
        boolean userIsLoggedIn = isUserLoggedIn();
        boolean firstboot = prefs.isThisFirstBoot();

        if(firstboot){
            startActivity(new Intent(this, OnBoardingActivity.class));
            overridePendingTransition(0,0);
        }
        else {

            if (userIsLoggedIn) {
                startActivity(new Intent(this, MainActivity.class));
                overridePendingTransition(0,0);
            }
            else {
                startActivity(new Intent(this, LoginActivity.class));
                overridePendingTransition(0,0);
            }

        }

    }

    private boolean isUserLoggedIn() {
        return false;
    }

}
