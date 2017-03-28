package com.fuicuiedu.xc.listview_20170328;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * 自定义一个可以嵌套在ScrollView中的ListView
 */

public class MyListView extends ListView{
    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyListView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    //重写绘制方法，达到是ListView正确的嵌套在ScrollView中
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //自定义高度的测量规则
        int mySpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,MeasureSpec.AT_MOST);

//        测量规则，系统规定是用int类型的值来表示
//        一个int有32位（每位由0.1来组成）
//        32位的前两位，表示类型，00（未指定）,01（确定大小）,11（最大）
//        32位的后30位，表示大小
        super.onMeasure(widthMeasureSpec, mySpec);
    }
}
