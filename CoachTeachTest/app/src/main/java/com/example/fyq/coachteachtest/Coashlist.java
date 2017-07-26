package com.example.fyq.coachteachtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import AutoLayoutUtils.AutoUtils;

public class Coashlist extends Activity {

    private List<Coach> coachList=new ArrayList<>();//此为数据
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coashlist);//加载List
        AutoUtils.auto(this);

        initCoach();//初始化数据
        CoachAdapter coachAdapter=new CoachAdapter(Coashlist.this,R.layout.coach_adapter,coachList);

        ListView listView=(ListView)findViewById(R.id.coach_list);
        listView.setAdapter(coachAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Coach coach=coachList.get(position);
                Toast.makeText(Coashlist.this,"hah",Toast.LENGTH_LONG);
            }
        });
    }

    private void initCoach(){
        for(int i=0;i<10;i++){
            Coach coachWang=new Coach("王大锤",R.drawable.up_red);
            coachList.add(coachWang);
        }
    }
}
