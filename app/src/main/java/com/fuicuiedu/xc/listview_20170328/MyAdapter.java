package com.fuicuiedu.xc.listview_20170328;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class MyAdapter extends BaseAdapter{
    @Override
    public int getCount() {
        return 0;
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
    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder viewHolder;
//        if (convertView == null){
//            convertView = 填充item布局;
//            viewHolder = new ViewHolder(convertView);
//            convertView.setTag(viewHolder);
//        }
//        viewHolder = (ViewHolder) convertView.getTag();
//
//        viewHolder.tv

        return convertView;
    }

    private class ViewHolder{
        TextView tv;

        public ViewHolder(View view){
            tv = (TextView) view.findViewById(R.id.text);
        }
    }
}
