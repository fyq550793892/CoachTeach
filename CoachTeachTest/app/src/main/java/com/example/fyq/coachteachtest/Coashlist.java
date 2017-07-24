package com.example.fyq.coachteachtest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import AutoLayoutUtils.AutoUtils;

public class Coashlist extends Activity {

    private String[] data={"Apple","Bannage","origin"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coashlist);
        AutoUtils.auto(this);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Coashlist.this,android.R.layout.simple_list_item_activated_1,data);
        ListView listView=(ListView)findViewById(R.id.list_item);
        listView.setAdapter(adapter);
    }
}
