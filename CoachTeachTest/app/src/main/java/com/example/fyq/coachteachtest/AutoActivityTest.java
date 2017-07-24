package com.example.fyq.coachteachtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

import AutoLayoutUtils.AutoUtils;

public class AutoActivityTest extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_test);
        AutoUtils.auto(this);

    }
}
