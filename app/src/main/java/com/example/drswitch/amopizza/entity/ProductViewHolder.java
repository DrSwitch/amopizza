package com.example.drswitch.amopizza.entity;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.drswitch.amopizza.R;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class ProductViewHolder extends RecyclerView.ViewHolder {

    public TextView tvName;
    public TextView tvDesc;
    public TextView tvLabel_text;
    public ImageView imageView;
    public TextView tvSize_price;

    public ProductViewHolder(View itemView) {
        super(itemView);
        this.tvName = (TextView)itemView.findViewById(R.id.tvName);
        this.tvDesc = (TextView)itemView.findViewById(R.id.tvDesc);
        this.tvLabel_text = (TextView)itemView.findViewById(R.id.tvLabel_text);
        this.imageView = (ImageView)itemView.findViewById(R.id.imageView);
        this.tvSize_price = (TextView)itemView.findViewById(R.id.tvSize_price);
    }
}
