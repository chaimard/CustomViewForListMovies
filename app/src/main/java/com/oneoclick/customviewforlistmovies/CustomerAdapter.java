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
    //private View view1;
    private ViewHolder holder;

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
            //create View
            view1 = layoutInflater.inflate(R.layout.layout_item, null);
            holder = new ViewHolder();

            holder.title = (TextView) view1.findViewById(R.id.tv_title);
            holder.imageView = (ImageView) view1.findViewById(R.id.iv_image);
            holder.detail = (TextView) view1.findViewById(R.id.tv_detail);

            view1.setTag(holder);
        }else{
            holder = (ViewHolder) view1.getTag();
        }

        //set View
        holder.title.setText("Spidenman... :" + position);
        holder.detail.setText("The A season 2 detail..."+position);
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
