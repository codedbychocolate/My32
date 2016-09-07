package com.codedbychocolate.my32;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by Pat O'Shea on 07/09/2016.
 */
public class OnBoardingActivity extends Activity{
    AppSharedHelper prefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);
        prefs = App.getPrefsInstance();

        TextView textView = (TextView) findViewById(R.id.onboarding_title);
        textView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                prefs.setFirstBoot(false); //turn off first_boot for next run
                startActivity(new Intent(OnBoardingActivity.this,LoginActivity.class));
                overridePendingTransition(0,0);
            }

        });

    }

}
