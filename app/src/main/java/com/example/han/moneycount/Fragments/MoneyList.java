package com.example.han.moneycount.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.han.moneycount.Adapter.MoneyCountLIstAdapter;
import com.example.han.moneycount.R;
import com.example.han.moneycount.ViewHolder.MoneyCountLIstViewHolder;

/**
 * Created by Han on 2017-11-08.
 */

public class MoneyList extends Fragment {

    RecyclerView recyclerView;
    MoneyCountLIstAdapter moneyCountLIstAdapter;
    LinearLayoutManager linearLayoutManager;

    public static MoneyList newInstance() {

        Bundle args = new Bundle();

        MoneyList fragment = new MoneyList();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.money_count_list, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.money_count_recyclerview);
        moneyCountLIstAdapter = new MoneyCountLIstAdapter();
        linearLayoutManager = new LinearLayoutManager(container.getContext(), LinearLayoutManager.VERTICAL, false);
        recyclerView.setAdapter(moneyCountLIstAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);
        return view;
    }
}
