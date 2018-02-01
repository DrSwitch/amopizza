package com.example.drswitch.amopizza.entity;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.example.drswitch.amopizza.R;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by DrSwitch on 31.01.2018.
 */

public class CategoryAdapter extends RecyclerView.Adapter<CategoryViewHolder> {

    private ArrayList<Category> categories;
    private Context context;

    public CategoryAdapter(ArrayList<Category> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }



    @Override
    public void onBindViewHolder(CategoryViewHolder holder, int i) {
        //Получаем элемент набора данных для заполнения
        Category currentCategory = categories.get(i);
        //Заполняем поля viewHolder'а данными из элемента набора данных
        holder.tvName.setText(currentCategory.getGr_name());

        Product[] products = currentCategory.getProducts();
        ArrayList<Product> productArrayList = new ArrayList<>(Arrays.asList(products));
        ProductAdapter productAdapter = new ProductAdapter(productArrayList, context);
        holder.rvProducts.setAdapter(productAdapter);
        holder.rvProducts.setLayoutManager(new LinearLayoutManager(context));

    }

    @Override
    public CategoryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView =
                LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_category, parent, false);
        return new CategoryViewHolder(itemView);
    }


    @Override
    public int getItemCount() {
        return categories.size();
    }
}
