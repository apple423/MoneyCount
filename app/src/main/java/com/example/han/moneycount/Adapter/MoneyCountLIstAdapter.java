package com.example.han.moneycount.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.han.moneycount.R;
import com.example.han.moneycount.ViewHolder.MoneyCountLIstViewHolder;

/**
 * Created by Han on 2017-11-08.
 */

public class MoneyCountLIstAdapter extends RecyclerView.Adapter<MoneyCountLIstViewHolder> {


    @Override
    public MoneyCountLIstViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.money_count_list_recycler, parent, false);
        return new MoneyCountLIstViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MoneyCountLIstViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
