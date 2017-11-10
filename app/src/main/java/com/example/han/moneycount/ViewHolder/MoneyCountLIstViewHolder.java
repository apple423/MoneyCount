package com.example.han.moneycount.ViewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.han.moneycount.R;

/**
 * Created by Han on 2017-11-08.
 */

public class MoneyCountLIstViewHolder extends RecyclerView.ViewHolder {
    ImageView moneyCountImageView;
    TextView moneyCountTextView;

    public MoneyCountLIstViewHolder(View itemView) {
        super(itemView);
        moneyCountImageView = (ImageView) itemView.findViewById(R.id.money_count_imageView);
        moneyCountTextView = (TextView) itemView.findViewById(R.id.money_count_textView);

    }
}
