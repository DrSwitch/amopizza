package com.example.drswitch.amopizza.entity;

import android.content.Context;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.drswitch.amopizza.R;

import java.net.URL;
import java.util.ArrayList;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductViewHolder>  {
    private ArrayList<Product> products;
    private Context context;

    public ProductAdapter(ArrayList<Product> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @Override
    public void onBindViewHolder(ProductViewHolder holder, int position) {
        Product currentProduct = products.get(position);
        holder.tvName.setText(currentProduct.getName());
        holder.tvDesc.setText(currentProduct.getDesc());
        holder.tvLabel_text.setText(currentProduct.getLabel_text());

        Size_price[] size_prices = currentProduct.getSize_price();
        String size_price = "";
        if(size_prices.length == 0)
            holder.tvSize_price.setText("Без цены");
        if(size_prices.length > 0) {
            for (int i = 0; i < size_prices.length; i++) {
                size_price += size_prices[i].toString() + '\n';
            }
            holder.tvSize_price.setText(size_price);
        }

        Uri uri = Uri.parse(currentProduct.getImg_url());
        // Загружаем картинку

        Glide.with(context)
                .load(currentProduct.getImg_url())
                .into(holder.imageView);


    }

    @Override
    public ProductViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_product, parent, false);

        return new ProductViewHolder(itemView);
    }

    @Override
    public int getItemCount() {
        return products.size();
    }
}
