package com.example.lesson72preferencessimple2;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PrefActivity extends PreferenceActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref);
    }
}
