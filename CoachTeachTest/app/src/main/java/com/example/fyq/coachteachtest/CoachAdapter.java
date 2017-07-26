package com.example.fyq.coachteachtest;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.fyq.coachteachtest.Coach;
import com.example.fyq.coachteachtest.R;

import java.util.List;

/**
 * Created by Meng on 2017/7/24.
 */

public class CoachAdapter extends ArrayAdapter<Coach> {
    private int resourceId;//教练对应的资源ID

    public CoachAdapter( Context context,  int resource,  List<Coach> objects) {
        super(context, resource, objects);
        resourceId=resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Coach coach=getItem(position);//实例化教练类
        View view;
        ViewHolder viewHolder;
        if(convertView==null){//如果是第一次初始化，用ViewHolder初始化，并存储
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);

            viewHolder=new ViewHolder();
            viewHolder.coachImage=(ImageView)view.findViewById(R.id.coach_pic);
            viewHolder.coachTextView=(TextView)view.findViewById(R.id.coach_name);
            view.setTag(viewHolder);
        }else {//下一次进入时直接读取
            view=convertView;
            viewHolder=(ViewHolder)view.getTag();
        }

        viewHolder.coachImage.setImageResource(coach.getImageId());//用get方法实例
        viewHolder.coachTextView.setText(coach.getName());

        return view;
    }
    class ViewHolder{
        ImageView coachImage;
        TextView coachTextView;
    }
}
