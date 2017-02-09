package com.bwei.recycleview0208;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvlist);

        // 创建一个线性布局管理器

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        // 设置布局管理器

        recyclerView.setLayoutManager(layoutManager);

        // 创建数据集
        String[] dataset = new String[100];

        for (int i = 0; i < dataset.length; i++){

            dataset[i] = "item" + i;

        }

        // 创建Adapter，并指定数据集

        MyAdapter adapter = new MyAdapter(dataset);

        // 设置Adapter

        recyclerView.setAdapter(adapter);

    }
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        // 数据集
        private String[] mDataset;

        public MyAdapter(String[] dataset) {
            super();
            mDataset = dataset;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

            // 创建一个View，简单起见直接使用系统提供的布局，就是一个TextView

            View view = View.inflate(viewGroup.getContext(), R.layout.item, null);

            // 创建一个ViewHolder

            ViewHolder holder = new ViewHolder(view);

            return holder;

        }

        @Override
        public void onBindViewHolder(ViewHolder viewHolder, int i) {

            // 绑定数据到ViewHolder上

            viewHolder.mTextView.setText(mDataset[i]);

        }

        @Override
        public int getItemCount() {

            return mDataset.length;

        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public TextView mTextView;

            public ViewHolder(View itemView) {

                super(itemView);

//			mTextView = (TextView) itemView;
                mTextView = (TextView) itemView.findViewById(R.id.tv_item);

            }

        }
    }

