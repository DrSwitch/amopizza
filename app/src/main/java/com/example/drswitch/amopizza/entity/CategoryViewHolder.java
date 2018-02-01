package com.example.drswitch.amopizza.entity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.drswitch.amopizza.R;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder {
    public TextView tvName;
    public TextView tvSurname;
    public RecyclerView rvProducts;

    public CategoryViewHolder(View itemView) {
        super(itemView);
        this.tvName = (TextView)itemView.findViewById(R.id.tvGr_name);
        this.tvSurname = (TextView)itemView.findViewById(R.id.tvSurname);
        this.rvProducts = (RecyclerView)itemView.findViewById(R.id.rvProduct);
    }
}
