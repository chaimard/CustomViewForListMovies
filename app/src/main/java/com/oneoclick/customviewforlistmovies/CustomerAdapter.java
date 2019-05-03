package com.oneoclick.customviewforlistmovies;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomerAdapter extends BaseAdapter {

    //
    private LayoutInflater layoutInflater;
    private Context context;
    private View view1;

    //constructor  ใช้คีย์ลัด alt+insert
    public CustomerAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }
    //

    @Override
    public int getCount() {
        return 30;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view1, ViewGroup parent) {

        if(view1 == null){
            view1 = layoutInflater.inflate(R.layout.layout_item, null);
        }
        return view1;
    }

    //inner class
    private class ViewHolder{
        public TextView title;
        public ImageView imageView;
        public TextView detail;
    }
    //


}//main
