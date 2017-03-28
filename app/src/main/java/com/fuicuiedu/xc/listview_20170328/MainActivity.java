package com.fuicuiedu.xc.listview_20170328;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<String> datas;
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.main_lv);

        datas = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            datas.add("第" + i + "条数据");
        }

        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,datas);

        listView.setAdapter(adapter);

        setListViewHeight(listView);
    }


    //动态设置listView高度（计算所有item的总高度，设置给listView）
    public void setListViewHeight(ListView lv){
        //获取ListView的adapter
        ListAdapter listAdapter = lv.getAdapter();
        if (listAdapter == null){
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++) {
            //listAdapter.getCount()返回item的条数
            View item = listAdapter.getView(i,null,lv);  //看参数。。。ctrl + p
            //先绘制一下,计算item宽高
            item.measure(0,0);
            //统计所有子项总高度
            totalHeight += item.getMeasuredHeight();
        }

        //设置listView高度
        ViewGroup.LayoutParams params = lv.getLayoutParams();

//        listView.getDividerHeight()//获取分割线(分隔符)高度
        params.height = totalHeight + (lv.getDividerHeight() *  (listAdapter.getCount() - 1));

        lv.setLayoutParams(params);
    }

}
