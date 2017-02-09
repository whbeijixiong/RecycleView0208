package com.bwei.recycleview0208;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import static android.R.attr.listDivider;

/**
 * 作    者 ： 文欢
 * 时    间 ： 2017/2/8.
 * 描    述 ：
 * 修改时间 ：
 */

public class DividerItemDecoration extends RecyclerView.ItemDecoration {

    private static final int[] ATTRS = new int[]{
            android.R.attr.listDivider
    };
    public static final int HORIZONTAL_LIST = LinearLayoutManager.HORIZONTAL;
    public static final int VERTICAL_LIST = LinearLayoutManager.VERTICAL;
    private Drawable mDivider;
    private int mOrientation;

    public DividerItemDecoration(Context context,int orientation){

    }
}
